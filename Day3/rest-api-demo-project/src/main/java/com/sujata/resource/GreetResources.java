package com.sujata.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sujata.service.GreetService;

//this is not the controller which return ModelAndView but it returns the response in the format specified by us
@RestController
public class GreetResources {
	
	@Autowired
	private GreetService greetService;
	
	@GetMapping(path = "/greet",produces = "text/plain")
	public String greetingUserResource() {
		String msg=greetService.welcomeUser();
		return "<h1>"+msg+"</h1>";
	}

}
