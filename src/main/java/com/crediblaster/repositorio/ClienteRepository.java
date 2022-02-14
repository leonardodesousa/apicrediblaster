package com.crediblaster.repositorio;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.crediblaster.core.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long>{
	Page<Cliente> findById(Long id, Pageable paginacao);

}
