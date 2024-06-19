package ar.edu.unlam.pb2.dominio;

import ar.edu.unlam.pb2.enums.Materiales;

public class CopaDelMundo {

	private String nombre;
	private Materiales tipoMateriales;
	private Long id;
	private Double precio;

	public CopaDelMundo(String nombre, Materiales tipoMateriales,Long id, Double precio) {
		// TODO Auto-generated constructor stub
		this.nombre = nombre;
		this.tipoMateriales = tipoMateriales;
		this.id = id;
		this.precio = precio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	

	public Materiales getTipoMateriales() {
		return tipoMateriales;
	}

	public void setTipoMateriales(Materiales tipoMateriales) {
		this.tipoMateriales = tipoMateriales;
	}

	public Long getLong() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	
	
}
