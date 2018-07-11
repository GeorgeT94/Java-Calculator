package com.qa.calculator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;



public class DivisionsTest {
	public Divisions divisions;
	
	@Before
	public void init() {
		divisions = new Divisions();
	}
	
	@Test
	public void testxOverY() {
		float actualValue = divisions.xOverY(5,2);
		Assert.assertEquals(2.5, actualValue, 0.001);
	}
}
