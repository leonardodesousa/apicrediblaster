package com.crediblaster.core;

import javax.persistence.Column;
import java.time.LocalDateTime;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "t400clie")
public class Cliente {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "S_CD_CLI")
	@Column(name = "cd_cli")
	private Long id;
	
	@Column(name = "cd_emp")
	private int codigoEmpresa;
	
	@Column(name = "cd_und")
	private int codigoUnidade;
	
	@Column(name = "nm_cli")
	private String nome;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "id_sit")
	private char situacao;
	
	@Column(name = "dt_cad")
	private LocalDateTime dataCadastro;
	
	@Column(name = "dt_ult_atu")
	private LocalDateTime dataAtualizacao;
	
	@Column(name = "nr_cic")
	private String cpfCnpj;
	
	@Column(name = "id_tp_pes")
	private char tipoPessoa;
	
	@Column(name = "USUARIO_RESPONSAVEL")
	private String usuarioResponsavel;
	
	@Override
	public int hashCode() {
		final int prime = 31;
		long result = 1;
		result = prime * result + id;
		return (int) result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
	public Cliente() {
		
	}
    
	public Cliente(Long codigoCliente, int codigoEmpresa, int codigoUnidade, String nome, String email, char situacao,
			LocalDateTime dataCadastro, LocalDateTime dataAtualizacao, String cpfCnpj, char tipoPessoa, String usuarioResponsavel) {
		super();
		this.id = codigoCliente;
		this.codigoEmpresa = codigoEmpresa;
		this.codigoUnidade = codigoUnidade;
		this.nome = nome;
		this.email = email;
		this.situacao = situacao;
		this.dataCadastro = dataCadastro;
		this.dataAtualizacao = dataAtualizacao;
		this.cpfCnpj = cpfCnpj;
		this.tipoPessoa = tipoPessoa;
		this.usuarioResponsavel = usuarioResponsavel;
	}
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	public String getUsuarioResponsavel() {
		return usuarioResponsavel;
	}
	public void setUsuarioResponsavel(String usuarioResponsavel) {
		this.usuarioResponsavel = usuarioResponsavel;
	}

	public long getCodigoCliente() {
		return id;
	}


	public void setCodigoCliente(Long codigoCliente) {
		this.id = codigoCliente;
	}


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
	
	

}
