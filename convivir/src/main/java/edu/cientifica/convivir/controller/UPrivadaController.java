package edu.cientifica.convivir.controller;

import javax.validation.Valid;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.cientifica.convivir.model.UInmobiliaria;
import edu.cientifica.convivir.model.UPrivada;
import edu.cientifica.convivir.service.UPrivadaService;

@Controller
@RequestMapping("/uprivada")
public class UPrivadaController {
	protected final Log LOG = LogFactory.getLog(this.getClass());
	
	@Autowired
	UPrivadaService uprivadaService;
	
	
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
	
	@PostMapping("")
	public String registrarUPrivada(@ModelAttribute("uprivada") UPrivada uprivada) {
		
		LOG.info(this.getClass().getName()+" registrarUPrivada "+ uprivada.toString());
		uprivadaService.registrarUPrivada(uprivada);
		
		return "redirect:/uinmobiliaria/"+uprivada.getUinmobiliaria().getId();
	}
	
	

}
