package com.sujata.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyFirstController {

	@RequestMapping("/")
	public ModelAndView firstController() {
		ModelAndView mv=new ModelAndView();
		mv.addObject("message", "Welcome to first Spring MVC Project");
		mv.setViewName("first");
		return mv;
	}
	
	@RequestMapping("/first")
	public ModelAndView secondController() {
		ModelAndView mv=new ModelAndView();
		mv.addObject("message", "Welcome once again to first Spring MVC Project");
		mv.setViewName("first");
		return mv;
	}
}
