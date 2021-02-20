package edu.cientifica.convivir.controller;

import javax.validation.Valid;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import edu.cientifica.convivir.mappers.AdministradorMapper;
import edu.cientifica.convivir.model.Administrador;
import edu.cientifica.convivir.model.UInmobiliaria;
import edu.cientifica.convivir.model.Usuario;
import edu.cientifica.convivir.service.AdministradorService;
import edu.cientifica.convivir.service.UInmobiliariaService;
import edu.cientifica.convivir.service.UsuarioService;

@Controller
@RequestMapping("/usuario")
public class UsuarioController {
	protected final Log LOG = LogFactory.getLog(this.getClass());
	
	@Autowired
	private UsuarioService usuarioService;
	
	@Autowired
	private UInmobiliariaService uinmobiliariaService;
	
	@Autowired
	private AdministradorService administradorService;
	
	@GetMapping("/")
	public String obtenerListaUsuario() {
			return "";
	}

	@GetMapping("/{id}")
	public String obtenerUsuario(@PathVariable (name = "id") int id) {
		
		return "";
	}
	
	@PutMapping("/{id}")
	public String actualizarUsuario(@PathVariable (name = "id") int id) {
		
		return "";
	}
	
	@DeleteMapping("/{id}")
	public String eliminarUsuario(@PathVariable (name = "id") int id) {
		
		return "";
	}
	
	@GetMapping("/nuevo")
	public String nuevoUsuario(Model model) {
		
		Usuario usuarioNuevo = new Usuario();
		model.addAttribute("usuario", usuarioNuevo);
		LOG.info("nuevoUsuario: "+usuarioNuevo.toString());
		return "usuario_nuevo";
	}
	
	@PostMapping("/registrar")
	public String registrarUsuario(@Valid @ModelAttribute("usuario") Usuario usuario, 
			BindingResult errors,
			Model model) {
		LOG.info("nuevoUsuario post: "+usuario.toString());
		
		usuarioService.registrarUsuario(usuario);
		return "inicio_principal";
		//return "redirect:/principal";
	}
	
	@PostMapping("/validar")
	public String validarUsuario(@Valid @ModelAttribute("usuario") Usuario usuario, 
			BindingResult errors, Model model) {
		
		Administrador administrador = new Administrador();
		Usuario usuarioDb;
		usuarioDb = usuarioService.obtenerUsuarioPorUsername(usuario); 
		
		
		if (usuarioService.validarUsuario(usuario)) {
			if (usuarioService.esAdministrador(usuarioDb)) {
				administrador = administradorService.obtenerAdministradorPorUsuario(usuarioDb);
				administrador.setListaUInmobiliaria(uinmobiliariaService.obtenerUInmobiliariaPorAdministrador(administrador));
				model.addAttribute("administrador", administrador);
				
				LOG.info("validarUsuario:" + administrador.getListaUInmobiliaria().size());
				return "uinmobiliaria_lista";
			}else {
				return "inicio_principal";
			}
		}else {
			return  "redirect:/login";
		}
	}
}
