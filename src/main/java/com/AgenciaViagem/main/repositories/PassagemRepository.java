package com.AgenciaViagem.main.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.AgenciaViagem.main.model.Passagem;

public interface PassagemRepository extends JpaRepository<Passagem, Long> {
	

}
