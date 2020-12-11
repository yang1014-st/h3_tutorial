package com.virtualpairprogrammers.isbntools;

import static org.junit.Assert.*;

import org.junit.Test;

public class ValidateISBNTest {

	@Test
	public void checkAValidateISBN() {
		ValidateISBN validator = new ValidateISBN();
		boolean result = validator.checkISBN(140449116);// the first expample, does not require 0140449116 to be a string
		assertTrue(result);
	}
	
	
	public void checkAnInvalidISBN() {
		
		ValidateISBN validator = new ValidateISBN();
		boolean result = validator.checkISBN(140449117);// the first expample, does not require 0140449116 to be a string
		assertFalse(result);
		
	}

}
