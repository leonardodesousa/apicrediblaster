package com.crediblaster.core;

import javax.persistence.Entity;
import javax.persistence.Id;

import java.time.LocalDateTime;

@Entity
public class Resposta {
	
	@Id
	private long numeroContrato;	
	private String nossoNumero;	
	private int codigoCliente;	
	private int codigoEmpresa;	
	private int codigoUnidade;	
	private LocalDateTime dataSimulacao;	
	private int numeroParcela;		
	private String cpfCnpj;	
	private float taxaJuros;	
	private Double valorParcela;	
	private Double valorTotalParcela;	
	private LocalDateTime dataVencimento;	
	private String situacaoParcela;	
	private LocalDateTime dataPagamento;	
	private Double valorPago;	
	private Double valorDesconto;	
	private Double valorJurosPago;
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nossoNumero == null) ? 0 : nossoNumero.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Resposta other = (Resposta) obj;
		if (nossoNumero == null) {
			if (other.nossoNumero != null)
				return false;
		} else if (!nossoNumero.equals(other.nossoNumero))
			return false;
		return true;
	}
	
	
	public long getNumeroContrato() {
		return numeroContrato;
	}
	public void setNumeroContrato(long numeroContrato) {
		this.numeroContrato = numeroContrato;
	}
	public String getNossoNumero() {
		return nossoNumero;
	}
	public void setNossoNumero(String nossoNumero) {
		this.nossoNumero = nossoNumero;
	}
	public int getCodigoCliente() {
		return codigoCliente;
	}
	public void setCodigoCliente(int codigoCliente) {
		this.codigoCliente = codigoCliente;
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
	public LocalDateTime getDataSimulacao() {
		return dataSimulacao;
	}
	public void setDataSimulacao(LocalDateTime dataSimulacao) {
		this.dataSimulacao = dataSimulacao;
	}
	public int getParcela() {
		return numeroParcela;
	}
	public void setParcela(int parcela) {
		this.numeroParcela = parcela;
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
	public Double getValorParcela() {
		return valorParcela;
	}
	public void setValorParcela(Double valorParcela) {
		this.valorParcela = valorParcela;
	}
	public Double getValorTotalParcela() {
		return valorTotalParcela;
	}
	public void setValorTotalParcela(Double valorTotalParcela) {
		this.valorTotalParcela = valorTotalParcela;
	}
	public LocalDateTime getDataVencimento() {
		return dataVencimento;
	}
	public void setDataVencimento(LocalDateTime dataVencimento) {
		this.dataVencimento = dataVencimento;
	}
	public String getSituacaoParcela() {
		return situacaoParcela;
	}
	public void setSituacaoParcela(String situacaoParcela) {
		this.situacaoParcela = situacaoParcela;
	}
	public LocalDateTime getDataPagamento() {
		return dataPagamento;
	}
	public void setDataPagamento(LocalDateTime dataPagamento) {
		this.dataPagamento = dataPagamento;
	}
	public Double getValorPago() {
		return valorPago;
	}
	public void setValorPago(Double valorPago) {
		this.valorPago = valorPago;
	}
	public Double getValorDesconto() {
		return valorDesconto;
	}
	public void setValorDesconto(Double valorDesconto) {
		this.valorDesconto = valorDesconto;
	}
	public Double getValorJurosPago() {
		return valorJurosPago;
	}
	public void setValorJurosPago(Double valorJurosPago) {
		this.valorJurosPago = valorJurosPago;
	}
	


}
