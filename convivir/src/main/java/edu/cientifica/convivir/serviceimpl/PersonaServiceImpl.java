package edu.cientifica.convivir.serviceimpl;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.cientifica.convivir.mappers.PersonaMapper;
import edu.cientifica.convivir.model.Persona;
import edu.cientifica.convivir.service.PersonaService;

@Service
public class PersonaServiceImpl implements PersonaService{
	protected final Log LOG = LogFactory.getLog(this.getClass());
	
	@Autowired
	private PersonaMapper personaMapper;

	//@Transactional
	@Override
	public Persona registrarPersona(Persona persona) {
		
		if (persona.getId()==null){
			persona.setId(personaMapper.newIdPersona());
		}
		
		LOG.info(this.getClass().getName()+" registrarPersona "+ persona.toString());
		
		if (personaMapper.insertPersona(persona)<1) {
			persona = null;
		}
		LOG.info("registrarPersona: "+persona);
		return persona;
	}

	@Override
	public Persona modificarPersona(Persona persona) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean eliminarPersona(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Persona obtenerPersonaPorId(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Persona obtenerPersonaPorDocumento(String tipo, String numero) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Persona> obtenerListaPersona() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	

}
