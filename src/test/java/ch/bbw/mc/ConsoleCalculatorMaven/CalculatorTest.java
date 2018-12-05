package ch.bbw.mc.ConsoleCalculatorMaven;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class CalculatorTest {

	Calculator testee;
	
	@Before
	public void setUp() {
		testee = new Calculator();
    }

	@Test
	public void summPositivNumbersTestOk(){
		assertTrue(testee.summe(10, 20) == 30);
	}

	@Test
	public void subtractionPositivNumbersTestOk(){
		assertTrue(testee.subtraktion(30, 20) == 10);
	}
	
	@Test(expected=ArithmeticException.class)
	public void divisionExpectedExceptionTest() {
	    assertTrue(testee.division(10, 0) == 5);
	}
}
