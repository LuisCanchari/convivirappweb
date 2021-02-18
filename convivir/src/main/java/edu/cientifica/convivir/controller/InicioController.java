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

	
	@RequestMapping("/salir")
	public String salir() {

		return "index";

	}

	@GetMapping("/registrar")
	public String getRegistrar() {

		return "inicio_registrar";

	}
	
	@PostMapping("/registrar")
	public String postRegistrar(
			@RequestParam(name = "nombre") String nombre,
			@RequestParam(name = "primerapellido") String primerApellido,
			@RequestParam(name = "segundoapellido") String segundoApellido,
			@RequestParam(name = "tipodocumento") String tipoDocumento,
			@RequestParam(name = "numerodocumento") String numeroDocumento,
			@RequestParam(name = "email") String email,
			@RequestParam(name = "usuario") String usuario,
			@RequestParam(name = "password") String password
			){
		
		
		return "";
	}
}
