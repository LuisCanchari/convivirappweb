package edu.cientifica.convivir.service;

import java.util.List;

import edu.cientifica.convivir.model.Administrador;
import edu.cientifica.convivir.model.UInmobiliaria;
import edu.cientifica.convivir.model.Usuario;

public interface AdministradorService{
	
	public List<UInmobiliaria> obtenerListaUInmobiliariaPorAdministrador(Administrador administrador);
	public Administrador obtenerAdministradorPorUsuario (Usuario usuario); 
	public Administrador obtenerAdministradorPorId(int id);
}
