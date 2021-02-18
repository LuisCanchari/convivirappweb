package edu.cientifica.convivir.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.cientifica.convivir.mappers.UsuarioMapper;
import edu.cientifica.convivir.model.Usuario;
import edu.cientifica.convivir.service.UsuarioService;



@Service
public class UsuarioServiceImpl implements UsuarioService {
	
	@Autowired
	private UsuarioMapper usuarioMapper;

	@Override
	public Boolean validarUsuario(Usuario usuario) {
		Usuario usuarioDb;
		usuarioDb = usuarioMapper.selectUsuarioPorUsername(usuario.getUsername());
		Boolean valido = false;
		if (usuarioDb!=null) {
			if (usuarioDb.getPassword()==usuario.getPassword()) {
				valido=true;
			}
		}
		return valido;
		
	}

	@Override
	public Usuario registrarUsuario(Usuario usuario) {
		// TODO Auto-generated method stub
		
		//Registar Persona
		
		
		//Registra Usuario
		
		return null;
	}
	
	

}
