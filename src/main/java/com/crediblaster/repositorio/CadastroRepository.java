package com.crediblaster.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crediblaster.core.Cliente;

public interface CadastroRepository extends JpaRepository<Cliente, Long>{
	Cliente findById(long id); 
}
