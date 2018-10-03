package com.jamerson.brewer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jamerson.brewer.model.Cidade;

@Controller
public class CidadeController {

	@RequestMapping("cidades/novo")
	public String novo(Cidade cidade) {
		return "cidade/CadastroCidade";
	}
}
