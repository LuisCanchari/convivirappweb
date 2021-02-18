package edu.cientifica.convivir.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;


import edu.cientifica.convivir.model.Persona;

@Mapper
public interface PersonaMapper {
	public int insertPersona (Persona persona);
	public int updatePersona (Persona persona);
	public int deletePersonaById(int id);
	public Persona selectPersonaById(int id);
	public List<Persona> selectPersona();
	public int newIdPersona();
}
