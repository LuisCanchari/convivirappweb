package edu.cientifica.convivir.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import edu.cientifica.convivir.model.UInmobiliaria;


@Mapper
public interface UInmobiliariaMapper {
	
	public int insertUInmobiliaria (UInmobiliaria uinmobiliaria);
	public int updateUInmobiliaria (UInmobiliaria uinmobiliaria);
	public int deleteUInmobiliariaById(int id);
	public UInmobiliaria selectUInmobiliariaById(int id);
	public List<UInmobiliaria> selectUInmobiliaria();
	public int selectNewId();
	public int insertAdministrador(UInmobiliaria uinmobiliaria);

}
