package com.auth;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import junit.framework.TestCase;

class UsuarioTestEED extends TestCase {

	private static Usuario usuario1;
	private static Usuario usuario2;
	private static Usuario usuario3;

	@BeforeAll
	public static void setup() {
		usuario1 = new Usuario("Daniel", "Gutierrez", "Password1");
		usuario2 = new Usuario("Jose", "Guti", "Password");
		usuario3 = new Usuario("Jose", "Guti", "Passwor");
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
		assertFalse(usuario2.esPasswordSegura());
		assertFalse(usuario3.esPasswordSegura());
	}
	
	@Test
	void testHacerLogin() {
		//Me da error
        assertTrue(usuario2.hacerLogin("josgut100", "Password1"));
        assertFalse(usuario2.hacerLogin("DaniGut101", "password"));
	}
	

}
     



     