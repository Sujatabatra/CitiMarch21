package com.sujata.oop;

//Encapsulation : class
//Data Hiding : private access specifier
//Data Abstraction : methods
public class Factorial {

	//Number to be modifiable and factorial to be readable
	private int number,factorial;
	/*
	 * To make any data modifiable you need to create setter
	 * to make any data readable you need to create getter 
	 */

	public int getFactorial() {
		factorial=1;
		while(number>=1) {
			factorial*=number--;
		}
		return factorial;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	
	
}
