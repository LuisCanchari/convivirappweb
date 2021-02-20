package edu.cientifica.convivir.mappers;



import org.apache.ibatis.annotations.Mapper;


import edu.cientifica.convivir.model.Administrador;
import edu.cientifica.convivir.model.Usuario;

@Mapper
public interface AdministradorMapper {
	public Administrador selectAdministradorByUsuario(Usuario usuario);
	public Administrador selectAdministradorById(int id);

}
