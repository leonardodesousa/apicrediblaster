package com.crediblaster.entidades;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Enderecos")
public class Endereco {
	
	@Id
	@Column(name = "cd_cli")
	private Long id;
	
	@Column(name = "cep")
	private String cep;
	
	@Column(name = "logradouro")	
	private String logradouro;
	
	@Column(name = "numero")
	private String numero;
	
	@Column(name = "complemento")
	private String complemento;
	
	@Column(name = "bairro")
	private String bairro;
	
	@Column(name = "cidade")
	private String cidade;
	
	@Column(name = "estado")
	private String estado;
	
	@Column(name = "uf")
	private String uf;
	
	@Column(name = "tipo_Endereco")
	private int tipoEndereco;
	
	@Column(name = "flag_Correspondencia")
	private int flagCorrespondecia;
	
	@Column(name = "usuario_responsavel")
	private String usuarioResponsavel;
	
	@Column(name = "data_atualizacao")
	private LocalDateTime dataAtualizacao;
	
	public Endereco() {
		
	}

	public Endereco(Long codigoCliente, String cep, String logradouro, String numero,String complemento, String bairro, String cidade,
			String estado, String uf,int tipoEndereco, int flagCorrespondecia, String usuarioResponsavel, LocalDateTime dataAtualizacao) {
		super();
		this.id = codigoCliente;
		this.cep = cep;
		this.logradouro = logradouro;
		this.numero = numero;
		this.complemento = complemento;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
		this.uf = uf;
		this.tipoEndereco = tipoEndereco;
		this.flagCorrespondecia = flagCorrespondecia;
		this.usuarioResponsavel = usuarioResponsavel;
		this.dataAtualizacao = dataAtualizacao;			
	}
	
	
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

}
