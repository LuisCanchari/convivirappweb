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
import edu.cientifica.convivir.service.UsuarioService;

@Controller
@RequestMapping(value = "/administrador")
public class AdministradorController {
	protected final Log LOG = LogFactory.getLog(this.getClass());
	
	@Autowired
	private UsuarioService usuarioService;
	
	@Autowired
	private AdministradorService administradorService;
	
	@GetMapping("/")
	public String obtenerListaAdministrador() {
		
		return "";
	}

	@GetMapping("/{id}")
	public String obtenerAdministrador(@PathVariable (name = "id") int id) {
		
		return "";
	}
	
	@PostMapping("/registrar")
	public String registrarAdministrador(@Valid @ModelAttribute("administrador") Administrador administrador, 
			BindingResult errors,
			Model model) {
		Administrador admin; 
		admin = (Administrador) usuarioService.registrarUsuario(administrador);
		admin.setListaUInmobiliaria(administradorService.obtenerListaUInmobiliariaPorAdministrador(administrador));
		//UInmobiliaria uinmobiliaria = new UInmobiliaria();
		//uinmobiliaria.setAdministrador(administrador);
		LOG.info(this.getClass().getName() + administrador.toString());
		model.addAttribute("administrador", admin);
		//model.addAttribute("listaUInmobiliaria", administradorService.obtenerListaUInmobiliariaPorAdministrador(administrador));
		
		return "uinmobiliaria_lista";
	}
	
	@PutMapping("/{id}")
	public String modificarAdministrador(@PathVariable (name = "id") int id) {
		return "";
	}
	
	@DeleteMapping("/{id}")
	public String eliminarAdministrador(@PathVariable (name = "id") int id) {
		
		return "";
	}
	
	@GetMapping("/nuevo")
	public String nuevoAdministrador(Model model) {
		Administrador administradorNuevo = new Administrador();
		model.addAttribute("administrador", administradorNuevo);
		
		LOG.info("administradorNuevo: "+administradorNuevo.toString());
		return "administrador_nuevo";
	}
	
	@GetMapping("/{id}/uinmobiliaria")
	public String agregarUInmobiliaria(@PathVariable (name = "id") int id,
			Model model) {
		
		LOG.info(this.getClass().getName()+" agregarUInmobiliaria: "+id);
		Usuario usuario;
		UInmobiliaria uinmobiliaria =  new UInmobiliaria();
		Administrador administrador;
		usuario = usuarioService.obtenerUsuarioPorId(id);
		administrador = administradorService.obtenerAdministradorPorUsuario(usuario);
		
		uinmobiliaria.setAdministrador(administrador);
		
		LOG.info(this.getClass().getName()+" agregarUInmobiliaria: "+administrador.toString());
		
		model.addAttribute("uinmobiliaria", uinmobiliaria);
		return "uinmobiliaria_nuevo";
	}
}
