package com.jamerson.brewer.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jamerson.brewer.model.Estilo;
import com.jamerson.brewer.repository.Estilos;
import com.jamerson.brewer.service.exception.NomeEstiloJaCadastradoException;

@Service
public class CadastroEstiloService {

	@Autowired
	private Estilos estilos;
	
	@Transactional
	public Estilo salvar(Estilo estilo) {
		Optional<Estilo> estiloOptional = estilos.findByNomeIgnoreCase(estilo.getNome());
		if(estiloOptional.isPresent()) {
			throw new NomeEstiloJaCadastradoException("Nome do estilo já cadastrado");
		}
		return estilos.saveAndFlush(estilo);
	}
}
