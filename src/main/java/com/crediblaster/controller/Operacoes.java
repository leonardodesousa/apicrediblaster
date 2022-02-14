package com.crediblaster.controller;

import java.net.URI;
import java.util.Optional;

import javax.transaction.Transactional;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.crediblaster.controller.formularios.AlterarOperacaoFormulario;
import com.crediblaster.controller.formularios.AtualizaCadastroFormulario;
import com.crediblaster.controller.formularios.OperacaoFormulario;
import com.crediblaster.core.Cliente;
import com.crediblaster.core.OperacoesFinanceiras;
import com.crediblaster.dto.ClienteDTO;
import com.crediblaster.dto.EnderecoDTO;
import com.crediblaster.dto.NovaOperacaoDTO;
import com.crediblaster.dto.OperacaoDTO;
import com.crediblaster.dto.ParcelaDetalheDTO;
import com.crediblaster.dto.ParcelaSimulacaoDetalheDTO;
import com.crediblaster.entidades.Endereco;
import com.crediblaster.entidades.NovaOperacao;
import com.crediblaster.entidades.Operacao;
import com.crediblaster.entidades.Parcela;
import com.crediblaster.entidades.ParcelaSimulacao;
import com.crediblaster.repositorio.IncluirOperacaoRepository;
import com.crediblaster.repositorio.NovaOperacaoRepository;
import com.crediblaster.repositorio.OperacaoRepository;
import com.crediblaster.repositorio.ParcelaRepository;
import com.crediblaster.repositorio.ParcelaSimulacaoRepository;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/operacoes")
public class Operacoes {
	@Autowired
	private OperacaoRepository operecaoRepository;
	@Autowired
	private ParcelaSimulacaoRepository parcelaSimulacaoRepository;
	@Autowired
	private ParcelaRepository parcelaRepository;	
	@Autowired
	private NovaOperacaoRepository novaOperacaoRepository;	
	
		
	@ApiOperation(value = "Incluir uma nova operação")
	@PostMapping("/incluirOperacao")
	@Transactional
	public ResponseEntity<NovaOperacaoDTO>incluirOperacao(@RequestBody @Valid OperacaoFormulario form,  UriComponentsBuilder uriBuilder) {
		NovaOperacao operacao = form.converter(novaOperacaoRepository);	
		novaOperacaoRepository.save(operacao);
		System.out.println(operacao.getId());		
		//long id = operacao.getId();		
		//return detalharNovaOperacao(operacao.getId());
		return this.detalharNovaOperacao(operacao.getId());
		//NovaOperacaoDTO novaOperacao = new NovaOperacaoDTO();				
		//URI uri = uriBuilder.path("novaOperacao/{id}").buildAndExpand(id).toUri();
		//return ResponseEntity.created(uri).body(new NovaOperacaoDTO(novaOperacao.get()));
		/*Optional<NovaOperacao> novaOperacao = novaOperacaoRepository.findById(id);
		if(novaOperacao.isPresent()) {
			return ResponseEntity.ok(new NovaOperacaoDTO(novaOperacao.get()));
		}
		return ResponseEntity.notFound().build();*/		
	}
	
	@ApiOperation(value = "Busca nova operação de um determinado cliente")
	@GetMapping("novaOperacao/{id}")
	public ResponseEntity<NovaOperacaoDTO>detalharNovaOperacao(@PathVariable Long id){
		Optional<NovaOperacao> novaOperacao = novaOperacaoRepository.findById(id);
		if(novaOperacao.isPresent()) {
			return ResponseEntity.ok(new NovaOperacaoDTO(novaOperacao.get()));
		}
		return ResponseEntity.notFound().build();		
	}	
	
	@ApiOperation(value = "Alterar uma operação ainda em negociação")
	@PutMapping("/atualiza/{id}") 
	@Transactional
	public ResponseEntity<NovaOperacaoDTO> atualizarCadastro(@PathVariable Long id, @RequestBody @Valid AlterarOperacaoFormulario form){
		Optional<NovaOperacao> optional = novaOperacaoRepository.findById(id);
		if(optional.isPresent()) {
			NovaOperacao operacao = form.converter(novaOperacaoRepository);
			return detalharNovaOperacao(operacao.getId());
		}
		return ResponseEntity.notFound().build();
		
	}
	
	@ApiOperation(value = "Retorna as parcelas de um contrato já efetivado")
	@GetMapping("detalheParcelas/{id}")	
	public Page<ParcelaDetalheDTO> detalharParcela(@PathVariable Long id, @PageableDefault(sort = "parcela", direction = Direction.ASC, page = 0, size = 120) Pageable paginacao){
		Page<Parcela> parcelas = parcelaRepository.findByContratoId(id, paginacao);		
		return ParcelaDetalheDTO.Converter(parcelas);		
	}
	
	@ApiOperation(value = "Simula as parcelas de um contrato ainda em negociação ")
	@GetMapping("detalheParcelasSimulacao/{id}")
	public Page<ParcelaSimulacaoDetalheDTO> detalharParcelaSimulacao(@PathVariable Long id, @PageableDefault(sort = "parcela", direction = Direction.ASC, page = 0, size = 120) Pageable paginacao){		
		Page<ParcelaSimulacao> parcelas = parcelaSimulacaoRepository.findByContratoId(id, paginacao);
		return ParcelaSimulacaoDetalheDTO.Converter(parcelas);
	}
	
	@ApiOperation(value = "Exclui uma operação não efetivada")
	@DeleteMapping("/excluirOperacao/{id}")
	@Transactional
	public ResponseEntity<?> removerOperacao(@PathVariable Long id){
		Optional<Operacao> optional = operecaoRepository.findById(id);
		if(optional.isPresent()) {
			operecaoRepository.deleteById(id);
			return ResponseEntity.ok().build();
		}
		return ResponseEntity.notFound().build();
	}
	

	
	@ApiOperation(value = "Retorna detalhes de um contrato já efetivado ou em negociação")
	@GetMapping("/{id}") 
	public ResponseEntity<OperacaoDTO> detalharOperacao(@PathVariable Long id) {		
		Optional<Operacao> operacao = operecaoRepository.findById(id);
		if(operacao.isPresent()) {
			return ResponseEntity.ok(new OperacaoDTO(operacao.get()));			
		}
		return ResponseEntity.notFound().build();		
	}
}
