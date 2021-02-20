package edu.cientifica.convivir.serviceimpl;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.cientifica.convivir.mappers.AdministradorMapper;
import edu.cientifica.convivir.mappers.UsuarioMapper;
import edu.cientifica.convivir.model.Administrador;
import edu.cientifica.convivir.model.Persona;
import edu.cientifica.convivir.model.Usuario;
import edu.cientifica.convivir.service.PersonaService;
import edu.cientifica.convivir.service.UsuarioService;

@Service
public class UsuarioServiceImpl implements UsuarioService {
	protected final Log LOG = LogFactory.getLog(this.getClass());

	@Autowired
	private UsuarioMapper usuarioMapper;
	@Autowired
	private PersonaService personaService;
	@Autowired
	private AdministradorMapper administradorMapper;

	@Transactional
	@Override
	public Usuario registrarUsuario(Usuario usuario) {
		Persona persona;
		persona = personaService.registrarPersona((Persona) usuario);

		if (persona != null) {
			usuario.setId(persona.getId());
			usuarioMapper.insertUsuario(usuario);
		} else {
			usuario = null;
		}

		LOG.info(this.getClass().getName() + " registrarUsuario " + persona.toString());
		return usuario;
	}

	@Override
	public Usuario modificarUsuario(Usuario usuario) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean eliminarUsuario(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Usuario obtenerUsuarioPorId(int id) {
		// TODO Auto-generated method stub
		return usuarioMapper.selectUsuarioById(id);
	}

	@Override
	public List<Usuario> obtenerListaUsuario() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean validarUsuario(Usuario usuario) {
		LOG.info(this.getClass() + " validarUsuario " + usuario.toString());
		Usuario usuarioDb;
		usuarioDb = usuarioMapper.selectUsuarioPorUsername(usuario.getUsername());
		LOG.info(this.getClass() + " validarUsuario  UsuarioDb " + usuarioDb.toString());
		Boolean valido = false;
		if (usuarioDb != null) {
			if (usuarioDb.getPassword().equals(usuario.getPassword())) {
				valido = true;
			}
		}
		return valido;
	}

	@Override
	public Boolean esAdministrador(Usuario usuario) {
		Administrador administrador;
		administrador = administradorMapper.selectAdministradorByUsuario(usuario);

		if (administrador != null) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public Usuario obtenerUsuarioPorUsername(Usuario usuario) {
		// TODO Auto-generated method stub
		Usuario usuarioDb;
		usuarioDb = usuarioMapper.selectUsuarioPorUsername(usuario.getUsername());
		
		LOG.info(this.getClass() + " obtenerUsuarioPorUsername  UsuarioDb " + usuarioDb.toString());
		
		return usuarioDb;
	}
	
	
}
