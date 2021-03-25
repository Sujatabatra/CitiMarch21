package com.sujata.resource;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.sujata.bean.Customer;
import com.sujata.bean.Customers;
import com.sujata.service.CustomerService;

@RestController
public class CustomerResource {

	@Autowired
	private CustomerService customerService;
	
	@GetMapping("/customers/{cId}")
	public Customers getCustomerRecordsByIdResource(@PathVariable("cId") String customerId){
		
		Customers custList=new Customers();
		custList.setCustList(customerService.getCustomerDetailsById(customerId));
		return custList;
	}
}
