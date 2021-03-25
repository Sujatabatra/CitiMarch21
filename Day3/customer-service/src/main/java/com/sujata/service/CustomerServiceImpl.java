package com.sujata.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sujata.bean.Customer;
import com.sujata.persistence.CustomerDao;

@Component
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerDao customerDao;
	
	@Override
	public ArrayList<Customer> getCustomerDetailsById(String id) {
		return customerDao.searchCustomerById(id);
	}

}
