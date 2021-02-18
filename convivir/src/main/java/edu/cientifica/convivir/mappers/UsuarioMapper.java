package edu.cientifica.convivir.mappers;

import org.apache.ibatis.annotations.Mapper;

import edu.cientifica.convivir.model.Usuario;


@Mapper
public interface UsuarioMapper {
	public Usuario selectUsuarioPorUsername(String username);

}
