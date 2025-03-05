package com.model;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;


class PersonaTest {
	private static Persona Constructor2Daniel;
	private static Persona Constructor1Vacio;
	private static Persona Constructor2Vacio;
	private static Persona Constructor3Pepe;
	private static Persona infrapeso;
	private static Persona sexoFemenino;
	private static Persona sobrepeso;
	
	@BeforeAll
	public static void setup() {
		Constructor2Daniel = new Persona("Daniel", 26, 'H');
		Constructor1Vacio = new Persona();
		Constructor2Vacio = new Persona();
		Constructor3Pepe = new Persona("Pepe", 26, 'R', 78, 1.85);
		sexoFemenino = new Persona("María", 14, 'M', 78, 1.78);
		infrapeso = new Persona("María", 25, 'M', 40, 1.78);
		sobrepeso = new Persona("María", 25, 'M', 190, 1.60);
	}
	
	@Test
	public void ConstructorPersonaVacioTest() {
		assertEquals("", Constructor2Vacio.getNombre());
		assertEquals(0, Constructor2Vacio.getEdad());
		assertEquals('H', Constructor2Vacio.getSexo());
		assertEquals(0, Constructor2Vacio.getPeso());
		assertEquals(0, Constructor2Vacio.getAltura());
		
	}
	
	@Test
	public void Constructor2Test() {
		assertEquals('H', Constructor2Daniel.getSexo());
		assertEquals("Daniel", Constructor2Daniel.getNombre());
		assertEquals(26, Constructor2Daniel.getEdad());	
	}
	
	@Test
	public void Constructor3Pepe() {
		assertEquals('H', Constructor3Pepe.getSexo());
		assertEquals("Pepe", Constructor3Pepe.getNombre());
		assertEquals(26, Constructor3Pepe.getEdad());	
		assertEquals(78, Constructor3Pepe.getPeso());
		assertEquals(1.85, Constructor3Pepe.getAltura());
	}
	
	@Test
	public void setNombreTest() {
		Constructor3Pepe.setNombre("Pepe");
		assertEquals("Pepe", Constructor3Pepe.getNombre());
	}
	
	@Test
	public void setSexoTest() {
		Constructor1Vacio.setSexo('M');
		assertEquals('M', Constructor1Vacio.getSexo());
	}
	
	@Test
	public void setEdadTest() {
		Constructor1Vacio.setEdad(80);
		assertEquals(80, Constructor1Vacio.getEdad());
	}
	
	@Test
	public void setPesoTest() {
		Constructor1Vacio.setPeso(80);
		assertEquals(80, Constructor1Vacio.getPeso());
	}
	
	@Test
	public void setAltura() {
		Constructor1Vacio.setAltura(1.84);
		assertEquals(1.84, Constructor1Vacio.getAltura()); 
	}
	
	
	@Test
	public void calcularIMCTest() {
		assertEquals(0, Constructor3Pepe.calcularIMC());
		assertEquals(-1, infrapeso.calcularIMC());
		assertEquals(1, sobrepeso.calcularIMC());
		
	}
	
	@Test
	public void esMayorEdadTest() {
		assertEquals(true ,Constructor3Pepe.esMayorDeEdad());
		assertNotEquals(true ,sexoFemenino.esMayorDeEdad());
	}
	
	@Test
	public void toStringTest() {
		assertEquals("Informacion de la persona:\n"

                + "Nombre: " + Constructor3Pepe.getNombre() + "\n"

                + "Sexo: " + "hombre" + "\n"

                + "Edad: " + Constructor3Pepe.getEdad() + "años\n"

                + "DNI: " + Constructor3Pepe.getDNI() + "\n"

                + "Peso: " + Constructor3Pepe.getPeso() + " kg\n"

                + "Altura: " + Constructor3Pepe.getAltura() + " metros\n", Constructor3Pepe.toString());
		
		assertEquals("Informacion de la persona:\n"

                + "Nombre: " + sobrepeso.getNombre() + "\n"

                + "Sexo: " + "mujer" + "\n"

                + "Edad: " + sobrepeso.getEdad() + "años\n"

                + "DNI: " + sobrepeso.getDNI() + "\n"

                + "Peso: " + sobrepeso.getPeso() + " kg\n"

                + "Altura: " + sobrepeso.getAltura() + " metros\n", sobrepeso.toString());
	}
	


}
