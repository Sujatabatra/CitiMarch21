package com.sujata.demo;

public class MyMainInheritance {

	public static void main(String[] args) {
		Car car=new Car("Red", "LXI");

		//car version of drive gets called
		car.drive();
		System.out.println("========================");
		
		Audi audi=new Audi("Silver", "A8");
		//audi version of driver gets called
		audi.drive();
		audi.engine();// reference variable was of derived type itself
		/*
		 * Dynamic Method Dispatch (over riding): Polymorphism
		 * 
		 * Base class Reference variable is type compatible with derived class but reverse is not true
		 * 
		 */
		System.out.println("===========================");
		//base class Reference variable
		Car c;
		c=new Car("Blue","DSI");
		c.drive(); //depending upon which object reference our parent class reference variable is holding
		System.out.println();
		c=new Audi("Brown", "A6");
		c.drive();
//		c.engine();// reference variable is of base so object slicing happens
		
//		Audi a;
//		a=new Car("White","LX"); Not possible
	}

}
