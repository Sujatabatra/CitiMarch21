package com.sujata.demo;
//ignore static as we are mimicing the procedural behaviour from OOP language
public class MyProceduralDemoClass {

	static int number,factorial;
	
	static void inputNumber(int no) {
		number=no;
	}
	static void calculateFactorial() {
		factorial=1;
		while(number>=1) {
			factorial*=number--;
		}
	}
	static void displayFactorial() {
		System.out.println("Factorial : "+factorial);
	}
	public static void main(String[] args) {
		inputNumber(5);
		//logical error
		number=2;
		calculateFactorial();
		//logical error
//		factorial=9;
		displayFactorial();

	}

}
