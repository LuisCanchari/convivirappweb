package edu.cientifica.convivir.serviceimpl;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.cientifica.convivir.mappers.AdministradorMapper;
import edu.cientifica.convivir.mappers.PersonaMapper;
import edu.cientifica.convivir.mappers.UInmobiliariaMapper;
import edu.cientifica.convivir.mappers.UsuarioMapper;
import edu.cientifica.convivir.model.Administrador;
import edu.cientifica.convivir.model.Persona;
import edu.cientifica.convivir.model.UInmobiliaria;
import edu.cientifica.convivir.model.Usuario;
import edu.cientifica.convivir.service.AdministradorService;
import edu.cientifica.convivir.service.PersonaService;

@Service
public class AdministradorServiceImpl implements AdministradorService{
	protected final Log LOG = LogFactory.getLog(this.getClass());
	
	@Autowired 
	UInmobiliariaMapper uinmobiliariaMapper;
	
	@Autowired
	private AdministradorMapper administradorMapper;
	
	@Autowired
	private UsuarioMapper usuarioMapper;

	
	@Override
	public List<UInmobiliaria> obtenerListaUInmobiliariaPorAdministrador(Administrador administrador) {
		// TODO Auto-generated method stub
		
		return uinmobiliariaMapper.selectUInmobiliariaByAdministrador(administrador);
	}


	@Override
	public Administrador obtenerAdministradorPorUsuario(Usuario usuario) {
		// TODO Auto-generated method stub
		return administradorMapper.selectAdministradorByUsuario(usuario);
	}


	@Override
	public Administrador obtenerAdministradorPorId(int id) {
		// TODO Auto-generated method stub
		return administradorMapper.selectAdministradorById(id);
	}
	
	
	
	

}
