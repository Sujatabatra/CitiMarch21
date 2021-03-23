package com.sujata.oop;

public class MyFactorialMain {

	public static void main(String[] args) {
		//reference variable : storing null in it
		Factorial fOb;
		//Object : reference variable storing the address of heap
		fOb=new Factorial();
		
		fOb.setNumber(4);
//		fOb.number=2;
		System.out.println("Factorial : "+fOb.getFactorial());
		

	}

}
