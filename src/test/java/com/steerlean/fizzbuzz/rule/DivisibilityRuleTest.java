package com.steerlean.fizzbuzz.rule;

import org.junit.Assert;
import org.junit.Test;

public class DivisibilityRuleTest {
	
	@Test
	public void testParseCorrectDevisible() {
		//Arrange
		IRule divisibilityRule = new DivisibilityRule(6, "FiJazz");
		//Action
		String result = divisibilityRule.parse(6);
		//Assert
		Assert.assertEquals("FiJazz", result);
	}
	
	@Test
	public void testParseIncorectDevisible() {
		//Arrange
		IRule divisibilityRule = new DivisibilityRule(5, "BuJazz");
		//Action
		String result = divisibilityRule.parse(8);
		//Assert
		Assert.assertNotEquals("BuJazz", result);
	}
	
	@Test(expected=Exception.class)
	public void testParseZeroDevisible() {
		//Arrange
		IRule divisibilityRule = new DivisibilityRule(0, "BuJazz");
		//Action
		String result = divisibilityRule.parse(8);
	}
}
