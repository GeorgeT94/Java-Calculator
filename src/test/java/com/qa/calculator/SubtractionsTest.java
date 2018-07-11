package com.qa.calculator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SubtractionsTest {
	public Subtractions subtractions;
	
	@Before
	public void init() {
		subtractions = new Subtractions();
	}
	
	@Test
	public void testxMinusY() {
		int actualValue = subtractions.xMinusY(4, 2);
		
		Assert.assertEquals(2, actualValue);
	}
	
	
}
