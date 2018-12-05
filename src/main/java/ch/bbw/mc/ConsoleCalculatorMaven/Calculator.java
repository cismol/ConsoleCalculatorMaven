package ch.bbw.mc.ConsoleCalculatorMaven;

import java.lang.reflect.Method;

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
	
	protected int multiplicateSumm(int multiplicant1, int multiplicant2, int multiplicant3){
		return (multiplicant1 + multiplicant2) * multiplicant3;
	}
	
	
	protected int multiplicateDivision(int dividand1, int dividand2, int multiplicant1){
		return (dividand1 / dividand2) * multiplicant1;
	}

	
}
