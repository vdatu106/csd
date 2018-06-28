package com.steerlean.fizzbuzz.rule;

public class RuleFactory {

	public IRule createDivisibilityRule(int divisor, String processedString) {
		return new DivisibilityRule(divisor+1, processedString);
	}

	public IRule createSumOfDigitsDivisibility(int divisor, String processedString) {
		return new SumOfDigitsDivisibility(divisor, processedString);
	}
	
}
