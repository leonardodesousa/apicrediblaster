package com.crediblaster.repositorio;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.crediblaster.entidades.Operacao;

public interface OperacaoRepository extends JpaRepository<Operacao, Long>{
	Page<Operacao> findById(int numeroContrato, Pageable paginacao);

}
