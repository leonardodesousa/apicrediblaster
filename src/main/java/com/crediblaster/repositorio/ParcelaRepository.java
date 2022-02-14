package com.crediblaster.repositorio;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.crediblaster.entidades.Parcela;

public interface ParcelaRepository extends JpaRepository<Parcela, Long>{	
	Page<Parcela> findByContratoId(long numeroContrato, Pageable paginacao);
}
