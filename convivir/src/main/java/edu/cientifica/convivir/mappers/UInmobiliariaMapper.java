package edu.cientifica.convivir.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import edu.cientifica.convivir.model.Administrador;
import edu.cientifica.convivir.model.UInmobiliaria;
import edu.cientifica.convivir.model.UsuarioFinal;


@Mapper
public interface UInmobiliariaMapper {
	
	public int insertUInmobiliaria (UInmobiliaria uinmobiliaria);
	public int updateUInmobiliaria (UInmobiliaria uinmobiliaria);
	public int deleteUInmobiliariaById(int id);
	public UInmobiliaria selectUInmobiliariaById(int id);
	public List<UInmobiliaria> selectUInmobiliaria();
	public int selectNewId();
	public int insertAdministrador(UInmobiliaria uinmobiliaria);
	
	public List<UInmobiliaria> selectUInmobiliariaByAdministrador(Administrador administrador);
	
	public UInmobiliaria selectUInmobiliariaByUsuarioFinal(UsuarioFinal usuarioFinal);

}
