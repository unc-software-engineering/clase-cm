package test.java;

import static org.junit.Assert.*;
import main.java.Calculadora;
import main.java.Sumador;

import org.junit.Before;
import org.junit.Test;

public class CalculadoraTest {

	private Calculadora calculadora;

	@Before
	public void setUp() throws Exception {
		calculadora = new Calculadora();
	}

	@Test
	public void divisionEntera() {
		int actual = calculadora.divisionEntera(10,5);
		int expected = 2;
		assertEquals(expected, actual);
	}
	
	@Test
	public void divisionEnteraPorCero() {
		try {
			calculadora.divisionEntera(10,0);	
			fail("No se genero la excepcion de division por cero");
		} catch (RuntimeException e) {
			String actualExceptionMessage = e.getMessage();
			String expectedExceptionMessage = "Se dividio por cero";
			assertEquals(expectedExceptionMessage, actualExceptionMessage);
		}
	}
	
	@Test
	public void sumaTest() {
		Sumador sumador = new Sumador();
		int real = sumador.suma(3,2);
		int esperado = 5;
		assertEquals(esperado, real);
	}
	
	@Test
	public void sumaTest2() {
		Sumador sumador = new Sumador();
		int real = sumador.suma(4,7);
		int esperado = 11;
		assertEquals(esperado, real);
	}
	
	@Test
	public void sumaTest3() {
		Sumador sumador = new Sumador();
		int real = sumador.suma(1,1);
		int esperado = 2;
		assertEquals(esperado, real);
	}
}
