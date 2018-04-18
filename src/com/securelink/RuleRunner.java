package com.securelink;

import java.util.ArrayList;

public class RuleRunner {
	
	private static final String ALL_RULES = "All rules passed";
		
	// List of possible rules.
	ArrayList<Rule> rules = new ArrayList<Rule>();
	
	/**
	 * Store each one of the created rules, modify for each new rule.
	 */
	public RuleRunner(Rule ruleATest, Rule ruleBTest, Rule ruleCTest) {
		rules.add(ruleATest);
		rules.add(ruleBTest);
		rules.add(ruleCTest);
	}

	public RuleRunner() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Process each one of the rules.
	 */
	private void processRules() {
		boolean allPassed = true;
		for (Rule rule: rules) {
			rule.Process();
			if (!rule.isValid()) allPassed = false;
		}
		
		if (allPassed) {
			System.out.println(ALL_RULES);
		}
		
	}
	
	public static void main(String[] args) {
		
		//String[] args2 = {"100", "50", "30", "50", "60", "20", "500"};
		//String[] args2 = {"500", "500", "1500"};
		args = new String[] {"0", "1000"};
			
		// Creating 3 test rules with predefined logic. Can inject the logic here.
		Rule ruleATest = new RuleA("RuleA", args);
		Rule ruleBTest = new RuleB("RuleB", args);
		Rule ruleCTest = new RuleC("RuleC", args);
		
		// Initialize the runner and start processing.
		RuleRunner runner = new RuleRunner(ruleATest, ruleBTest, ruleCTest);
		runner.processRules();
	}

}