package edu.cientifica.convivir.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import edu.cientifica.convivir.service.UsuarioService;

@Controller
@RequestMapping("/")
public class InicioController {

	@Autowired
	private UsuarioService usuarioService;

	@GetMapping({ "/index", "/" })
	public String inicio() {
		return "index";
	}

	@GetMapping("/login")
	public String loginForm() {

		return "inicio_login";
	}

	@RequestMapping("/validar")
	public String validarUsuario(@RequestParam(name = "username") String user,
			@RequestParam(name = "password") String pass) {

		if (usuarioService.validarUsuario(user, pass)) {
			return "inicio_principal";

		} else {
			return "inicio_login";

		}
	}

	@RequestMapping("/salir")
	public String salir() {

		return "index";

	}

	@RequestMapping("/registrar")
	public String registrar() {

		return "inicio_registrar";

	}
}
