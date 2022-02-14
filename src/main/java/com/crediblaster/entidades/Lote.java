package com.crediblaster.entidades;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "t402lote")
public class Lote {
	
	@Id
	@Column(name = "nr_nos_nr")
	private String nossoNumero;
		
	@Column(name = "lote")
	private int lote;
	
	@Column(name = "contrato")
	private int contrato;
	
	@Column(name = "cliente")
	private int cliente;
	
	@Column(name = "parcela")
	private int parcela;
	
	@Column(name = "desconto")
	private double desconto;
	
	@Column(name = "valor")
	private double valor;
	
	@Column(name = "tipo_lote")
	private String tipoLote;
	
	@Column(name = "itf_origem")
	private String interfaceDeOrigem;
		
	@Column(name = "nr_seq")
	private int sequencial;
	
	@Column(name = "id_sit_lot")
	private String situacaoLote;
	
	@Column(name = "dh_atu")
	private Date dataAtualizacao;	
	
	@Column(name = "dt_eft")
	private Date dataEfetivacao;
	
	public Lote() {
		
	}

	public Lote(int lote, int contrato, int cliente, int parcela, double desconto, double valor, String tipoLote,
			String interfaceDeOrigem, int sequencial, String situacaoLote, Date dataAtualizacao, String nossoNumero,
			Date dataEfetivacao) {
		super();
		this.lote = lote;
		this.contrato = contrato;
		this.cliente = cliente;
		this.parcela = parcela;
		this.desconto = desconto;
		this.valor = valor;
		this.tipoLote = tipoLote;
		this.interfaceDeOrigem = interfaceDeOrigem;
		this.sequencial = sequencial;
		this.situacaoLote = situacaoLote;
		this.dataAtualizacao = dataAtualizacao;
		this.nossoNumero = nossoNumero;
		this.dataEfetivacao = dataEfetivacao;
	}

	public int getLote() {
		return lote;
	}

	public void setLote(int lote) {
		this.lote = lote;
	}

	public int getContrato() {
		return contrato;
	}

	public void setContrato(int contrato) {
		this.contrato = contrato;
	}

	public int getCliente() {
		return cliente;
	}

	public void setCliente(int cliente) {
		this.cliente = cliente;
	}

	public int getParcela() {
		return parcela;
	}

	public void setParcela(int parcela) {
		this.parcela = parcela;
	}

	public double getDesconto() {
		return desconto;
	}

	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getTipoLote() {
		return tipoLote;
	}

	public void setTipoLote(String tipoLote) {
		this.tipoLote = tipoLote;
	}

	public String getInterfaceDeOrigem() {
		return interfaceDeOrigem;
	}

	public void setInterfaceDeOrigem(String interfaceDeOrigem) {
		this.interfaceDeOrigem = interfaceDeOrigem;
	}

	public int getSequencial() {
		return sequencial;
	}

	public void setSequencial(int sequencial) {
		this.sequencial = sequencial;
	}

	public String getSituacaoLote() {
		return situacaoLote;
	}

	public void setSituacaoLote(String situacaoLote) {
		this.situacaoLote = situacaoLote;
	}

	public Date getDataAtualizacao() {
		return dataAtualizacao;
	}

	public void setDataAtualizacao(Date dataAtualizacao) {
		this.dataAtualizacao = dataAtualizacao;
	}

	public String getNossoNumero() {
		return nossoNumero;
	}

	public void setNossoNumero(String nossoNumero) {
		this.nossoNumero = nossoNumero;
	}

	public Date getDataEfetivacao() {
		return dataEfetivacao;
	}

	public void setDataEfetivacao(Date dataEfetivacao) {
		this.dataEfetivacao = dataEfetivacao;
	}
	
		
	
}
