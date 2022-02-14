package com.crediblaster.dto;


import java.time.LocalDateTime;
import java.util.Date;

import javax.persistence.Id;

import org.springframework.data.domain.Page;

import com.crediblaster.entidades.Operacao;

public class OperacaoDTO {
	@Id
	private long numeroContrato;
	private int codigoCliente;
	private int empresa;	
	private int codigoUnidade;
	private String nomeCliente;	
	private LocalDateTime dataInclusao;	
	private int quantidadeAmortizacao;	
	private String cpfCnpj;	
	private float taxaJuros;	
	private double valorJuros;	
	private int carencia;	
	private double valorOriginal;	
	private double valorLiquido;	
	private String situacao;
	private LocalDateTime dataEfetivacao;	
	private int prazoTotal;	
	private LocalDateTime dataHoraAtualizacao;
	private String metodoCalculo;
	
	
	public OperacaoDTO(Operacao operacao) {
		this.empresa = operacao.getEmpresa();
		this.codigoCliente = operacao.getCodigoCliente();
		this.codigoUnidade = operacao.getCodigoUnidade();
		this.nomeCliente = operacao.getNomeCliente();
		this.dataInclusao = operacao.getDataInclusao();
		this.quantidadeAmortizacao = operacao.getQuantidadeAmortizacao();
		this.numeroContrato = operacao.getNumeroContrato();
		this.cpfCnpj = operacao.getCpfCnpj();
		this.taxaJuros = operacao.getTaxaJuros();
		this.valorJuros = operacao.getValorJuros();
		this.carencia = operacao.getCarencia();
		this.valorOriginal = operacao.getValorOriginal();
		this.valorLiquido = operacao.getValorLiquido();
		this.situacao = operacao.getSituacao();
		this.dataEfetivacao = operacao.getDataEfetivacao();
		this.prazoTotal = operacao.getPrazoTotal();
		this.dataHoraAtualizacao = operacao.getDataHoraAtualizacao();
		this.metodoCalculo = operacao.getMetodoCalculo();
		
		
	}	

	public String getMetodoCalculo() {
		return metodoCalculo;
	}

	public void setMetodoCalculo(String metodoCalculo) {
		this.metodoCalculo = metodoCalculo;
	}

	public int getCodigoCliente() {
		return codigoCliente;
	}

	public void setCodigoCliente(int codigoCliente) {
		this.codigoCliente = codigoCliente;
	}

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

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public LocalDateTime getDataInclusao() {
		return dataInclusao;
	}

	public void setDataInclusao(LocalDateTime dataInclusao) {
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

	public void setNumeroContrato(int numeroContrato) {
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

	public LocalDateTime getDataEfetivacao() {
		return dataEfetivacao;
	}

	public void setDataEfetivacao(LocalDateTime dataEfetivacao) {
		this.dataEfetivacao = dataEfetivacao;
	}

	public int getPrazoTotal() {							
		return prazoTotal;
	}

	public void setPrazoTotal(int prazoTotal) {
		this.prazoTotal = prazoTotal;
	}

	public LocalDateTime getDataHoraAtualizacao() {
		return dataHoraAtualizacao;
	}

	public void setDataHoraAtualizacao(LocalDateTime dataHoraAtualizacao) {
		this.dataHoraAtualizacao = dataHoraAtualizacao;
	}
	
	public static Page<OperacaoDTO> Converter(Page<Operacao> operacoes) {	
		return operacoes.map(OperacaoDTO::new);
	}
	
	

}
