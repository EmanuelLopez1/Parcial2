package ar.edu.unlam.pb2.dominio;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import ar.edu.unlam.pb2.enums.Colores;
import ar.edu.unlam.pb2.enums.Materiales;
import ar.edu.unlam.pb2.excepciones.ClienteDuplicadoException;
import ar.edu.unlam.pb2.excepciones.CopaDelMundoNoEncontradaException;

public class FabricaCopasDelMundoTest {

	@Test
	public void dadoQueExisteUnaFabricaDeCopasDelMundoSePuedeAgregarUnaCopaDelMundoEstandar() {
		FabricaDeCopasDelMundo fabrica = new FabricaDeCopasDelMundo("Copas");
		
		CopaDelMundoEstandar copaEstandar = new CopaDelMundoEstandar ("Qatar",Materiales.PLASTICO,(long) 1,100.0,20);
		
		Boolean agregarCopaEstandar = fabrica.agregarCopaDelMundo(copaEstandar); 
		
		assertTrue(agregarCopaEstandar);
		
	}

	@Test
	public void dadoQueExisteUnaFabricaDeCopasDelMundoSePuedeAgregarUnaCopaDelMundoPersonalizada() {
		FabricaDeCopasDelMundo fabrica = new FabricaDeCopasDelMundo("Copas");
		
		CopaDelMundoPersonalizada copaPersonalizada = new CopaDelMundoPersonalizada ("Qatar",Materiales.PLASTICO,(long) 1,100.0,Colores.CAOBA);
		
		Boolean agregarCopaPersonalizada = fabrica.agregarCopaDelMundo(copaPersonalizada); 
		
		
		assertTrue(agregarCopaPersonalizada);
		
	}

	@Test (expected = ClienteDuplicadoException.class)
	public void dadoQueExisteUnaFabricaDeCopasDelMundoAlAgregarUnClienteExistenteSeLanzaUnaClienteDuplicadoException() throws ClienteDuplicadoException {
		FabricaDeCopasDelMundo fabrica = new FabricaDeCopasDelMundo("Copas");
		
		Cliente cliente = new Cliente ("andres","cuchitini",1);
		
		Boolean agregarCliente = fabrica.agregarCliente(cliente);
		
		fabrica.agregarCliente(cliente);
		fabrica.agregarCliente(cliente);
		
		
		
		
		
	}

	@Test
	public void dadoQueExisteUnaFabricaQuePoseeCopasDelMundoSePuedenObtenerLasCopasDelMundoEstandar() {
		FabricaDeCopasDelMundo fabrica = new FabricaDeCopasDelMundo("Copas");
		
		CopaDelMundoEstandar copaEstandar = new CopaDelMundoEstandar ("Qatar",Materiales.PLASTICO,(long) 1,100.0,20);
		
		CopaDelMundoEstandar copaEstandar2 = new CopaDelMundoEstandar ("Brazil",Materiales.PLASTICO,(long) 2,100.0,20);
		fabrica.agregarCopaDelMundo(copaEstandar);
		
		fabrica.agregarCopaDelMundo(copaEstandar2);
		
		
		
		
		
		
		
		
		
		
	}

	@Test
	public void dadoQueExisteUnaFabricaDeCopasDelMundoConCopasDelMundoPuedoObtenerUnaCopaDelMundoPorSuId() throws CopaDelMundoNoEncontradaException {
		FabricaDeCopasDelMundo fabrica = new FabricaDeCopasDelMundo("Copas");
		
		CopaDelMundoEstandar copaEstandar = new CopaDelMundoEstandar ("Qatar",Materiales.PLASTICO,(long) 1,100.0,20);
	
		fabrica.agregarCopaDelMundo(copaEstandar);
		
		CopaDelMundoEstandar obtenido = (CopaDelMundoEstandar) fabrica.obtenerCopaDelMundoPorId((long) 1);
		
		assertEquals(copaEstandar, obtenido);
		
		
	}

	@Test
	public void dadoQueExisteUnaFabricaDeCopasDelMundoConCopasDelMundoAlAgregarCincoCopasDelMundoAUnaVentaDeCopasDelMundoEstandarParaUnClienteSeDescuentanCincoUnidadesDelStockDeCopasDelMundoEstandar() {
	}

	@Test
	public void dadoQueExisteUnaFabricaDeCopasDelMundoConCopasDelMundoAlAgregarUnaVentaDeCopasDelMundoPersonalizadaParaUnClienteSeRemueveLaCopaDelMundoPersonalizadaDeLaFabrica() {
	}

	@Test
	public void dadoQueExisteUnaFabricaDeCopasDelMundoConCopasDelMundoPersonalizadasSePuedeObtenerElPrecioDeUnaCopaDelMundoPersonalizada() {
	}

	@Test
	public void dadoQueExisteUnaFabricaDeCopasDelMundoConVentasDeCopasDelMundoEstandarYPersonalizadasVendidasAClientesSePuedeObtenerUnMapaConClaveClienteYTotalDeVentasDeCopasEstandarOrdenadoPorCliente() {
	}
}
