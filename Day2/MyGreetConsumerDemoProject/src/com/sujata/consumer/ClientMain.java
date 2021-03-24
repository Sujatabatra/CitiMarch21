package com.sujata.consumer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sujata.producer.GoodMorning;
import com.sujata.producer.Greet;

public class ClientMain {

	public static void main(String[] args) {
//		Not the spring way
//		Greet greet=new GoodMorning();//creating of object and life cycle of component
//		greet.wish("Sujata");
		
		//Spring Container : managing life cycle(Object Creating) of all the means mentioned in XML file
		ApplicationContext springContainer=new ClassPathXmlApplicationContext("greet.xml");
		
		Greet greet=(Greet)springContainer.getBean("mrng");
		greet.wish("Sujata");
		
	}

}
