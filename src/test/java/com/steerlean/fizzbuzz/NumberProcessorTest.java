package com.steerlean.fizzbuzz;

import static org.mockito.Matchers.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import com.steerlean.fizzbuzz.rule.DivisibilityRule;
import com.steerlean.fizzbuzz.rule.IRule;
import com.steerlean.fizzbuzz.rule.SumOfDigitsDivisibility;

public class NumberProcessorTest {
	@Test
	public void testProcessRange() {
		RuleEngine ruleEngineMock = mock(RuleEngine.class);
		when(ruleEngineMock.run(anyInt())).thenReturn("hai");
		
		List<String> processedNumbers = new ArrayList<String>();
		
		NumberProcessor numberProcessor = new NumberProcessor(ruleEngineMock);
		numberProcessor.processRange(1, 2, processedNumbers);
		
		Assert.assertEquals(2, processedNumbers.size());
		Assert.assertTrue(processedNumbers.contains("hai"));
	}
	
	@Test
	public void testProcessRange1() {
		//ARRANGE
		RuleEngine ruleEngineMock = mock(RuleEngine.class);
		when(ruleEngineMock.run(2)).thenReturn("hai");
		when(ruleEngineMock.run(3)).thenReturn("ba");
		when(ruleEngineMock.run(4)).thenReturn("bon");
		
		List<String> processedNumbers = new ArrayList<String>();
		
		NumberProcessor numberProcessor = new NumberProcessor(ruleEngineMock);
		numberProcessor.processRange(2, 4, processedNumbers);
		
		Assert.assertEquals(3, processedNumbers.size());
		Assert.assertTrue(processedNumbers.contains("hai"));
		Assert.assertTrue(processedNumbers.contains("ba"));
		Assert.assertTrue(processedNumbers.contains("bon"));
	}
}
