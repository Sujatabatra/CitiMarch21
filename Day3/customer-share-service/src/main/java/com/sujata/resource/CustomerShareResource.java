package com.sujata.resource;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.sujata.bean.CustomerShareDetails;
import com.sujata.service.CustomerShareService;

@RestController
public class CustomerShareResource {

	@Autowired
	private CustomerShareService customerShareService;
	
	@GetMapping("/details/{id}")
	public ArrayList<CustomerShareDetails> getDetailsByCustId(@PathVariable("id") String cId){
		return customerShareService.getDetailsByCustId(cId);
	}
}
