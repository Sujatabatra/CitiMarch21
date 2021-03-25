package com.sujata.persistence;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.sujata.bean.Customer;

public class CustomerRowMapper implements RowMapper<Customer> {

	@Override
	public Customer mapRow(ResultSet rs, int rowNum) throws SQLException {
		Customer customer=new Customer();
		customer.setCustomerId(rs.getString("customerid"));
		customer.setDetailId(rs.getInt("detailid"));
		customer.setShareId(rs.getInt("instrumentid"));
		customer.setShareType(rs.getString("sharetype"));
		customer.setQuantity(rs.getInt("quantity"));
		return customer;
	}

}
