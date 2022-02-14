package com.crediblaster.entidades;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "agencias")
public class Agencia {
	
	@Column(name = "empresa")
	private int empresa;
		
	@Id
	@Column(name = "unidade")
	private int unidade; 
	
	@Column(name = "descricaoagencia")
	private String descricaoAgencia;
	
	@Column(name = "dataultimoprocessamento")
	private Date dataUltimoProcessamento;
	
	@Column(name = "dataAtual")
	private Date dataAtual;
	
	@Column(name = "dataproximoprocessamento")
	private Date dataProximoProcessamento;
	
	@Column(name = "processamentoiniciado")
	private boolean processamentoIniciado;
	
	@Column(name = "inicioprocessamento")
	private Date inicioProcessamento;
	
	@Column(name = "fimprocessamento")
	private Date fimProcessamento;
	
	@Column(name = "usuario")
	private String usuario;
	
	public Agencia() {
		
	}

	public Agencia(int empresa, int unidade, String descricaoAgencia, Date dataUltimoProcessamento, Date dataAtual,
			Date dataProximoProcessamento, boolean processamentoIniciado, Date inicioProcessamento,
			Date fimProcessamento, String usuario) {
		super();
		this.empresa = empresa;
		this.unidade = unidade;
		this.descricaoAgencia = descricaoAgencia;
		this.dataUltimoProcessamento = dataUltimoProcessamento;
		this.dataAtual = dataAtual;
		this.dataProximoProcessamento = dataProximoProcessamento;
		this.processamentoIniciado = processamentoIniciado;
		this.inicioProcessamento = inicioProcessamento;
		this.fimProcessamento = fimProcessamento;
		this.usuario = usuario;
	}

	public int getEmpresa() {
		return empresa;
	}

	public void setEmpresa(int empresa) {
		this.empresa = empresa;
	}

	public int getUnidade() {
		return unidade;
	}

	public void setUnidade(int unidade) {
		this.unidade = unidade;
	}

	public String getDescricaoAgencia() {
		return descricaoAgencia;
	}

	public void setDescricaoAgencia(String descricaoAgencia) {
		this.descricaoAgencia = descricaoAgencia;
	}

	public Date getDataUltimoProcessamento() {
		return dataUltimoProcessamento;
	}

	public void setDataUltimoProcessamento(Date dataUltimoProcessamento) {
		this.dataUltimoProcessamento = dataUltimoProcessamento;
	}

	public Date getDataAtual() {
		return dataAtual;
	}

	public void setDataAtual(Date dataAtual) {
		this.dataAtual = dataAtual;
	}

	public Date getDataProximoProcessamento() {
		return dataProximoProcessamento;
	}

	public void setDataProximoProcessamento(Date dataProximoProcessamento) {
		this.dataProximoProcessamento = dataProximoProcessamento;
	}

	public boolean isProcessamentoIniciado() {
		return processamentoIniciado;
	}

	public void setProcessamentoIniciado(boolean processamentoIniciado) {
		this.processamentoIniciado = processamentoIniciado;
	}

	public Date getInicioProcessamento() {
		return inicioProcessamento;
	}

	public void setInicioProcessamento(Date inicioProcessamento) {
		this.inicioProcessamento = inicioProcessamento;
	}

	public Date getFimProcessamento() {
		return fimProcessamento;
	}

	public void setFimProcessamento(Date fimProcessamento) {
		this.fimProcessamento = fimProcessamento;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	

}
