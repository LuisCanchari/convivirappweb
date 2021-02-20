package edu.cientifica.convivir.model;

public class Usuario extends Persona{
	private String username;
	private String password;
	private String correo;
	
	public Usuario() {
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
		return super.toString()+" Usuario [username=" + username + ", password=" + password + ", correo=" + correo + "]";
	}
	
	
	
	
}
