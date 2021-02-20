package edu.cientifica.convivir.mappers;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import edu.cientifica.convivir.model.Usuario;

@Mapper
public interface UsuarioMapper {
	public int insertUsuario (Usuario usuario);
	public int updateUsuario (Usuario usuario);
	public int deleteUsuarioById(int id);
	public Usuario selectUsuarioById(int id);
	public List<Usuario> selectUsuario();
	public Usuario selectUsuarioPorUsername(String username);
}
