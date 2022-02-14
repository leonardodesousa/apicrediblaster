package com.crediblaster.dto;

import java.time.LocalDateTime;

import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.springframework.data.domain.Page;

import com.crediblaster.entidades.Endereco;

public class EnderecoDTO {
	
	@Id @OneToMany
	private Long id;	
	private String cep;	
	private String logradouro;
	private String complemento;
	private String numero;
	private String bairro;
	private String cidade;
	private String estado;
	private String uf;	
	@Id
	private int tipoEndereco;
	private int flagCorrespondecia;	
	private String usuarioResponsavel;
	private LocalDateTime dataAtualizacao;
	
	public EnderecoDTO(Endereco endereco) {
		super();
		this.id = endereco.getCodigoCliente();
		this.cep = endereco.getCep();
		this.logradouro = endereco.getLogradouro();
		this.numero = endereco.getNumero();
		this.complemento = endereco.getComplemento();
		this.bairro = endereco.getBairro();
		this.cidade = endereco.getCidade();
		this.estado = endereco.getEstado();
		this.uf = endereco.getUf();
		this.tipoEndereco = endereco.getTipoEndereco();
		this.flagCorrespondecia = endereco.getFlagCorrespondecia();	
		this.usuarioResponsavel = endereco.getUsuarioResponsavel();
		this.dataAtualizacao = endereco.getDataAtualizacao();
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

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
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

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
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
	
	public static Page<EnderecoDTO> Converter(Page<Endereco> enderecos){
		return enderecos.map(EnderecoDTO::new);
	}
	

}
