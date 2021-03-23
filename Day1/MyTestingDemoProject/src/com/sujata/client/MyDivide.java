package com.sujata.client;

/*
 * division of two positive integers
 * numerator or denominator as negative : return 0;
 * if someone entered denominator as 0 : ArithmeticException
 */
public class MyDivide {

	public int divide(int number1,int number2) {
		if(number1>0 && number2>=0)
			return number1/number2;
		return 0;
	}
}
