package com.crediblaster.controller.formularios;

import java.time.LocalDateTime;
import java.util.Optional;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.data.domain.Page;

import com.crediblaster.core.Cliente;
import com.crediblaster.dto.ClienteDTO;
import com.crediblaster.repositorio.CadastroRepository;
import com.crediblaster.repositorio.ClienteRepository;



public class CadastroFormulario {
	
	
	Long id;
	//@NotNull @NotEmpty @NotBlank @Length(max = 3)
	private int codigoEmpresa;
	//@NotNull @NotEmpty @NotBlank// @Length(max = 3)
	private int codigoUnidade;
	//@NotNull @NotEmpty @NotBlank //@Length(min = 5)
	private String nome;
	private String email;
	private char situacao;
	private LocalDateTime dataCadastro;
	private LocalDateTime dataAtualizacao;
	//@NotNull @NotEmpty @NotBlank @Length(min = 11, max = 14)
	private String cpfCnpj;
	//@NotNull @NotEmpty @NotBlank @Length(max = 3)
	private char tipoPessoa;	
	private String usuarioResponsavel;
		
	public int getCodigoEmpresa() {
		return codigoEmpresa;
	}
	public void setCodigoEmpresa(int codigoEmpresa) {
		this.codigoEmpresa = codigoEmpresa;
	}
	public int getCodigoUnidade() {
		return codigoUnidade;
	}
	public void setCodigoUnidade(int codigoUnidade) {
		this.codigoUnidade = codigoUnidade;
	}
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
	public LocalDateTime getDataCadastro() {
		return dataCadastro;
	}
	public void setDataCadastro(LocalDateTime dataCadastro) {
		this.dataCadastro = dataCadastro;
	}
	public LocalDateTime getDataAtualizacao() {
		return dataAtualizacao;
	}
	public void setDataAtualizacao(LocalDateTime dataAtualizacao) {
		this.dataAtualizacao = dataAtualizacao;
	}
	public String getCpfCnpj() {
		return cpfCnpj;
	}
	public void setCpfCnpj(String cpfCnpj) {
		this.cpfCnpj = cpfCnpj;
	}
	public char getTipoPessoa() {
		return tipoPessoa;
	}
	public void setTipoPessoa(char tipoPessoa) {
		this.tipoPessoa = tipoPessoa;
	}	
	
	public String getUsuarioResponsavel() {
		return usuarioResponsavel;
	}
	public void setUsuarioResponsavel(String usuarioResponsavel) {
		this.usuarioResponsavel = usuarioResponsavel;
	}
	public Cliente converter (ClienteRepository clienteRepository) {		
		return new Cliente(id, codigoEmpresa, codigoUnidade , nome, email, situacao, dataCadastro, dataAtualizacao, cpfCnpj, tipoPessoa, usuarioResponsavel);						
	}
}
