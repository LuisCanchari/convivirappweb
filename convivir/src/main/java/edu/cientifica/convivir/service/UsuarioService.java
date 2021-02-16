package edu.cientifica.convivir.service;

import edu.cientifica.convivir.model.Usuario;

public interface UsuarioService {
	public Boolean validarUsuario (String username, String password);
	public Usuario registrarUsuario (Usuario usuario);
}
