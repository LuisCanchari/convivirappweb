package edu.cientifica.convivir.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;


import edu.cientifica.convivir.model.Administrador;

@Mapper
public interface AdministradorMapper {
	public int insertAdministrador (Administrador administrador);
	public int updateAdministrador (Administrador administrador);
	public int deleteAdministradorById(int id);
	public Administrador selectAdministradorById(int id);
	public List<Administrador> selectAdministrador();
	 

}
