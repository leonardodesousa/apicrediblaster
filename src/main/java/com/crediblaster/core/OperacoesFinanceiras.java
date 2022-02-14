package com.crediblaster.core;

import java.math.BigDecimal;
import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Id;
import javax.persistence.NamedStoredProcedureQueries;
import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.ParameterMode;
import javax.persistence.Persistence;
import javax.persistence.StoredProcedureParameter;
import javax.persistence.StoredProcedureQuery;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.boot.autoconfigure.amqp.RabbitProperties.Cache.Connection;

import com.crediblaster.dto.NovaOperacaoDTO;


@Entity
@NamedStoredProcedureQuery(
		name = "procedureInsereOpercoesEntity", 
		procedureName = "proc_insere_oper_v2", 
		parameters = { 
			@StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "codigoCliente"), 
			@StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class, name = "quantidadeParcelas"),
			@StoredProcedureParameter(mode = ParameterMode.IN, type = Float.class, name = "taxaJuros"),
			@StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class, name = "carencia"), 
			@StoredProcedureParameter(mode = ParameterMode.IN, type = Double.class, name = "valorOperacao")			
		}
	)
public class OperacoesFinanceiras {
	@Id
	private long codigoCliente;
	private int quantidadeParcelas;
	private float taxaJuros;
	private int carencia;
	private double valorOperacao;
	
	public OperacoesFinanceiras() {
		super();
	}
	
	public OperacoesFinanceiras(long codigoCliente, int quantidadeParcelas, float taxaJuros, int carencia) {
		super();
		this.codigoCliente = codigoCliente;
		this.quantidadeParcelas = quantidadeParcelas;
		this.taxaJuros = taxaJuros;
		this.carencia = carencia;
	}
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

	public double getValorOperacao() {
		return valorOperacao;
	}

	public void setValorOperacao(double valorOperacao) {
		this.valorOperacao = valorOperacao;
	}

}

