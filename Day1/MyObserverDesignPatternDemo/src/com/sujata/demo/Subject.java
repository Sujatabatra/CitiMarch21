package com.sujata.demo;

public interface Subject {

	public void attach(Observer ob);
	public void detach(Observer ob);
	public void notifyUpdate(Message m);
	
}
