package com.securelink;

import java.util.ArrayList;
import java.util.List;

public class Rule implements RuleInterface {
	
	List<Integer> numbersList = new ArrayList<Integer>(); 
	private String ruleName = "";
	private Boolean passed = false;
	
	Rule(String ruleName, String[] numbersStr) {
		this.ruleName = ruleName;
		for (String str: numbersStr) {
			numbersList.add(Integer.parseInt(str));
		}
	}

	@Override
	public void Process() {
		System.out.println(String.format("Rule %s %s", this.ruleName, validate()));
	}

	@Override
	public String validate() {
		return this.passed?this.PASSED:this.FAILED;
	}
	
	public boolean isValid() {
		return this.passed;
	}

	public void setPassed(boolean b) {
		this.passed = b;
	}

	public String getRuleName() {
		return ruleName;
	}
	
}