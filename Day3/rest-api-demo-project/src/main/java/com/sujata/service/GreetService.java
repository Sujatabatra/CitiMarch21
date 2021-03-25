package com.sujata.service;

import org.springframework.stereotype.Component;

@Component
public class GreetService {

	public String welcomeUser() {
		return "Welcome to the world of Spring Boot Rest API!";
	}
	
	
}
