package edu.cientifica.convivir.mappers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.apache.ibatis.annotations.Mapper;

import edu.cientifica.convivir.model.UPrivada;

@Mapper
public interface UPrivadaMapper {
	
	public List<UPrivada> selectListaUPrivadaByUInmobiliariaId(int id);
	public List<UPrivada> selectListaUPrivadaByAdministradorId(int id);
	public int selectNewId();
	public List<HashMap<Integer, String>> selectMapaTipoUnidad();
	public int insertUPrivada( UPrivada uprivada);
	public int insertPropietario( UPrivada uprivada);
}
