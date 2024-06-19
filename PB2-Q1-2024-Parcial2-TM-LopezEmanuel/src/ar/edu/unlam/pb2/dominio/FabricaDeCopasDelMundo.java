package ar.edu.unlam.pb2.dominio;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

import ar.edu.unlam.pb2.excepciones.ClienteDuplicadoException;
import ar.edu.unlam.pb2.excepciones.CopaDelMundoNoEncontradaException;

public class FabricaDeCopasDelMundo {

	private String nombre;
	private List<CopaDelMundo> copaDelMundos;
	private List<Cliente> clientes;

	public FabricaDeCopasDelMundo(String nombre) {
		// TODO Auto-generated constructor stub
		this.nombre = nombre;
		this.copaDelMundos = new ArrayList<>();
		this.clientes = new ArrayList<>();
		
	}

	public Boolean agregarCopaDelMundo(CopaDelMundo copaDelMundo) {
		
		
		return copaDelMundos.add(copaDelMundo);
	}

	public Boolean agregarCliente(Cliente cliente) throws ClienteDuplicadoException {
		
		if(cliente.getNombre() != null  && cliente.getApellido() != null ) {
			throw new ClienteDuplicadoException("Es El MISMO cliente");
			
		}
		
		return clientes.add(cliente);
	}

	public List<CopaDelMundo> obtenerCopasDelMundoEstandar() {
		
		
		return null;
	}

	public CopaDelMundo obtenerCopaDelMundoPorId(Long id) throws CopaDelMundoNoEncontradaException {
		
		for (CopaDelMundo copaDelMundo : copaDelMundos) {
			copaDelMundo.getLong().equals(id);
			return copaDelMundo;
			
		}
		throw  new  CopaDelMundoNoEncontradaException("No Existe Esta Copa");
	}

	public void agregarCopaDelMundoEstandarAVentaDeCliente(Cliente clienteDeVenta, Long idCopaDelMundo,
			Integer cantidadAVender) {
		
		
	}

	public void agregarCopaDelMundoPersonalizadaAVentaDeCliente(Cliente clienteDeVenta, Long idCopaDelMundo) {
		
	}

	public Double obtenerPrecioDeCopaDelMundoPersonalizada(Long id)  {
	
		
		return null;
	}

	public Map<Cliente, Double> obtenerTotalDePrecioDeCopasDelMundoEstandarVendidasAClientesOrdenadasPorCliente() {
		
		return null;
	}

	private Venta obtenerVentaPorCliente(Cliente cliente) throws ClienteDuplicadoException {
		
	
		return null;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<CopaDelMundo> getCopaDelMundos() {
		return copaDelMundos;
	}

	public void setCopaDelMundos(List<CopaDelMundo> copaDelMundos) {
		this.copaDelMundos = copaDelMundos;
	}
	

}
