package ch.bbw.mc.ConsoleCalculatorMaven;

/**
 *  Calculator
 *  - Kann 2 Zahlen addieren
 * 
 * 
 */

public class Calculator {

	public Calculator() {
		// TODO Auto-generated constructor stub
	}
	
	public int summe(int summand1, int summand2){
		return summand1 + summand2;
	}

	public int subtraktion(int summand1, int summand2){
		return summand1 - summand2;
	}
	
	public int division(int dividend1, int dividend2){
		return dividend1 / dividend2;
	}
	
	protected int multiplication(int multiplicant1, int multiplicant2){
		return multiplicant1 * multiplicant2;
	}
	
	
	
}
