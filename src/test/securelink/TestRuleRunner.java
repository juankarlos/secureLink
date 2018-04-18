package test.securelink;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.securelink.Rule;
import com.securelink.RuleA;
import com.securelink.RuleB;
import com.securelink.RuleC;
import com.securelink.RuleRunner;

public class TestRuleRunner {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testAllValid() {
		String[] args = {"100", "50", "30", "50", "60", "20", "5000"};
			
		// Creating 3 test rules with predefined logic. Can inject the logic here.
		Rule ruleATest = new RuleA("RuleA", args);
		Rule ruleBTest = new RuleB("RuleB", args);
		Rule ruleCTest = new RuleC("RuleC", args);
		
		ruleATest.Process();
		assertTrue(ruleATest.isValid());
		
		ruleBTest.Process();
		assertTrue(ruleBTest.isValid());
		
		ruleCTest.Process();
		assertTrue(ruleCTest.isValid());		
	}
	
	@Test
	public void testAInvalid() {
		String[] args = {"100", "50", "30", "50", "60", "20", "970"};
			
		// Creating 3 test rules with predefined logic. Can inject the logic here.
		Rule ruleATest = new RuleA("RuleA", args);
		
		
		ruleATest.Process();
		assertFalse(ruleATest.isValid());
	}
	
	@Test
	public void testBInvalid() {
		String[] args = {"100", "50", "30", "50", "60", "20", "100"};
			
		// Creating 3 test rules with predefined logic. Can inject the logic here.
		Rule ruleBTest = new RuleB("RuleB", args);
		
		
		ruleBTest.Process();
		assertFalse(ruleBTest.isValid());
	}
	
	@Test
	public void testCInvalid() {
		String[] args = {"100", "50", "30", "50", "60", "20", "100"};
			
		// Creating 3 test rules with predefined logic. Can inject the logic here.
		Rule ruleCTest = new RuleC("RuleC", args);
		
		
		ruleCTest.Process();
		assertFalse(ruleCTest.isValid());
	}

}