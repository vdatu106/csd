package com.steerlean.fizzbuzz.rule;

import org.junit.Assert;
import org.junit.Test;


public class RuleFactoryTest {
	@Test
	public void testCreateDivisibilityRule1() {
		//
		RuleFactory ruleFactory = new RuleFactory();
		//act
		IRule iRule = ruleFactory.createDivisibilityRule(4, "aka");
		//
		Assert.assertTrue(iRule instanceof DivisibilityRule);
	}
	
	@Test
	public void testCreateDivisibilityRule() {
		//
		RuleFactory ruleFactory = new RuleFactory();
		//act
		DivisibilityRule iRule = (DivisibilityRule)ruleFactory.createDivisibilityRule(4, "aka");
		
		//
		Assert.assertEquals(new DivisibilityRule(4, "aka"), iRule);
	}
	
	
	@Test
	public void testSumOfDigitsDivisibility1() {
		//
		RuleFactory ruleFactory = new RuleFactory();
		//act
		IRule iRule = ruleFactory.createDivisibilityRule(4, "aka");
		//
		Assert.assertTrue(iRule instanceof SumOfDigitsDivisibility);
	}
}
