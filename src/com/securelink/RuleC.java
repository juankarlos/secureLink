package com.securelink;

public class RuleC extends Rule {
	
	public RuleC(String ruleName, String[] numbers) {
		super(ruleName, numbers);
	}
	
	@Override
	public void Process() {
		double average = 0;
		for(int current=0; current<super.numbersList.size(); current++) {
			average += super.numbersList.get(current);
		}
		
		if (average/super.numbersList.size() >= 500)
			super.setPassed(true);
		
		super.Process();
	}
}