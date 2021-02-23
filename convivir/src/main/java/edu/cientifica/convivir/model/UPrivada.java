package edu.cientifica.convivir.model;

import java.util.List;

public class UPrivada {
	private Integer id;
	private String tipoUnidad;
	private Integer numero;
	private String zona;
	private Double mlFrente;
	private Double mcArea;
	private UInmobiliaria uinmobiliaria;
	private Propietario propietario;
	private List<Residente> listaResidente;
	
	public UPrivada() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTipoUnidad() {
		return tipoUnidad;
	}
	public void setTipoUnidad(String tipoUnidad) {
		this.tipoUnidad = tipoUnidad;
	}
	public Integer getNumero() {
		return numero;
	}
	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	public String getZona() {
		return zona;
	}
	public void setZona(String zona) {
		this.zona = zona;
	}
	public Double getMlFrente() {
		return mlFrente;
	}
	public void setMlFrente(Double mlFrente) {
		this.mlFrente = mlFrente;
	}
	public Double getMcArea() {
		return mcArea;
	}
	public void setMcArea(Double mcArea) {
		this.mcArea = mcArea;
	}
	public UInmobiliaria getUinmobiliaria() {
		return uinmobiliaria;
	}
	public void setUinmobiliaria(UInmobiliaria uinmobiliaria) {
		this.uinmobiliaria = uinmobiliaria;
	}
	public Propietario getPropietario() {
		return propietario;
	}
	public void setPropietario(Propietario propietario) {
		this.propietario = propietario;
	}
	public List<Residente> getListaResidente() {
		return listaResidente;
	}
	public void setListaResidente(List<Residente> listaResidente) {
		this.listaResidente = listaResidente;
	}

	@Override
	public String toString() {
		return "UPrivada [id=" + id + ", tipoUnidad=" + tipoUnidad + ", numero=" + numero + ", zona=" + zona
				+ ", mlFrente=" + mlFrente + ", mcArea=" + mcArea + ", uinmobiliaria=" + uinmobiliaria
				+ ", propietario=" + propietario + "]";
	}
	
	

	
}
