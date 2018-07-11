package com.qa.calculator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MultiplicationsTest {
	@Before
	public void init() {
		Multiplications multiplication = new Multiplications();
		
	}
	
	@Test
	public void testxTimesY() {
		int actualValue = multiplication.xTimesY(4,2);
		Assert.assertEquals(8, actualValue);
	}
}
