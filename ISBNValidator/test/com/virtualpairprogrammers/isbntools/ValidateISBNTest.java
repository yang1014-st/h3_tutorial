package com.virtualpairprogrammers.isbntools;

import static org.junit.Assert.*;

import org.junit.Test;

public class ValidateISBNTest {

	@Test
	public void checkAValidateISBN() {
		ValidateISBN validator = new ValidateISBN();
		boolean result = validator.checkISBN("0140449116");// the first expample, does not require 0140449116 to be a string
		assertTrue("first value", result);
		
		result = validator.checkISBN("0140177396");
		assertTrue("second value", result);
		
	}
	
	@Test
	public void checkAnInvalidISBN() {
		
		ValidateISBN validator = new ValidateISBN();
		boolean result = validator.checkISBN("0140449117");// the first expample, does not require 0140449116 to be a string
		assertFalse(result);
		
	}
	
	@Test(expected = NumberFormatException.class)
	public void nineDigitISBNAreNotAllowed() {
		ValidateISBN validator = new ValidateISBN();
		validator.checkISBN("123456789");
		
	}
	
	@Test(expected = NumberFormatException.class)
	public void nunNumericISBNAreNotAllowed() {
		ValidateISBN validator = new ValidateISBN();
		validator.checkISBN("helloworld");
		
	}
	
	

	

}
