package edu.cientifica.convivir.service;

import java.util.List;

import edu.cientifica.convivir.model.Administrador;

public interface AdministradorService {
	public Administrador registrarAdministrador (Administrador administrador);
	public Administrador modificarAdministrador (Administrador administrador);
	public Boolean eliminarAdministrador (int id);
	public Administrador obtenerAdministradorPorId (int id);
	public List<Administrador> obtenerListaAdministrador ();

}
