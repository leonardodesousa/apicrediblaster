package com.crediblaster.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import java.time.LocalDateTime;

@Entity
@Table(name = "t402oper")
public class Operacao {
	@Id @Column(name = "nr_ctr")
	private long id;
	
	@Column(name = "cd_cli")	
	private int codigoCliente;
	
	@Column(name = "cd_emp")
	private int empresa;
	
	@Column(name = "cd_und")
	private int codigoUnidade;
	
	@Column(name = "nm_cli")
	private String nomeCliente;
	
	@Column(name = "dt_inc")
	private LocalDateTime dataInclusao;
	
	@Column(name = "qt_amo")
	private int quantidadeAmortizacao;	
	
	@Column(name = "nr_cic", length = 14) 
	private String cpfCnpj;
	
	@Column(name = "tx_jur")
	private float taxaJuros;
	
	@Column(name = "vr_jur")
	private double valorJuros;
	
	@Column(name = "carencia")
	private int carencia;
	
	@Column(name = "vl_ori")
	private double valorOriginal;
	
	@Column(name = "vl_liq")
	private double valorLiquido;
	
	@Column(name = "id_st")
	private String situacao;
	
	@Column(name = "dt_eft")
	private LocalDateTime dataEfetivacao;
	
	@Column(name = "prazototal", nullable = true)
	private int prazoTotal;
	
	@Column(name = "datahoraatualizacao")
	private LocalDateTime dataHoraAtualizacao;
	
	@Column(name = "metodo_calculo")
	private String metodoCalculo;
	
	public Operacao() {
		//super();
	}


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
		Operacao other = (Operacao) obj;
		if (id != other.id)
			return false;
		return true;
	}
	

	public Operacao(int codigoCliente, int empresa, int codigoUnidade, String nomeCliente, LocalDateTime dataInclusao,
			int quantidadeAmortizacao, int numeroContrato, String cpfCnpj, float taxaJuros, double valorJuros,
			int carencia, double valorOriginal, double valorLiquido, String situacao, LocalDateTime dataEfetivacao,
			int prazoTotal, LocalDateTime dataHoraAtualizacao, String metodoCaldulo) {
		super();
		this.codigoCliente = codigoCliente;
		this.empresa = empresa;
		this.codigoUnidade = codigoUnidade;
		this.nomeCliente = nomeCliente;
		this.dataInclusao = dataInclusao;
		this.quantidadeAmortizacao = quantidadeAmortizacao;
		this.id = numeroContrato;
		this.cpfCnpj = cpfCnpj;
		this.taxaJuros = taxaJuros;
		this.valorJuros = valorJuros;
		this.carencia = carencia;
		this.valorOriginal = valorOriginal;
		this.valorLiquido = valorLiquido;
		this.situacao = situacao;
		this.dataEfetivacao = dataEfetivacao;
		this.prazoTotal = prazoTotal;
		this.dataHoraAtualizacao = dataHoraAtualizacao;
		this.metodoCalculo = metodoCaldulo;
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
		return id;
	}

	public void setNumeroContrato(int numeroContrato) {
		this.id = numeroContrato;
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
	
	

}
