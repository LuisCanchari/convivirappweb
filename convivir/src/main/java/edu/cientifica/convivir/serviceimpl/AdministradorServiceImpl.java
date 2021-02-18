package edu.cientifica.convivir.serviceimpl;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.cientifica.convivir.mappers.AdministradorMapper;
import edu.cientifica.convivir.mappers.PersonaMapper;
import edu.cientifica.convivir.model.Administrador;
import edu.cientifica.convivir.model.Persona;
import edu.cientifica.convivir.service.AdministradorService;
import edu.cientifica.convivir.service.PersonaService;

@Service
public class AdministradorServiceImpl implements AdministradorService{
	protected final Log LOG = LogFactory.getLog(this.getClass());
	
	@Autowired 
	AdministradorMapper administradorMapper;
	
	@Autowired 
	PersonaService personaService;

	@Transactional
	@Override
	public Administrador registrarAdministrador(Administrador administrador) {
		Persona persona;
		persona = personaService.registrarPersona((Persona) administrador);
		
		if (persona!=null) {
			administrador.setId(persona.getId());
			administradorMapper.insertAdministrador(administrador);
		}else{
			administrador=null;
		}
		
		LOG.info("registrarAdministrador: "+administrador);
		return administrador;
	}

	@Override
	public Administrador modificarAdministrador(Administrador administrador) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean eliminarAdministrador(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Administrador obtenerAdministradorPorId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Administrador> obtenerListaAdministrador() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
