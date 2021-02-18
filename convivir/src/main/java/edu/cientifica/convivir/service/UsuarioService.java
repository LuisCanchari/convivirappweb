package edu.cientifica.convivir.service;

import edu.cientifica.convivir.model.Usuario;

public interface UsuarioService {
	public Boolean validarUsuario (Usuario usuario);
	public Usuario registrarUsuario (Usuario usuario);
}
