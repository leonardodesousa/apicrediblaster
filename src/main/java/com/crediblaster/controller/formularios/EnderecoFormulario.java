package com.crediblaster.controller.formularios;

import java.time.LocalDateTime;

import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.crediblaster.entidades.Endereco;
import com.crediblaster.repositorio.EnderecosRepository;

public class EnderecoFormulario {
	
	@Id @OneToMany
	private Long id;	
	private String cep;	
	private String logradouro;
	private String numero;
	private String complemento;
	private String bairro;
	private String cidade;
	private String estado;
	private String uf;
	@Id
	private int tipoEndereco;
	private int flagCorrespondecia;	
	private String usuarioResponsavel;
	private LocalDateTime dataAtualizacao;
		
		
	public String getUsuarioResponsavel() {
		return usuarioResponsavel;
	}
	public void setUsuarioResponsavel(String usuarioResponsavel) {
		this.usuarioResponsavel = usuarioResponsavel;
	}
	public LocalDateTime getDataAtualizacao() {
		return dataAtualizacao;
	}
	public void setDataAtualizacao(LocalDateTime dataAtualizacao) {
		this.dataAtualizacao = dataAtualizacao;
	}
	public String getUf() {
		return uf;
	}
	public void setUf(String uf) {
		this.uf = uf;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public Long getCodigoCliente() {
		return id;
	}
	public void setCodigoCliente(Long id) {
		this.id = id;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public int getTipoEndereco() {
		return tipoEndereco;
	}
	public void setTipoEndereco(int tipoEndereco) {
		this.tipoEndereco = tipoEndereco;
	}
	public int getFlagCorrespondecia() {
		return flagCorrespondecia;
	}
	public void setFlagCorrespondecia(int flagCorrespondecia) {
		this.flagCorrespondecia = flagCorrespondecia;
	}
	
	public Endereco converter (EnderecosRepository enderecosRepository) {
		return new Endereco(id,cep,	logradouro, numero, complemento, bairro, cidade, estado, uf, tipoEndereco, flagCorrespondecia, usuarioResponsavel, dataAtualizacao);
	}

}
