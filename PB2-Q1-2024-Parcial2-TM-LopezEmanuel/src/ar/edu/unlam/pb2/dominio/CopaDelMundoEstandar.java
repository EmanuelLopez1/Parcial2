package ar.edu.unlam.pb2.dominio;

import ar.edu.unlam.pb2.enums.Materiales;

public class CopaDelMundoEstandar extends CopaDelMundo {
	private Integer stock ;


	public CopaDelMundoEstandar(String nombre, Materiales plastico, Long id, double Precio,Integer stock) {
		// TODO Auto-generated constructor stub
		super(nombre, plastico, id, Precio);
		this.stock = stock;
	}
	

}
	
