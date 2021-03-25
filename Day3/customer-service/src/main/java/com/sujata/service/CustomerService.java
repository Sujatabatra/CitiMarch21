package com.sujata.service;

import java.util.ArrayList;

import com.sujata.bean.Customer;

public interface CustomerService {

	public ArrayList<Customer> getCustomerDetailsById(String id);
}
