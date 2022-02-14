package com.crediblaster.controller;

import java.net.URI;

import javax.transaction.Transactional;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.crediblaster.controller.formularios.CadastroFormulario;
import com.crediblaster.controller.formularios.EnderecoFormulario;
import com.crediblaster.core.Cliente;
import com.crediblaster.dto.ClienteDTO;
import com.crediblaster.dto.EnderecoDTO;
import com.crediblaster.entidades.Endereco;
import com.crediblaster.repositorio.EnderecosRepository;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/enderecos")
public class Enderecos {
	
	@Autowired
	private EnderecosRepository enderecosRepository;
	
	@ApiOperation(value = "Retorna o endereço de um cliente através do código cliente informado")
	@GetMapping("/buscar/{id}")
	public Page<EnderecoDTO> BuscarEnderecos(Long id, Pageable paginacao){
		Page<Endereco> enderecos = enderecosRepository.findById(id, paginacao);
		return EnderecoDTO.Converter(enderecos);		
	}
	
	@ApiOperation(value = "Cadastra um novo endereço para um cliente")
	@PostMapping
	@Transactional
	public ResponseEntity<EnderecoDTO> cadastrarEndereco(@RequestBody @Valid EnderecoFormulario form, UriComponentsBuilder uriBuilder){
		Endereco endereco = form.converter(enderecosRepository);
		enderecosRepository.save(endereco);
		
		URI uri = uriBuilder.path("/enderecos/{id}").buildAndExpand(endereco.getCodigoCliente()).toUri();
		return ResponseEntity.created(uri).body(new EnderecoDTO(endereco));
	}	
		
}
