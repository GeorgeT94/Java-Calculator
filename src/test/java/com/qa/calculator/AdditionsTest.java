package com.qa.calculator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class AdditionsTest {
	public Additions additions;
	
	@Before
	public void init() {
		additions = new Additions();
	}
	
	@Test
	public void testxPlusY() {
		int actualValue = additions.xPlusY(2, 2);
		Assert.assertEquals(4, actualValue);
	}
}
