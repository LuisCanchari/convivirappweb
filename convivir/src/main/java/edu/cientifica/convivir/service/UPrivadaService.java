package edu.cientifica.convivir.service;

import java.util.List;

import edu.cientifica.convivir.model.Propietario;
import edu.cientifica.convivir.model.UInmobiliaria;
import edu.cientifica.convivir.model.UPrivada;

public interface UPrivadaService {
	public List<UPrivada> obtenerListaUPrivadaPorUInmobiliariaId(int id);
	public List<UPrivada> obtenerListaUPrivadaPorPropietarioId(int id);

}
