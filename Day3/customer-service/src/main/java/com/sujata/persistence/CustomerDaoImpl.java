package com.sujata.persistence;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.sujata.bean.Customer;

@Component
public class CustomerDaoImpl implements CustomerDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public ArrayList<Customer> searchCustomerById(String id) {
		ArrayList<Customer> customers=(ArrayList)jdbcTemplate.query("select * from CustomerShareDetails where customerId=?", new Object[] {id}, new CustomerRowMapper());
		return customers;
	}
	
	
}
