package ch.bbw.mc.ConsoleCalculatorMaven;

import static org.junit.Assert.*;

import org.junit.Test;


public class CalculatorTest {

	Calculator testee;

	@Test
	public void summPositivNumbersTestOk(){
		testee = new Calculator();
		assertTrue(testee.summe(10, 20) == 30);
	}

}
