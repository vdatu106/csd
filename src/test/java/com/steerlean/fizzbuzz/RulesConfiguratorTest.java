package com.steerlean.fizzbuzz;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import com.steerlean.fizzbuzz.rule.DivisibilityRule;
import com.steerlean.fizzbuzz.rule.IRule;
import com.steerlean.fizzbuzz.rule.RuleFactory;
import com.steerlean.fizzbuzz.rule.SumOfDigitsDivisibility;


public class RulesConfiguratorTest {
	
	@Test
	public void testRulesConfigurator() {
		RuleFactory ruleFactoryMock = mock(RuleFactory.class);
		
		IRule irule = mock(DivisibilityRule.class);
		when(ruleFactoryMock.createDivisibilityRule(3, "Fizz")).thenReturn(irule);
		
		IRule irule1 = mock(DivisibilityRule.class);
		when(ruleFactoryMock.createDivisibilityRule(5, "Buzz")).thenReturn(irule1);
		
		IRule irule2 = mock(SumOfDigitsDivisibility.class);
		when(ruleFactoryMock.createSumOfDigitsDivisibility(6, "FiJazz")).thenReturn(irule2);
		
		IRule irule3 = mock(SumOfDigitsDivisibility.class);
		when(ruleFactoryMock.createSumOfDigitsDivisibility(5, "BuJazz")).thenReturn(irule3);
		
		
		RulesConfigurator ruleConfigurator = new RulesConfigurator(ruleFactoryMock);
		
		List<IRule> list = ruleConfigurator.configure();
		
		Assert.assertEquals(4, list.size());
		
		Assert.assertTrue(list.contains(irule));
		Assert.assertTrue(list.contains(irule1));
		Assert.assertTrue(list.contains(irule2));
		Assert.assertTrue(list.contains(irule3));
		
		
	}

}
