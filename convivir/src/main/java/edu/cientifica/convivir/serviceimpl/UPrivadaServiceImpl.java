package edu.cientifica.convivir.serviceimpl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.cientifica.convivir.mappers.UPrivadaMapper;
import edu.cientifica.convivir.model.Propietario;
import edu.cientifica.convivir.model.UInmobiliaria;
import edu.cientifica.convivir.model.UPrivada;
import edu.cientifica.convivir.service.UPrivadaService;

@Service
public class UPrivadaServiceImpl implements UPrivadaService{
	
	@Autowired
	private UPrivadaMapper uprivadaMapper;
	

	@Override
	public int generarNuevoId() {
		// TODO Auto-generated method stub
		return uprivadaMapper.selectNewId();
	}
	
	@Override
	public List<UPrivada> obtenerListaUPrivadaPorUInmobiliariaId(int id) {

		return uprivadaMapper.selectListaUPrivadaByUInmobiliariaId(id);
	}
	
	@Override
	@Transactional //
	public UPrivada registrarUPrivada(UPrivada uprivada) {
		int result=0;
		UPrivada uprivadaResult = null;
		uprivadaResult = uprivada;
		
		uprivadaMapper.insertUPrivada(uprivada);
		result=uprivadaMapper.insertPropietario(uprivada);

		return uprivadaResult ;
	}

	@Override
	public List<UPrivada> obtenerListaUPrivadaPorPropietarioId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<HashMap<Integer, String>> obtenerMapaTipoUnidad() {
		// TODO Auto-generated method stub
		return uprivadaMapper.selectMapaTipoUnidad();
	}

	@Override
	public UPrivada obtenerUprivadaPorId(int id) {
		// TODO Auto-generated method stub
		return uprivadaMapper.selectUprivadaById(id);
	}

	@Override
	public UPrivada actualizarUPrivada(UPrivada uprivada) {
		UPrivada uprivadaResult = null;
		
		if (uprivadaMapper.updateUprivada(uprivada)>0) {
			uprivadaResult = uprivada;
		};
 
		return uprivadaResult ;
	}

	@Override
	public UPrivada obtenerUprivadaPorCodigo(int id) {
		// TODO Auto-generated method stub
		UPrivada uprivadResult =  null;
		
		uprivadResult = uprivadaMapper.selectUprivadaByCodigo(id);
		
		
		return uprivadResult;
	}
	
	
	
	
	

}
