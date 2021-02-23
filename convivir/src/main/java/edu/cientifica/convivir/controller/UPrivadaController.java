package edu.cientifica.convivir.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/uprivada")
public class UPrivadaController {
	protected final Log LOG = LogFactory.getLog(this.getClass());
	
	
	@GetMapping("/")
	public String obtenerListaUPrivada(Model model) {
		
		
		model.addAttribute("uinmobiliaria", null);
		return "uprivada_list";
	}
	
	
	@GetMapping("/{id}")
	public String obtenerUPrivada(@PathVariable(name ="id") int id) {
		
		return "";
	}
	
	@GetMapping("/nuevo")
	public String nuevoUPrivada() {
		return "";
	}
	
	@PostMapping("/registrar")
	public String registrarUPrivada() {
		
		return "";
	}
	
	

}
