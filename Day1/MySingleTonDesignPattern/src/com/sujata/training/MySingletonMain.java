package com.sujata.training;

import com.sujata.demo.MySingletonDemo;

public class MySingletonMain {

	public static void main(String[] args) {
//		MySingletonDemo ob=new MySingletonDemo();
		MySingletonDemo ob1=MySingletonDemo.getInstance();
		System.out.println(ob1);
		
		MySingletonDemo ob2=MySingletonDemo.getInstance();
		System.out.println(ob2);

		ob1.show();
		
		ob2.show();
	}

}
