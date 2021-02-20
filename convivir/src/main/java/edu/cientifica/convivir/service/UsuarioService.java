package edu.cientifica.convivir.service;

import java.util.List;
import edu.cientifica.convivir.model.Usuario;

public interface UsuarioService {
	public Usuario registrarUsuario (Usuario usuario);
	public Usuario modificarUsuario (Usuario usuario);
	public Boolean eliminarUsuario (int id);
	public Usuario obtenerUsuarioPorId (int id);
	public Usuario obtenerUsuarioPorUsername (Usuario usuario);
	public List<Usuario> obtenerListaUsuario ();
	
	public Boolean validarUsuario (Usuario usuario);
	public Boolean esAdministrador (Usuario usuario);
	
}
