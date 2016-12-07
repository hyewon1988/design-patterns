package com.design.singleton;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ChocolateBoilerTest {

	@Test
	public void singletonTest(){
		ChocolateBoiler b1 = ChocolateBoiler.getInstance();
		ChocolateBoiler b2 = ChocolateBoiler.getInstance();
		
		assertEquals(b1.toString(), b2.toString());
	}
}
