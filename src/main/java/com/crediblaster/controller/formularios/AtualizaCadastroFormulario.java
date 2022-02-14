package com.crediblaster.controller.formularios;

import java.time.LocalDateTime;

import com.crediblaster.core.Cliente;
import com.crediblaster.repositorio.ClienteRepository;

public class AtualizaCadastroFormulario {
	//private Long id;		
	private String nome;
	private String email;
	private char situacao;
	private String usuarioResponsavel;
	private LocalDateTime dataAtualizacao;	 
		
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public char getSituacao() {
		return situacao;
	}
	
	public void setSituacao(char situacao) {
		this.situacao = situacao;
	}
	
	public LocalDateTime getDataAtualizacao() {
		return dataAtualizacao;
	}
	
	public void setDataAtualizacao(LocalDateTime dataAtualizacao) {
		this.dataAtualizacao = dataAtualizacao;
	}
		
	public String getUsuarioResponsavel() {
		return usuarioResponsavel;
	}

	public void setUsuarioResponsavel(String usuarioResponsavel) {
		this.usuarioResponsavel = usuarioResponsavel;
	}

	public Cliente atualizar(Long id, ClienteRepository clienteRepository) {
		Cliente cliente = clienteRepository.getOne(id);
		cliente.setNome(this.nome);
		cliente.setEmail(this.email);
		cliente.setSituacao(this.situacao);
		cliente.setDataAtualizacao(this.dataAtualizacao);
		cliente.setUsuarioResponsavel(this.usuarioResponsavel);
		return cliente;
	}	

}
