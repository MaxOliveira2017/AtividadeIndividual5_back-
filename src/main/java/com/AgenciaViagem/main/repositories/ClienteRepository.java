package com.AgenciaViagem.main.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.AgenciaViagem.main.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
	

}
