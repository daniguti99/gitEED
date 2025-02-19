package eed;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MyString1ObjTest {

	@Test
	public void esPalindromaTest() {
		MyString1 str1 = new MyString1("Hola mundo");
		MyString1 str2 = new MyString1("reconocer");
		assertFalse(str1.isEsPalindroma());
		assertTrue(str2.isEsPalindroma());
	}

}
