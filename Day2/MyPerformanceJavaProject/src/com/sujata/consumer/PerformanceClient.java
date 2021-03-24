package com.sujata.consumer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sujata.producer.Performer;

public class PerformanceClient {

	public static void main(String[] args) {
		
		//IOC : Inversion of control, separating the dependency logic from the actual business logic of you application, how we achieve IOC with the help of
//		setter and constructor injection
		ApplicationContext springContainer=new ClassPathXmlApplicationContext("performer.xml");
		
		Performer p1=(Performer)springContainer.getBean("Aditi");
		Performer p2=(Performer)springContainer.getBean("Kanchan");
		
		p1.perform();
		p2.perform();
		
		Performer p3=(Performer)springContainer.getBean("Divya");
		p3.perform();
		

	}

}
