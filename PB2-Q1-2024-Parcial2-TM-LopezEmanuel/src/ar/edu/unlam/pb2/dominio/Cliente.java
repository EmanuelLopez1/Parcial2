package ar.edu.unlam.pb2.dominio;

public class Cliente {

	private String nombre;
	private String apellido;
	private Integer id;

	public Cliente(String nombre, String apellido,Integer id) {
		// TODO Auto-generated constructor stub
		this.nombre  = nombre;
		this.apellido = apellido;
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
		
	}
	
}
