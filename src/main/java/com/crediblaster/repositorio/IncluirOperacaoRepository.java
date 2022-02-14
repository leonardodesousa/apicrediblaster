package com.crediblaster.repositorio;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.crediblaster.core.OperacoesFinanceiras;


public interface IncluirOperacaoRepository extends CrudRepository <OperacoesFinanceiras, Long>{
	//Page<OperacoesFinanceiras> findById(Long id, Pageable paginacao);	
	@Procedure(name = "procedureInsereOpercoesEntity")
	long codigoCliente(@Param("codigoCliente") Long model);
	int quantidadeParcelas(@Param("quantidadeParcelas") Integer model);
	float taxaJuros(@Param("taxaJuros") Float model);
	float carencia(@Param("carencia") Integer model);
	double valorOperacao(@Param("valorOperacao") Double model);

}
