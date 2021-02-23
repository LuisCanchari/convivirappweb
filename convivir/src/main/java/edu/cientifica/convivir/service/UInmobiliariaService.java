package edu.cientifica.convivir.service;

import java.util.List;

import edu.cientifica.convivir.model.Administrador;
import edu.cientifica.convivir.model.UInmobiliaria;
import edu.cientifica.convivir.model.Usuario;
import edu.cientifica.convivir.model.UsuarioFinal;

public interface UInmobiliariaService {
	
	public UInmobiliaria registrarUInmobiliaria(UInmobiliaria uinmobiliaria);
	public UInmobiliaria modificarUInmobiliaria (UInmobiliaria uinmobiliaria);
	public Boolean eliminarUInmobiliaria (int id);
	public UInmobiliaria obtenerUInmobiliariaPorId (int id);
	public List<UInmobiliaria> obtenerListaUInmobiliaria ();
	
	public List<UInmobiliaria> obtenerUInmobiliariaPorAdministrador(Administrador administrador);
	public UInmobiliaria obtenerUInmobiliariaPorUsuarioFinal(UsuarioFinal usuarioFinal);
	
}
