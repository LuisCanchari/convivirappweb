package edu.cientifica.convivir.controller;

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
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import edu.cientifica.convivir.model.Usuario;



@Controller
@RequestMapping("/usuario")
public class UsuarioController {
	

	@GetMapping("/")
	public String obtenerListaUsuario() {
		return "";
	}
	

	@GetMapping("/{id}")
	public String obtenerUsuarioPorId(@PathVariable (name = "id") int id) {
		return "";
	}
	
	@PostMapping("/")
	public String crearUsuario(@ModelAttribute("usuario") Usuario usuario, BindingResult errors,
			Model model, RedirectAttributes atribute) {
		return "";
	}
	
	@PutMapping("/{id}")
	public String actualizarUsuarioPorId(@PathVariable (name = "id") int id) {
		
		return "";
		
	}
	
	@DeleteMapping("/{id}")
	public String eliminarUsuarioPorId(@PathVariable (name = "id") int id) {
		
		return "";
	
	}
}
