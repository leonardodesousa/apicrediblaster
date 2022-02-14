package com.crediblaster.core;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class OperacaoResponse {
	private int empresa;	
	private int codigoUnidade;
	private int nomeCliente;	
	private Date dataInclusao;	
	private int quantidadeAmortizacao;
	@Id
	private long numeroContrato;
	private String cpfCnpj;	
	private float taxaJuros;	
	private double valorJuros;	
	private int carencia;	
	private double valorOriginal;	
	private double valorLiquido;	
	private String situacao;
	private Date dataEfetivacao;	
	private int prazoTotal;	
	private Date dataHoraAtualizacao;
	public int getEmpresa() {
		return empresa;
	}
	public void setEmpresa(int empresa) {
		this.empresa = empresa;
	}
	public int getCodigoUnidade() {
		return codigoUnidade;
	}
	public void setCodigoUnidade(int codigoUnidade) {
		this.codigoUnidade = codigoUnidade;
	}
	public int getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(int nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public Date getDataInclusao() {
		return dataInclusao;
	}
	public void setDataInclusao(Date dataInclusao) {
		this.dataInclusao = dataInclusao;
	}
	public int getQuantidadeAmortizacao() {
		return quantidadeAmortizacao;
	}
	public void setQuantidadeAmortizacao(int quantidadeAmortizacao) {
		this.quantidadeAmortizacao = quantidadeAmortizacao;
	}
	public long getNumeroContrato() {
		return numeroContrato;
	}
	public void setNumeroContrato(long numeroContrato) {
		this.numeroContrato = numeroContrato;
	}
	public String getCpfCnpj() {
		return cpfCnpj;
	}
	public void setCpfCnpj(String cpfCnpj) {
		this.cpfCnpj = cpfCnpj;
	}
	public float getTaxaJuros() {
		return taxaJuros;
	}
	public void setTaxaJuros(float taxaJuros) {
		this.taxaJuros = taxaJuros;
	}
	public double getValorJuros() {
		return valorJuros;
	}
	public void setValorJuros(double valorJuros) {
		this.valorJuros = valorJuros;
	}
	public int getCarencia() {
		return carencia;
	}
	public void setCarencia(int carencia) {
		this.carencia = carencia;
	}
	public double getValorOriginal() {
		return valorOriginal;
	}
	public void setValorOriginal(double valorOriginal) {
		this.valorOriginal = valorOriginal;
	}
	public double getValorLiquido() {
		return valorLiquido;
	}
	public void setValorLiquido(double valorLiquido) {
		this.valorLiquido = valorLiquido;
	}
	public String getSituacao() {
		return situacao;
	}
	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}
	public Date getDataEfetivacao() {
		return dataEfetivacao;
	}
	public void setDataEfetivacao(Date dataEfetivacao) {
		this.dataEfetivacao = dataEfetivacao;
	}
	public int getPrazoTotal() {
		return prazoTotal;
	}
	public void setPrazoTotal(int prazoTotal) {
		this.prazoTotal = prazoTotal;
	}
	public Date getDataHoraAtualizacao() {
		return dataHoraAtualizacao;
	}
	public void setDataHoraAtualizacao(Date dataHoraAtualizacao) {
		this.dataHoraAtualizacao = dataHoraAtualizacao;
	}
	
	

}
