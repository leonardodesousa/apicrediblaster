package com.crediblaster.dto;

import java.time.LocalDateTime;

import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.constraints.Null;

import org.springframework.data.domain.Page;

import com.crediblaster.entidades.Parcela;

public class ParcelaDetalheDTO {	
	@Id	@OneToMany
	private long id;
	@Id
	private String nossoNumero;		
	private int codigoCliente;	
	private int codigoEmpresa;
	private int codigoUnidade;
	private LocalDateTime dataSimulacao;	
	private int parcela;		
	private String cpfCnpj;	
	private float taxaJuros;	
	private Double valorJuros;
	private Double valorParcela;	
	private Double valorTotalParcela;
	private LocalDateTime dataVencimento;	
	private String situacaoParcela;
	private LocalDateTime dataPagamento;	
	private Double valorPago;	
	private Double valorDesconto;	
	private Double valorJurosPago;
	//private char idLote;
	
	public ParcelaDetalheDTO() {
		
	}	
	
	
	public ParcelaDetalheDTO(Parcela parcela) {
		super();
		this.id = parcela.getNumeroCotrato();
		this.nossoNumero = parcela.getNossoNumero();
		this.codigoCliente = parcela.getCodigoCliente();
		this.codigoEmpresa = parcela.getCodigoEmpresa();
		this.codigoUnidade = parcela.getCodigoUnidade();
		this.dataSimulacao = parcela.getDataSimulacao();
		this.parcela = parcela.getParcela();
		this.cpfCnpj = parcela.getCpfCnpj();
		this.taxaJuros = parcela.getTaxaJuros();
		this.setValorJuros(parcela.getValorJuros());
		this.valorParcela = parcela.getValorParcela();
		this.valorTotalParcela = parcela.getValorTotalParcela();
		this.dataVencimento = parcela.getDataVencimento();
		this.situacaoParcela = parcela.getSituacaoParcela();
		this.dataPagamento = parcela.getDataPagamento();
		this.valorPago = parcela.getValorPago();
		this.valorDesconto = parcela.getValorDesconto();
		this.valorJurosPago = parcela.getValorJurosPago();
		//this.idLote = parcela.getIdLote();
	}



	public long getNumeroCotrato() {
		return id;
	}

	public void setNumeroCotrato(int numeroCotrato) {
		this.id = numeroCotrato;
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
		return parcela;
	}

	public void setParcela(int parcela) {
		this.parcela = parcela;
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

	public double getValorParcela() {
		return valorParcela;
	}

	public void setValorParcela(double valorParcela) {
		this.valorParcela = valorParcela;
	}

	public double getValorTotalParcela() {
		return valorTotalParcela;
	}

	public void setValorTotalParcela(double valorTotalParcela) {
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

	public double getValorPago() {
		if (valorPago == null)
			valorPago = 0.00;		
		return valorPago;
	}

	public void setValorPago(double valorPago) {
		this.valorPago = valorPago;
	}

	public double getValorDesconto() {
		if(valorDesconto == null)
			valorDesconto = 0.00;
		return valorDesconto;
	}

	public void setValorDesconto(double valorDesconto) {		
		this.valorDesconto = valorDesconto;
	}

	public double getValorJurosPago() {
		if (valorJurosPago == null)
			valorJurosPago = 0.00;
		return valorJurosPago;
	}
	
	public Double getValorJuros() {
		return valorJuros;
	}


	public void setValorJuros(Double valorJuros) {
		this.valorJuros = valorJuros;
	}

	public void setValorJurosPago(double valorJurosPago) {
		this.valorJurosPago = valorJurosPago;
	}
	
	/*
	public char getIdLote() {
		return idLote;
	}

	public void setIdLote(char idLote) {
		this.idLote = idLote;
	}
	
	*/
	
	public static Page<ParcelaDetalheDTO> Converter(Page<Parcela> parcelas){
		return parcelas.map(ParcelaDetalheDTO::new);		
	}


}
