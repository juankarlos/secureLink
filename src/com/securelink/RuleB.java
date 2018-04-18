package com.securelink;

public class RuleB extends Rule {
	
	public RuleB(String ruleName, String[] numbers) {
		super(ruleName, numbers);
	}
	
	@Override
	public void Process() {
		for(int current=1; current<super.numbersList.size(); current++) {
			int previous = super.numbersList.get(current-1);
			int next = super.numbersList.get(current);
			if ( next-500 >= previous ) {
				super.setPassed(true);
			} else {
				super.setPassed(false);
			}
		}
		
		super.Process();
	}
}