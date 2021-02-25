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
	public int registrarUPrivada(UPrivada uprivada) {
		int result=0;
		
		uprivadaMapper.insertUPrivada(uprivada);
		result=uprivadaMapper.insertPropietario(uprivada);

		return result;
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
	

}
