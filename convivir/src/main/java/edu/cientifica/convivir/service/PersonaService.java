package edu.cientifica.convivir.service;
import java.util.List;

import edu.cientifica.convivir.model.Persona;

public interface PersonaService {
	
	public Persona registrarPersona(Persona persona);
	public Persona modificarPersona(Persona persona);
	public Boolean eliminarPersona(int id);
	public Persona obtenerPersonaPorId(Integer id);
	public Persona obtenerPersonaPorDocumento (String tipo, String numero);
	public List<Persona> obtenerListaPersona();
	
}
