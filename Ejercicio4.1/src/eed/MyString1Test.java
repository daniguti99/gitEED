package eed;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;

class MyString1Test {

	@Test
	void testContarPalabras() {
			assertEquals(2,MyString1.contarPalabras("Mi madre"));
			assertEquals(0,MyString1.contarPalabras(""));
			assertEquals(4,MyString1.contarPalabras("Mi madre es rubia"));
			assertNotEquals(4,MyString1.contarPalabras(null));
			assertEquals(4,MyString1.contarPalabras(" Mi madre es rubia"));
	}

	@Test
	void testContarLetrasDiferentes() {
			assertEquals(4,MyString1.contarLetrasDiferentes("hola"));
			assertEquals(6,MyString1.contarLetrasDiferentes("Mi madre"));
			assertEquals(5,MyString1.contarLetrasDiferentes("Padre"));
			assertEquals(0,MyString1.contarLetrasDiferentes(""));
			assertEquals(0,MyString1.contarLetrasDiferentes(null));
			assertEquals(5,MyString1.contarLetrasDiferentes(" Padre"));
			assertEquals(1,MyString1.contarLetrasDiferentes("ñ"));
	}

	@Test
	void testContarFrecuenciaPalabras() {
		Map<String, Integer> frecuenciaPalabras = new HashMap<>();
		
		assertTrue(Map.of("mapa",3,"blanco", 1).equals(MyString1.contarFrecuenciaPalabras("blanco mapa mapa mapa")));
		assertTrue(frecuenciaPalabras.equals(MyString1.contarFrecuenciaPalabras("")));
		assertTrue(frecuenciaPalabras.equals(MyString1.contarFrecuenciaPalabras(null)));
	}

	@Test
	void testContarFrecuenciaLetras() {
		Map<Character, Integer> frecuenciaLetras = new HashMap<>();
		
		assertTrue(Map.of('i',3).equals(MyString1.contarFrecuenciaLetras("iii")));
		assertTrue(frecuenciaLetras.equals(MyString1.contarFrecuenciaLetras("")));
		assertTrue(frecuenciaLetras.equals(MyString1.contarFrecuenciaLetras(null)));
	}

	@Test
	void testEsPalindroma() {
		assertTrue(MyString1.esPalindroma("reconocer"));
		assertTrue(MyString1.esPalindroma(" reconocer "));	
		assertFalse(MyString1.esPalindroma("futbol"));
		assertFalse(MyString1.esPalindroma(null));
		assertFalse(MyString1.esPalindroma(""));
	}
	
	@Test
	void testMyString1() {
		MyString1 ms=new MyString1("aa");
		assertTrue(ms.getContarPalabras()==1);
		assertTrue(ms.getContarLetrasDiferentes()==1);
		assertTrue(ms.isEsPalindroma());
		assertTrue(ms.getContarFrecuenciaPalabras()==Map.of("aa",1));
		assertTrue(ms.getContarFrecuenciaLetras().equals(Map.of('a',2)));
	}

}


