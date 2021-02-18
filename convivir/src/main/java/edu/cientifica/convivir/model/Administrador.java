package edu.cientifica.convivir.model;

import java.util.List;

public class Administrador extends Persona{
	private String username;
	private String password;
	private String correo;
	
	private List<UInmobiliaria> listaUInmobiliaria;
		
	public Administrador() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	@Override
	public String toString() {
		return super.toString()+ " Administrador [username=" + username + ", password=" + password + ", correo=" + correo + "]";
	}
	
	public List<UInmobiliaria> getListaUInmobiliaria() {
		return listaUInmobiliaria;
	}
	public void setListaUInmobiliaria(List<UInmobiliaria> listaUInmobiliaria) {
		this.listaUInmobiliaria = listaUInmobiliaria;
	}
	
	
	
}
