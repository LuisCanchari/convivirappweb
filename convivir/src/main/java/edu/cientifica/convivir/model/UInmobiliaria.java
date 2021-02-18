package edu.cientifica.convivir.model;
import java.util.List;

public class UInmobiliaria {
	private Integer id;
	private String nombreCorto;
	private String nombreLargo;
	private String direccion;
	private String codigoUbigeo;
	private String mapaLatitud;
	private String mapaLongitud;
	private Administrador administrador;

	private List<UPrivada> listaUPrivada;
	
	public UInmobiliaria() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombreCorto() {
		return nombreCorto;
	}

	public void setNombreCorto(String nombreCorto) {
		this.nombreCorto = nombreCorto;
	}

	public String getNombreLargo() {
		return nombreLargo;
	}

	public void setNombreLargo(String nombreLargo) {
		this.nombreLargo = nombreLargo;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getCodigoUbigeo() {
		return codigoUbigeo;
	}

	public void setCodigoUbigeo(String codigoUbigeo) {
		this.codigoUbigeo = codigoUbigeo;
	}

	public String getMapaLatitud() {
		return mapaLatitud;
	}

	public void setMapaLatitud(String mapaLatitud) {
		this.mapaLatitud = mapaLatitud;
	}

	public String getMapaLongitud() {
		return mapaLongitud;
	}

	public void setMapaLongitud(String mapaLongitud) {
		this.mapaLongitud = mapaLongitud;
	}
	
	
	public Administrador getAdministrador() {
		return administrador;
	}

	public void setAdministrador(Administrador administrador) {
		this.administrador = administrador;
	}

	public List<UPrivada> getListaUPrivada() {
		return listaUPrivada;
	}

	public void setListaUPrivada(List<UPrivada> listaUPrivada) {
		this.listaUPrivada = listaUPrivada;
	}

	@Override
	public String toString() {
		return "UInmobiliaria [id=" + id + ", nombreCorto=" + nombreCorto + ", nombreLargo=" + nombreLargo
				+ ", direccion=" + direccion + ", codigoUbigeo=" + codigoUbigeo + ", mapaLatitud=" + mapaLatitud
				+ ", mapaLongitud=" + mapaLongitud + ", listaUPrivada=" + listaUPrivada + "]";
	}
	
	
	
	
}
