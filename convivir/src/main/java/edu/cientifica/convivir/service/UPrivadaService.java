package edu.cientifica.convivir.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import edu.cientifica.convivir.model.Propietario;
import edu.cientifica.convivir.model.UInmobiliaria;
import edu.cientifica.convivir.model.UPrivada;

public interface UPrivadaService {
	public List<UPrivada> obtenerListaUPrivadaPorUInmobiliariaId(int id);
	public List<UPrivada> obtenerListaUPrivadaPorPropietarioId(int id);
	public int generarNuevoId();
	public List<HashMap<Integer, String>> obtenerMapaTipoUnidad();
	public UPrivada registrarUPrivada(UPrivada uprivada); 
	public UPrivada obtenerUprivadaPorId(int id);
	public UPrivada actualizarUPrivada(UPrivada uprivada);
	public UPrivada obtenerUprivadaPorCodigo(int id);
}
