package com.crediblaster.controller.formularios;

import com.crediblaster.entidades.NovaOperacao;
import com.crediblaster.repositorio.NovaOperacaoRepository;

public class AlterarOperacaoFormulario {
	private long codigoCliente;
	private int quantidadeParcelas;
	private float taxaJuros;
	private int carencia;
	private double valor;
	private String medotoCalculo;
	private long numeroContrato;	
	
	public long getCodigoCliente() {
		return codigoCliente;
	}
	public void setCodigoCliente(long codigoCliente) {
		this.codigoCliente = codigoCliente;
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
	public String getMedotoCalculo() {
		return medotoCalculo;
	}
	public void setMedotoCalculo(String medotoCalculo) {
		this.medotoCalculo = medotoCalculo;
	}
	public long getNumeroContrato() {
		return numeroContrato;
	}
	public void setNumeroContrato(long numeroContrato) {
		this.numeroContrato = numeroContrato;
	}
	
	public NovaOperacao converter(NovaOperacaoRepository novaOperacaoRepository) {
		return new NovaOperacao(codigoCliente, quantidadeParcelas, taxaJuros, carencia, valor, medotoCalculo, numeroContrato);
	}

}
