package com.crediblaster.repositorio;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.crediblaster.entidades.NovaOperacao;

public interface NovaOperacaoRepository extends JpaRepository<NovaOperacao, Long>{
	//Page<NovaOperacao> findById(Long id, Pageable paginacao);
	NovaOperacao findById(long id);

}
