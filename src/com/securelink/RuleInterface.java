package com.securelink;

public interface RuleInterface {
	
	public final String PASSED = "passed";
	public final String FAILED = "failed";
	
	public void Process();
	
	public String validate();
}