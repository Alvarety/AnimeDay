package clase;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class claseTest {

	@Test
	void testCalcularIMC() {
		clase objeto = new clase();
		double imc = objeto.calcularIMC(75, 1.80); 
		assertEquals(23.148148148148145, imc);
	}

	@Test
	void testClasificarIMC() {
		clase objeto = new clase();
		assertEquals("Bajo peso", objeto.clasificarIMC(18.0));
		assertEquals("Peso normal", objeto.clasificarIMC(22.0));
		assertEquals("Sobrepeso", objeto.clasificarIMC(25.0));
		assertEquals("Obesidad", objeto.clasificarIMC(30.0));
	}

	@Test
	void testEsPar() {
		clase objeto = new clase();
		assertTrue(objeto.esPar(2));
		assertFalse(objeto.esPar(3));
	}

	@Test
	void testEjecutarSaludo() {
		clase objeto = new clase();
		String saludo = objeto.ejecutarSaludo("Hola", "Agustín");
		assertEquals("Hola Agustín", saludo);
	}

	@Test
	void testInteresCompuesto() {
		clase objeto = new clase();
		double montoFinal = objeto.interesCompuesto(10000, 5.9f, 60);
        assertEquals(311714.9486829751, montoFinal);
	}

	@Test
	void testRedondear() {
		clase objeto = new clase();
		assertEquals("311714,95", objeto.redondear(311714.9486829751));
	}

	@Test
	void testContarLetras() {
		clase objeto = new clase();
		assertEquals(4, objeto.contarLetras("Hola"));
	}

	@Test
	void testContarCaracteresEnCadena() {
		clase objeto = new clase();
		assertEquals(3, objeto.contarCaracteresEnCadena("banana", "a"));
	}

}
