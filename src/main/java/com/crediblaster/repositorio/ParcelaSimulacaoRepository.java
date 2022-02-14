package com.crediblaster.repositorio;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.crediblaster.entidades.ParcelaSimulacao;

public interface ParcelaSimulacaoRepository extends JpaRepository<ParcelaSimulacao, Long> {
	Page<ParcelaSimulacao> findByContratoId(long numeroContrato, Pageable paginacao);
}
