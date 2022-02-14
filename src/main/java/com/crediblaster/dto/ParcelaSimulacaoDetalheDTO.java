package com.crediblaster.dto;

import java.time.LocalDateTime;

import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.springframework.data.domain.Page;

import com.crediblaster.entidades.ParcelaSimulacao;

public class ParcelaSimulacaoDetalheDTO {
	@Id	@OneToMany
	private long id;	
	private int codigoCliente;	
	private int codigoEmpresa;
	private int codigoUnidade;
	private LocalDateTime dataSimulacao;
	@Id
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
	private Double valorPrincipal;
	
	public ParcelaSimulacaoDetalheDTO() {
		
	}
	
	public ParcelaSimulacaoDetalheDTO(ParcelaSimulacao parcela) {
		super();
		this.id = parcela.getNumeroContrato();		
		this.codigoCliente = parcela.getCodigoCliente();
		this.codigoEmpresa = parcela.getCodigoEmpresa();
		this.codigoUnidade = parcela.getCodigoUnidade();
		this.dataSimulacao = parcela.getDataSimulacao();
		this.parcela = parcela.getParcela();
		this.cpfCnpj = parcela.getCpfCnpj();
		this.taxaJuros = parcela.getTaxaJuros();
		this.valorJuros = parcela.getValorJuros();
		this.valorParcela = parcela.getValorParcela();
		this.valorTotalParcela = parcela.getValorTotalParcela();
		this.dataVencimento = parcela.getDataVencimento();
		this.situacaoParcela = parcela.getSituacaoParcela();
		this.dataPagamento = parcela.getDataPagamento();
		this.valorPago = parcela.getValorPago();		
		this.valorPrincipal = parcela.getValorPrincipal();
		
	}

	public long getId() {
		return id;
	}

	public int getCodigoCliente() {
		return codigoCliente;
	}

	public int getCodigoEmpresa() {
		return codigoEmpresa;
	}

	public int getCodigoUnidade() {
		return codigoUnidade;
	}

	public LocalDateTime getDataSimulacao() {
		return dataSimulacao;
	}

	public int getParcela() {
		return parcela;
	}

	public String getCpfCnpj() {
		return cpfCnpj;
	}

	public float getTaxaJuros() {
		return taxaJuros;
	}

	public Double getValorJuros() {
		return valorJuros;
	}

	public Double getValorParcela() {
		return valorParcela;
	}

	public Double getValorTotalParcela() {
		return valorTotalParcela;
	}

	public LocalDateTime getDataVencimento() {
		return dataVencimento;
	}

	public String getSituacaoParcela() {
		return situacaoParcela;
	}

	public LocalDateTime getDataPagamento() {
		return dataPagamento;
	}

	public Double getValorPago() {
		if(valorPago == null) {
			valorPago = 0.00;
		}
		return valorPago;
	}

	public Double getValorDesconto() {
		if(valorDesconto == null) {
			valorDesconto = 0.00;
		}
		return valorDesconto;
	}	

	public Double getValorPrincipal() {
		return valorPrincipal;
	}
	
	public static Page<ParcelaSimulacaoDetalheDTO> Converter(Page<ParcelaSimulacao> parcelas){
		return parcelas.map(ParcelaSimulacaoDetalheDTO::new);
	}
	

}
