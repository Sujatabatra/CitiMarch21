package com.sujata.demo;

import java.util.ArrayList;
import java.util.List;

public class MessagePublisher implements Subject {

	private List<Observer> observers=new ArrayList<>();
	
	@Override
	public void attach(Observer ob) {
		observers.add(ob);
		
	}

	@Override
	public void detach(Observer ob) {
		observers.remove(ob);
		
	}

	@Override
	public void notifyUpdate(Message m) {
		for(Observer observer:observers) {
			observer.update(m);
		}
		
	}

	

}
