package com.steerlean.fizzbuzz;

import java.util.List;

import com.steerlean.fizzbuzz.rule.IRule;

public class RuleEngineStub extends RuleEngine {

	public RuleEngineStub(List<IRule> rules) {
		super(rules);
	}
	
	@Override
	public String run(Integer number) {
		return "Stub";
	}

}
