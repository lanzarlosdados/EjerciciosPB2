package ar.edu.unlam.pb2.practica;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class TestPersona {

	

	@Test
	public void testPesoIdeal() {
		Persona fabian = new Persona("fabian", 111111111, 'H', 70.0, 1.68, "30/03/1989"); 
		
		Integer esperado=0;
		Integer actual= fabian.calcularIMC();
		
		assertEquals(esperado,actual);
	}
	
	@Test
	public void testSobrePeso() {
		Persona fabian = new Persona("fabian", 111111111, 'H', 100.0, 1.68, "30/03/1989"); 
		
		Integer esperado=1;
		Integer actual= fabian.calcularIMC();
		
		assertEquals(esperado,actual);
	}
	
	@Test
	public void testBajoPeso() {
		Persona fabian = new Persona("fabian", 111111111, 'H', 50.0, 1.68, "30/03/1989"); 
		
		Integer esperado=-1;
		Integer actual= fabian.calcularIMC();
		
		assertEquals(esperado,actual);
	}
	
	@Test
	public void testSiEsMayorDeEdad() {
		Persona fabian = new Persona("fabian", 111111111, 'H', 50.0, 1.68, "30/03/1989"); 
		
		Boolean actual= fabian.esMayorDeEdad();
		
		assertTrue(actual);
	}
	
	
	

}
