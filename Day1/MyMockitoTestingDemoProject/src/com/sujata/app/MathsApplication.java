package com.sujata.app;

import com.sujata.service.CalculatorService;

public class MathsApplication {
	
	private CalculatorService calculatorService;

	public void setCalculatorService(CalculatorService calculatorService) {
		this.calculatorService = calculatorService;
	}
	
	public int sum(int no1,int no2) {
		return calculatorService.add(no1, no2);
	}
	
	private int diff(int no1,int no2) {
		return calculatorService.subtract(no1, no2);
	}
	
	private int product(int no1,int no2) {
		return calculatorService.multiply(no1, no2);
	}
	
	private int divide(int no1,int no2) {
		return calculatorService.add(no1, no2);
	}
	

}
