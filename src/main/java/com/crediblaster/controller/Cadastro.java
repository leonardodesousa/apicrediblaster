package com.crediblaster.controller;

import java.net.URI;
import java.util.Optional;

import javax.transaction.Transactional;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.crediblaster.controller.formularios.AtualizaCadastroFormulario;
import com.crediblaster.controller.formularios.CadastroFormulario;
import com.crediblaster.core.Cliente;
import com.crediblaster.dto.ClienteDTO;
import com.crediblaster.repositorio.ClienteRepository;

import io.swagger.annotations.ApiOperation;



@RestController
@RequestMapping("/cadastro")
public class Cadastro {
	
	@Autowired
	private ClienteRepository clienteRepository;	
	
	@ApiOperation(value = "Retorna uma lista de pessoas ou uma pessoa pelo código cliente")		
	@GetMapping
	public Page<ClienteDTO> BuscarClientes(@RequestParam(required = false) Long id
			, @PageableDefault(sort = "id", direction = Direction.DESC, page = 0, size = 120) Pageable paginacao ){
		if(id == null) {
			Page<Cliente> clientes = clienteRepository.findAll(paginacao);
			return ClienteDTO.Converter(clientes);
		} else {
			Page<Cliente> clientes = clienteRepository.findById(id, paginacao);
			return ClienteDTO.Converter(clientes);		
		}
	}	
	
	@ApiOperation(value = "Atualiza um cadastro")
	@PutMapping("/atualiza/{id}") 
	@Transactional
	public ResponseEntity<ClienteDTO> atualizarCadastro(@PathVariable Long id, @RequestBody @Valid AtualizaCadastroFormulario form){
		Optional<Cliente> optional = clienteRepository.findById(id);
		if(optional.isPresent()) {
			Cliente cliente = form.atualizar(id, clienteRepository);
			return ResponseEntity.ok(new ClienteDTO(cliente));
		}
		return ResponseEntity.notFound().build();
		
	}
	
	@ApiOperation(value = "Cadastra um novo cliente")
	@PostMapping("incluirCliente")
	@Transactional
	public ResponseEntity<ClienteDTO> cadastrarCliente(@RequestBody @Valid CadastroFormulario form ,UriComponentsBuilder uriBuilder){
		Cliente cliente = form.converter(clienteRepository);
		clienteRepository.save(cliente);
		
		URI uri = uriBuilder.path("/cadastro/{id}").buildAndExpand(cliente.getCodigoCliente()).toUri();
		return ResponseEntity.created(uri).body(new ClienteDTO(cliente));
		
	}	

}
