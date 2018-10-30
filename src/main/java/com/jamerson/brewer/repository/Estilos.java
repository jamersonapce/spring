package com.jamerson.brewer.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Controller;

import com.jamerson.brewer.model.Estilo;

@Controller
public interface Estilos extends JpaRepository<Estilo, Long>{
	public Optional<Estilo> findByNomeIgnoreCase(String nome);
}
