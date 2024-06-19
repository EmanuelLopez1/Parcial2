package ar.edu.unlam.pb2.dominio;

import ar.edu.unlam.pb2.enums.Colores;
import ar.edu.unlam.pb2.enums.Materiales;

public class CopaDelMundoPersonalizada extends CopaDelMundo {
	private Colores colores;

	public CopaDelMundoPersonalizada(String nombre, Materiales tipoMateriales, Long id, Double precio,Colores colores) {
		super(nombre, tipoMateriales, id, precio);
		// TODO Auto-generated constructor stub
		this.colores = colores;
	}

}
