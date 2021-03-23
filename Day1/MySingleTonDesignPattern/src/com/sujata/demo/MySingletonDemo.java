package com.sujata.demo;

public class MySingletonDemo {

	static MySingletonDemo ob;
	
	private MySingletonDemo() {
	}
	
	public static MySingletonDemo getInstance() {
		if(ob==null) {
			ob=new MySingletonDemo();
		}
		return ob;
	}
	public void show() {
		System.out.println("Hi I am show() method of MySingletonDemo class ");
	}
}
