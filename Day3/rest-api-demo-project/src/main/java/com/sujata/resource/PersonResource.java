package com.sujata.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sujata.bean.Person;

@RestController
public class PersonResource {

	@GetMapping(path="/persons",produces = "application/json")
	public Person getUser() {
		return new Person(101,"AAAA");
	}
	
	@GetMapping(path = "xml/persons",produces = "application/xml")
	public Person getOneMoreUser() {
		return new Person(102,"BBBB");
	}
}
