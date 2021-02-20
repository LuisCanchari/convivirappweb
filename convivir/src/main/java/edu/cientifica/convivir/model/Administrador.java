package edu.cientifica.convivir.model;

import java.util.List;

public class Administrador extends Usuario{
	private List<UInmobiliaria> listaUInmobiliaria;
		
	public Administrador() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public List<UInmobiliaria> getListaUInmobiliaria() {
		return listaUInmobiliaria;
	}

	public void setListaUInmobiliaria(List<UInmobiliaria> listaUInmobiliaria) {
		this.listaUInmobiliaria = listaUInmobiliaria;
	}

	@Override
	public String toString() {
		return super.toString()+ " Administrador [listaUInmobiliaria=" + listaUInmobiliaria + "]";
	}
}
