package com.crediblaster.repositorio;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.crediblaster.entidades.Endereco;

public interface EnderecosRepository extends JpaRepository<Endereco, Long>{
	Page<Endereco> findById(Long id, Pageable paginacao);
}
