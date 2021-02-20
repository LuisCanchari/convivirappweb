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

	@GetMapping({ "/index", "/" })
	public String inicio() {
		return "index";
	}

	@GetMapping("/login")
	public String loginForm() {

		return "inicio_login";
	}

	@RequestMapping("/salir")
	public String salir() {
		return "redirect:/";
	}

	@GetMapping("/registrar")
	public String getRegistrar() {
		return "inicio_registrar";
	}
	
	
}
