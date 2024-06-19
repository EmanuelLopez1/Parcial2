package ar.edu.unlam.pb2.dominio;

public class Venta {
	private Integer cantidadDeStock ;
	
	public Venta(Integer cantidadDeStock) {
		this.cantidadDeStock = cantidadDeStock;
				
	}

	public Integer getCantidadDeStock() {
		return cantidadDeStock;
	}

	public void setCantidadDeStock(Integer cantidadDeStock) {
		this.cantidadDeStock = cantidadDeStock;
	}
	
	
}
