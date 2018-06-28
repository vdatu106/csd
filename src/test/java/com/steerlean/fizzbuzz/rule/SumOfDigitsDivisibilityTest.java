package com.steerlean.fizzbuzz.rule;

import org.junit.Assert;
import org.junit.Test;


public class SumOfDigitsDivisibilityTest {
	@Test
	public void testParseFiJazz(){
		//Arrange
		SumOfDigitsDivisibility sumOfDigitsDivisibility = new SumOfDigitsDivisibility(6, "FiJazz");
		//Action
		String result = sumOfDigitsDivisibility.parse(12);
		//Assert
		Assert.assertEquals("FiJazz", result);
	}

}
