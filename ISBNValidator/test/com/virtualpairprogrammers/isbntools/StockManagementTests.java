package com.virtualpairprogrammers.isbntools;

import static org.junit.Assert.*;

import org.junit.Test;

public class StockManagementTests {
	

	@Test
	public void testCanGetACorectLocatorCode() {
		
		ExtendISBNDataService testSevice=new ExtendISBNDataService() {
			@Override
			public Book lookup(String isbn) {
				return new Book (isbn,"Of mice And Men","J.Seinbeck");
			}
		};
		
		
		
		StockManager stockManager = new StockManager();
		stockManager.setService(testSevice);
		
		String isbn = "0140177396";
		String locatorCode = stockManager.getLocator(isbn);
		assertEquals("7396J4",locatorCode);
		
	}

}
