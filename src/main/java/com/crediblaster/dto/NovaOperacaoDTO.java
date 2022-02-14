package com.crediblaster.dto;

import org.springframework.data.domain.Page;

import com.crediblaster.entidades.NovaOperacao;

public class NovaOperacaoDTO {
	
	long CodigoCliente;
	int quantidadeParcelas;
	float taxaJuros;
	int carencia;
	double valor;
	long numeroContrato;	
	
	public NovaOperacaoDTO(long codigoCliente, int quantidadeParcelas, float taxaJuros, int carencia, double valor, long numeroContrato) {
		super();
		this.CodigoCliente = codigoCliente;
		this.quantidadeParcelas = quantidadeParcelas;
		this.taxaJuros = taxaJuros;
		this.carencia = carencia;
		this.valor = valor;
		this.numeroContrato = numeroContrato;
	}
	
	public NovaOperacaoDTO(NovaOperacao operacao) {		
		this.CodigoCliente = operacao.getId();
		this.quantidadeParcelas = operacao.getQuantidadeParcelas();
		this.taxaJuros = operacao.getTaxaJuros();
		this.carencia = operacao.getCarencia();
		this.valor = operacao.getValorContrato();
		this.numeroContrato = operacao.getNumeroContrato();
	}	
		
	
	public long getNumeroContrato() {
		return numeroContrato;
	}

	public void setNumeroContrato(long numeroContrato) {
		this.numeroContrato = numeroContrato;
	}

	public long getCodigoCliente() {
		return CodigoCliente;
	}
	public void setCodigoCliente(long codigoCliente) {
		CodigoCliente = codigoCliente;
	}
	public int getQuantidadeParcelas() {
		return quantidadeParcelas;
	}
	public void setQuantidadeParcelas(int quantidadeParcelas) {
		this.quantidadeParcelas = quantidadeParcelas;
	}
	public float getTaxaJuros() {
		return taxaJuros;
	}
	public void setTaxaJuros(float taxaJuros) {
		this.taxaJuros = taxaJuros;
	}
	public int getCarencia() {
		return carencia;
	}
	public void setCarencia(int carencia) {
		this.carencia = carencia;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public static Page<NovaOperacaoDTO> converter(Page<NovaOperacao> operacao){
		return operacao.map(NovaOperacaoDTO::new);
	}
	

}
