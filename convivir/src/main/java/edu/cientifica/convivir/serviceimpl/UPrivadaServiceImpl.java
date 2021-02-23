package edu.cientifica.convivir.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
	public List<UPrivada> obtenerListaUPrivadaPorUInmobiliariaId(int id) {

		return uprivadaMapper.selectListaUPrivadaByUInmobiliariaId(id);
	}

	@Override
	public List<UPrivada> obtenerListaUPrivadaPorPropietarioId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
