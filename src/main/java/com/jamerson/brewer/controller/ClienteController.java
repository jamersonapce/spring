package com.jamerson.brewer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jamerson.brewer.model.Cliente;

@Controller
public class ClienteController {
	
	@RequestMapping("/clientes/novo")
	public String novo(Cliente cliente){
		return "cliente/CadastroCliente";
	}

}
