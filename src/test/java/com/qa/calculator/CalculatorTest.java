package com.qa.calculator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
	
	public Calculator calc;
	
	@Before 
	public void init() {
		calc = new Calculator();
	}

	@Test
	public void test() {
		
		int actualValue = calc.additions.xPlusY(2, 2);
		Assert.assertEquals(4, actualValue);
	}
	
	@Test
	public void subtractTest() {
		int actualValue = calc.subtractions.xMinusY(2,2);
		Assert.assertEquals(0, actualValue);
	}

}
