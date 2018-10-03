package com.jamerson.brewer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jamerson.brewer.model.Usuario;

@Controller
public class UsuarioController {

	@RequestMapping("usuarios/novo")
	public String novo(Usuario usuario) {
		return "usuario/CadastroUsuario";
	}
}
