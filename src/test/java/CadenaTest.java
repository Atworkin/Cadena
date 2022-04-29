import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Cadena.Cadena;

class CadenaTest {

	Cadena target;
	
	@BeforeEach
	void setUp() throws Exception {
		this.target = new Cadena();
	}

	@Test
	void testLongitud() {
		int expected = 4;
		int actual = this.target.longitud("Hola");
		assertEquals(expected,actual);
	}

	@Test
	void testVocales() {
		int expected = 2;
		int actual = this.target.vocales("Hola");
		assertEquals(expected,actual);
	}

	@Test
	void testInvertir() {
		String expected = "aloH";
		String actual = this.target.invertir("Hola");
		assertEquals(expected,actual);
	}

	@Test
	void testContarLetra() {
		int expected = 1;
		int actual = this.target.contarLetra("Hola",'a');
		assertEquals(expected,actual);
	}
	
	
	@Test
	void testLongitudError() {
		int expected = 0;
		int actual = this.target.longitud("Hola");
		assertEquals(expected,actual);
	}

	@Test
	void testVocalesError() {
		int expected = 0;
		int actual = this.target.vocales("Hola");
		assertEquals(expected,actual);
	}

	@Test
	void testInvertirError() {
		String expected = "Hola";
		String actual = this.target.invertir("Hola");
		assertEquals(expected,actual);
	}

	@Test
	void testContarLetraError() {
		int expected = 0;
		int actual = this.target.contarLetra("Hola",'a');
		assertEquals(expected,actual);
	}

}
