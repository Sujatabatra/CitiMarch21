package com.sujata.bean;

import javax.xml.bind.annotation.XmlRootElement;

//JaxB Annotation
@XmlRootElement
public class Person {

	private int personId;
	private String personName;
	
	public Person() {
		
	}

	public Person(int personId, String personName) {
		super();
		this.personId = personId;
		this.personName = personName;
	}

	public int getPersonId() {
		return personId;
	}

	public void setPersonId(int personId) {
		this.personId = personId;
	}

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}
	
	
}
