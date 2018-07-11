package com.qa.calculator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MultiplicationsTest {
	public Multiplications multiplication;
	
	@Before
	public void init() {
		multiplication = new Multiplications();
		
	}
	
	@Test
	public void testxTimesY() {
		int actualValue = multiplication.xTimesY(4,2);
		Assert.assertEquals(8, actualValue);
	}
}
