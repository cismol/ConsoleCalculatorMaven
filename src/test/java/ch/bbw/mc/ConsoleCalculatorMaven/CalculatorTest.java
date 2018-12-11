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
	public void summNegativNumbersTestOk(){
		assertTrue(testee.summe(-10, -20) == -30);
	}
	
	@Test
	public void summNegativAndPositivNumberTestOk(){
		assertTrue(testee.summe(-10, 20) == 10);
	}
	
	@Test
	public void summPositivAndNegativNumberTestOk(){
		assertTrue(testee.summe(10, -20) == -10);
	}
	
	@Test
	public void summPositivNumberAndZeroTestOk(){
		assertTrue(testee.summe(10, 0) == 10);
	}
	
	@Test
	public void summNegativNumberAndZeroTestOk(){
		assertTrue(testee.summe(-10, 0) == -10);
	}
	
	@Test
	public void summZeroAndZeroTestOk(){
		assertTrue(testee.summe(0, 0) == 0);
	}
	
	@Test
	public void summMaxValueAndZeroTestOk(){
		assertTrue(testee.summe(Integer.MAX_VALUE, 0) == Integer.MAX_VALUE);
	}
	
	@Test
	public void summMaxValueAndPositivNumberTestOk(){
		assertTrue(testee.summe(Integer.MAX_VALUE, 10) == Integer.MAX_VALUE + 10);
	}
	
	@Test
	public void summMaxValueAndNegativNumberTestOk(){
		assertTrue(testee.summe(Integer.MAX_VALUE, -10) == Integer.MAX_VALUE - 10);
	}
	
	@Test
	public void summMinValueAndZeroTestOk(){
		assertTrue(testee.summe(Integer.MIN_VALUE, 0) == Integer.MIN_VALUE);
	}
	
	@Test
	public void summMinValueAndPositivNumberTestOk(){
		assertTrue(testee.summe(Integer.MIN_VALUE, 10) == Integer.MIN_VALUE + 10);
	}
	
	@Test
	public void summMinValueAndNegativNumberTestOk(){
		assertTrue(testee.summe(Integer.MIN_VALUE, -10) == Integer.MIN_VALUE - 10);
	}

	//Subtraction
	@Test
	public void subtractionPositivNumbersTestOk(){
		assertTrue(testee.subtraktion(30, 20) == 10);
	}
	
	@Test
	public void subtractionNegativNumbersTestOk(){
		assertTrue(testee.subtraktion(-10, -20) == 10);
	}
	
	@Test
	public void subtractionNegativNumbers2TestOk(){
		assertTrue(testee.subtraktion(-20, -10) == -10);
	}
	
	@Test
	public void subtractionPositivAndNegativNumbersTestOk(){
		assertTrue(testee.subtraktion(30, -20) == 50);
	}
	
	@Test
	public void subtractionNegativAndPositivNumbersTestOk(){
		assertTrue(testee.subtraktion(-30, 20) == -50);
	}
	
	@Test
	public void subtractionNegativNumbersAndZeroTestOk(){
		assertTrue(testee.subtraktion(-30, 0) == -30);
	}
	
	@Test
	public void subtractionPositivNumbersAndZeroTestOk(){
		assertTrue(testee.subtraktion(30, 0) == 30);
	}
	
	@Test
	public void subtractionZeroAndZeroTestOk(){
		assertTrue(testee.subtraktion(0, 0) == 0);
	}
	
	@Test
	public void subtractionMaxValueAndZeroTestOk(){
		assertTrue(testee.subtraktion(Integer.MAX_VALUE, 0) == Integer.MAX_VALUE);
	}
	
	@Test
	public void subtractionMaxValueAndPositivNumberTestOk(){
		assertTrue(testee.subtraktion(Integer.MAX_VALUE, 10) == Integer.MAX_VALUE - 10);
	}
	
	@Test
	public void subtractionMaxValueAndNegaitvNumberTestOk(){
		assertTrue(testee.subtraktion(Integer.MAX_VALUE, -10) == Integer.MAX_VALUE + 10);
	}
	
	@Test
	public void subtractionMinValueAndZeroTestOk(){
		assertTrue(testee.subtraktion(Integer.MIN_VALUE, 0) == Integer.MIN_VALUE);
	}
	
	@Test
	public void subtractionMinValueAndPositivNumberTestOk(){
		assertTrue(testee.subtraktion(Integer.MIN_VALUE, 10) == Integer.MIN_VALUE - 10);
	}
	
	@Test
	public void subtractionMinValueAndNegativNumberTestOk(){
		assertTrue(testee.subtraktion(Integer.MIN_VALUE, -10) == Integer.MIN_VALUE + 10);
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
	
	//Multiplikation
	@Test
	public void multiplicationPositivNumbersTestOk(){
		assertTrue(testee.multiplication(3, 2) == 6);
	}
	
	@Test
	public void multiplicationPositivAndNegativNumberTestOk(){
		assertTrue(testee.multiplication(3, -2) == -6);
	}
	
	@Test
	public void multiplicationNegativAndPositivNumberTestOk(){
		assertTrue(testee.multiplication(-3, 2) == -6);
	}
	
	@Test
	public void multiplicationNegativNumbersTestOk(){
		assertTrue(testee.multiplication(-3, -2) == 6);
	}
	
	@Test
	public void multiplicationZeroAndPositivNumberTestOk(){
		assertTrue(testee.multiplication(0, 2) == 0);
	}
	
	@Test
	public void multiplicationZeroAndNegativNumberTestOk(){
		assertTrue(testee.multiplication(0, -2) == 0);
	}
	
	@Test
	public void multiplicationZeroAndZeroTestOk(){
		assertTrue(testee.multiplication(0, 0) == 0);
	}
	
	@Test
	public void multiplicationOneAndPositivNumberTestOk(){
		assertTrue(testee.multiplication(1, 2) == 2);
	}
	
	@Test
	public void multiplicationOneAndNegativNumberTestOk(){
		assertTrue(testee.multiplication(1, -2) == -2);
	}
	
	@Test
	public void multiplicationSummTestOk(){
		assertTrue(testee.multiplicateSumm(3, 2, 3) == 15);
	}
	
	@Test(expected=ArithmeticException.class)
	public void multiplicateDivisionExpectedExceptionTest() {
	    assertTrue(testee.multiplicateDivision(10, 0, 3) == 15);
	}
	
	public void multiplicateDivisionNotExpectedExceptionTest() 
		    throws ArithmeticException {
	    assertTrue(testee.multiplicateDivision(10, 2, 3) == 15);
	}
}
