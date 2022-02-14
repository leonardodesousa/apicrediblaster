package com.crediblaster.dto;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;

import com.crediblaster.core.Cliente;



public class ClienteDTO {	
	private long id;	
	private int codigoEmpresa;	
	private int codigoUnidade;
	private String nome;	
	private String email;	
	private char situacao;	
	private LocalDateTime dataCadastro;	
	private LocalDateTime dataAtualizacao;	
	private String cpfCnpj;	
	private char tipoPessoa;
	private String usuarioResponsavel;
	
	public ClienteDTO() {
		//Construtor default		
	}	
	
	public ClienteDTO(Cliente cliente) {
		super();
		this.id = cliente.getCodigoCliente();
		this.codigoEmpresa = cliente.getCodigoEmpresa();
		this.codigoUnidade = cliente.getCodigoUnidade();
		this.nome = cliente.getNome();
		this.email = cliente.getEmail();
		this.situacao = cliente.getSituacao();
		this.dataCadastro = cliente.getDataCadastro();
		this.dataAtualizacao = cliente.getDataAtualizacao();
		this.cpfCnpj = cliente.getCpfCnpj();
		this.tipoPessoa = cliente.getTipoPessoa();
		this.usuarioResponsavel = cliente.getUsuarioResponsavel();
	}

	public long getCodigoCliente() {
		return id;
	}

	public int getCodigoEmpresa() {
		return codigoEmpresa;
	}

	public int getCodigoUnidade() {
		return codigoUnidade;
	}

	public String getNome() {
		return nome;
	}

	public String getEmail() {
		return email;
	}

	public char getSituacao() {
		return situacao;
	}

	public LocalDateTime getDataCadastro() {
		return dataCadastro;
	}

	public LocalDateTime getDataAtualizacao() {
		return dataAtualizacao;
	}

	public String getCpfCnpj() {
		return cpfCnpj;
	}

	public char getTipoPessoa() {
		return tipoPessoa;
	}

	public String getUsuarioResponsavel() {
		return usuarioResponsavel;
	}

	public void setUsuarioResponsavel(String usuarioResponsavel) {
		this.usuarioResponsavel = usuarioResponsavel;
	}

	public static Page<ClienteDTO> Converter(Page<Cliente> clientes) {	
		return clientes.map(ClienteDTO::new);
	}	

}
