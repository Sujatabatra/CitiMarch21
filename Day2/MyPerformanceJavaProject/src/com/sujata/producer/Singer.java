package com.sujata.producer;

public class Singer implements Performer {

	private String song;
	private String name;
	
	

	public Singer(String song, String name) {
		super();
		this.song = song;
		this.name = name;
	}



	@Override
	public void perform() {
		System.out.println("Singer "+name+" is singing " + song);

	}

}
