package com.sujata.demo;

//reused : extends
public class Audi extends Car {

	public Audi(String color, String model) {
		super(color, model);
	}
	
	//extensibility : methods
	public void engine() {
		System.out.println("Audi engine goes AOOOM!");
	}
	//overrite drive functionality
	public void drive() {
		super.drive();
		engine();
	}
	
}
