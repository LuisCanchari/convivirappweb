package edu.cientifica.convivir.service;

import java.util.List;


import edu.cientifica.convivir.model.UInmobiliaria;

public interface UInmobiliariaService {
	
	public UInmobiliaria registrarUInmobiliaria(UInmobiliaria uinmobiliaria);
	public UInmobiliaria modificarUInmobiliaria (UInmobiliaria uinmobiliaria);
	public Boolean eliminarUInmobiliaria (int id);
	public UInmobiliaria obtenerUInmobiliariaPorId (int id);
	public List<UInmobiliaria> obtenerListaUInmobiliaria ();


}
