package com.crediblaster.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="NOVA_OPERACAO")
public class NovaOperacao {
	
	@Id
	@Column(name = "cd_cli")
	private Long codigoCliente;
	
	@Column(name = "qtd_parcelas")
	private int quantidadeParcelas;
	
	@Column(name = "taxa_juros")
	private float taxaJuros;
	
	@Column(name = "carencia")
	private int carencia;
	
	@Column(name = "valor_contrato")
	private double valorContrato;
	
	@Column(name = "metodo_calculo")
	private String metodoCalculo;
	
	@Column(name = "nr_ctr")
	private Long numeroContrato;
	
	
	public NovaOperacao() {
		
	}

	public NovaOperacao(Long codigoCliente, int quantidadeParcelas, float taxaJuros, int carencia,
			double valorContrato, String metodoCalculo, Long numeroContrato) {
		super();
		this.codigoCliente = codigoCliente;
		this.quantidadeParcelas = quantidadeParcelas;
		this.taxaJuros = taxaJuros;
		this.carencia = carencia;
		this.valorContrato = valorContrato;
		this.metodoCalculo = metodoCalculo;
		this.numeroContrato = numeroContrato;
	}
			

	public Long getNumeroContrato() {
		return this.numeroContrato;
	}

	public void setNumeroContrato(Long numeroContrato) {
		this.numeroContrato = numeroContrato;
	}

	public String getMetodoCalculo() {
		return metodoCalculo;
	}

	public void setMetodoCalculo(String metodoCalculo) {
		this.metodoCalculo = metodoCalculo;
	}

	public Long getId() {
		return codigoCliente;
	}

	public void setId(Long codigoCliente) {
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

	public double getValorContrato() {
		return valorContrato;
	}

	public void setValorContrato(double valorContrato) {
		this.valorContrato = valorContrato;
	}	

}
