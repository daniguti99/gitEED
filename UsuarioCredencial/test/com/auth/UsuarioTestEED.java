package com.auth;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import junit.framework.TestCase;

class UsuarioTestEED extends TestCase {

	private static Usuario usuario1;
	private static Usuario usuario2;
	private static Usuario usuario3;
	private static Usuario usuario4;

	@BeforeAll
	public static void setup() {
		usuario1 = new Usuario("Daniel", "Gutierrez", "Password1");
		usuario2 = new Usuario("Jose", "Guti", "Password1");
		usuario3 = new Usuario("Jose", "Guti", "Passwor");
		usuario4 = new Usuario("Jose", "Guti", "dgmdslsf@gmail.com", "Passwor");
	}
	
	@Test
	void testEsCuentaBloqueada() {
		usuario1.hacerLogin("DanGut100", "Password1");
		usuario1.hacerLogin("DanGut100", "Password1");
		usuario1.hacerLogin("DanGut100", "Password1");
		assertTrue(usuario1.esCuentaBloqueada());
	}
	
	@Test
	void testModificarPassword() {
		assertTrue(usuario1.modificarPassword("Password1", "NewPassword123", "NewPassword123"));
		assertFalse(usuario1.modificarPassword("Password1", "NewPassword123", "NewPassword12"));
		assertFalse(usuario1.modificarPassword("Password", "NewPassword123", "NewPassword123"));
		assertFalse(usuario1.modificarPassword("NewPassword123", "NewPassword123", "NewPassword123"));
	}
	
	@Test
	void testEsPasswordSegura() {
		assertTrue(usuario1.esPasswordSegura());
		assertFalse(usuario3.esPasswordSegura());
	}
	
	@Test
	void testHacerLogin() {
        assertTrue(usuario2.hacerLogin("josgut101", "Password1"));
        assertFalse(usuario2.hacerLogin("DaniGut101", "password"));
	}
	
}
     



     