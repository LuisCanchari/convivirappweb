package edu.cientifica.convivir.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import edu.cientifica.convivir.model.UPrivada;

@Mapper
public interface UPrivadaMapper {
	
	public List<UPrivada> selectListaUPrivadaByUInmobiliariaId(int id);
	public List<UPrivada> selectListaUPrivadaByAdministradorId(int id);

}
