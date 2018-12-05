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
	
	@Test
	public void divisionNotExpectedExceptionTest() 
	    throws ArithmeticException {
		assertTrue(testee.division(10, 2) == 5);
	}
	
	@Test
	public void multiplicationPositivNumbersTestOk(){
		assertTrue(testee.multiplication(3, 2) == 6);
	}
	
	@Test
	public void multiplicationSummTestOk(){
		assertTrue(testee.multiplicateSumm(3, 2, 3) == 15);
	}
	
	@Test(expected=ArithmeticException.class)
	public void multiplicateDivisionExpectedExceptionTest() {
	    assertTrue(testee.multiplicateDivision(10, 0, 3) == 15);
	}
}
