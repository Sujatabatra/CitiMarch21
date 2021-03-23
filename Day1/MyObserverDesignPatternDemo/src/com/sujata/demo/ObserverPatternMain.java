package com.sujata.demo;

public class ObserverPatternMain {

	public static void main(String[] args) {
		Observer sub1=new MessageSubscriberOne();
		Observer sub2=new MessageSubscriberTwo();
		Observer sub3=new MessageSubscriberThree();
		
		MessagePublisher mp=new MessagePublisher();
		mp.attach(sub1);
		mp.attach(sub2);
		
		mp.notifyUpdate(new Message("First Message"));
		System.out.println("===================");
		mp.detach(sub2);
		mp.attach(sub3);
		mp.notifyUpdate(new Message("Second Message"));
		

	}

}
