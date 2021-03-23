package com.sujata.demo;

public class Car {

	private String color,model;

	public Car(String color, String model) {
		super();
		this.color = color;
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public String getModel() {
		return model;
	}
	
	public void drive() {
		System.out.print("We are driving "+getModel()+" in "+getColor()+" color car ");
	}

	
	
}
