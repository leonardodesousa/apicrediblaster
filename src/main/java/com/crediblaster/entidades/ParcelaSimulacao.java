package com.crediblaster.entidades;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "t402simu")
public class ParcelaSimulacao {
	
	@Id
	@Column(name = "nr_prc")
	private int parcela;
			
	@Column(name = "nr_ctr")	
	private long contratoId;			
	
	@Column(name = "cd_cli")
	private int codigoCliente;
		
	@Column(name = "cd_emp")
	private int codigoEmpresa;
		
	@Column(name = "cd_und")
	private int codigoUnidade;
		
	@Column(name = "dt_sml")
	private LocalDateTime dataSimulacao;
	
	@Column(name = "nr_cic")
	private String cpfCnpj;
		
	@Column(name = "tx_jur")
	private float taxaJuros;
		
	@Column(name = "vr_jur")
	private Double valorJuros;	
	
	@Column(name = "vr_prc")
	private Double valorParcela;
		
	@Column(name = "vr_iof")
	private Double valorIof;
		
	@Column(name = "vr_tot_prc")
	private Double valorTotalParcela;
		
	@Column(name = "dt_venc")
	private LocalDateTime dataVencimento;
		
	@Column(name = "id_sit_parc")
	private String situacaoParcela;
	
	@Column(name = "dt_pgto")
	private LocalDateTime dataPagamento;
		
	@Column(name = "vr_pgo", nullable = true)
	private Double valorPago;	
	
	@Column(name = "vr_principal")
	private Double valorPrincipal;
	
	@OneToMany(mappedBy = "contratoId")
	private List<ParcelaSimulacao> parcelas = new ArrayList<>();	
	
	public ParcelaSimulacao() {
		
	}	

	public long getNumeroContrato() {
		return contratoId;
	}

	public void setNumeroContrato(long contratoId) {
		this.contratoId = contratoId;
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

	public Double getValorJuros() {
		return valorJuros;
	}

	public void setValorJuros(Double valorJuros) {
		this.valorJuros = valorJuros;
	}

	public Double getValorParcela() {
		return valorParcela;
	}

	public void setValorParcela(Double valorParcela) {
		this.valorParcela = valorParcela;
	}

	public Double getValorIof() {				
		return valorIof;
	}

	public void setValorIof(Double valorIof) {		
		this.valorIof = valorIof;
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

	public Double getValorPrincipal() {
		return valorPrincipal;
	}

	public void setValorPrincipal(Double valorPrincipal) {
		this.valorPrincipal = valorPrincipal;
	}
	
	

}
