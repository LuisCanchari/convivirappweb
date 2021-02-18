package edu.cientifica.convivir.controller;

import javax.validation.Valid;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.cientifica.convivir.model.Administrador;
import edu.cientifica.convivir.model.UInmobiliaria;
import edu.cientifica.convivir.model.Usuario;
import edu.cientifica.convivir.service.AdministradorService;
import edu.cientifica.convivir.service.UInmobiliariaService;
import edu.cientifica.convivir.service.UsuarioService;

@Controller
@RequestMapping(value = "/uinmobiliaria")
public class UInmobiliariaController {
	protected final Log LOG = LogFactory.getLog(this.getClass());
	
	@Autowired
	private UInmobiliariaService uinmobiliariaService;
	
	@GetMapping("/")
	public String obtenerUInmobiliaria() {
		
		return "";
	}

	@GetMapping("/{id}")
	public String obtenerUInmobiliaria(@PathVariable (name = "id") int id) {
		
		return "";
	}
	
	@PostMapping("/registrar")
	public String registrarUInmobiliaria(@Valid @ModelAttribute("uinmobiliaria") UInmobiliaria uinmobiliaria, 
			BindingResult errors,
			Model model) {
		LOG.info("registrarUInmobiliaria: "+uinmobiliaria);
		uinmobiliariaService.registrarUInmobiliaria(uinmobiliaria);
			
		return "inicio_principal";
	}
	
	@PutMapping("/{id}")
	public String modificarUInmobiliaria(@PathVariable (name = "id") int id) {
		
		return "";
	}
	
	@DeleteMapping("/{id}")
	public String eliminarUInmobiliaria(@PathVariable (name = "id") int id) {
		
		return "";
	}
	
	@GetMapping("/nuevo")
	public String nuevoUInmobiliaria(Model model) {
			
		UInmobiliaria uinmobiliaria = new UInmobiliaria();  
		
		model.addAttribute("uinmobiliaria", uinmobiliaria);
		
		LOG.info("nuevoUInmobiliaria: "+uinmobiliaria.toString());
		return "uinmobiliaria_nuevo";
	}

}



