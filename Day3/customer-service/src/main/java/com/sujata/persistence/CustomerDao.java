package com.sujata.persistence;

import java.util.ArrayList;

import com.sujata.bean.Customer;

public interface CustomerDao {

	public ArrayList<Customer> searchCustomerById(String id);
}
