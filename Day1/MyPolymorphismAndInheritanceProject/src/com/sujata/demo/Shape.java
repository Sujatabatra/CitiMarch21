package com.sujata.demo;

public class Shape {

	
	/*
	 * Function Overloading : Polymorphism
	 * Multiple function with one name and each function will get differentiated from each other wrt its signature
	 * signature means no and types of arguments and its sequence
	 */
	public void area(int l,int b) {
		System.out.println("Area of Recatangle : "+(l*b));
	}
	public void area(int side) {
		System.out.println("Area of Square : "+(4*side));
	}
	public void area(double radius) {
		System.out.println("Area of Circle : "+(3.14*radius*radius));
	}
}
