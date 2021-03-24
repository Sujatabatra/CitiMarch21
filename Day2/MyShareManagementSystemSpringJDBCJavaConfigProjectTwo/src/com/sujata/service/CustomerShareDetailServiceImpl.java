package com.sujata.service;

import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sujata.bean.CustomerShareDetail;
import com.sujata.persistence.CustomerShareDetailDao;
import com.sujata.persistence.CustomerShareDetailDaoImpl;

@Component
public class CustomerShareDetailServiceImpl implements CustomerShareDetailService {

//	private CustomerShareDetailDao customerShareDetailDao=new CustomerShareDetailDaoImpl();

	@Autowired
	private CustomerShareDetailDao customerShareDetailDao;

	public void setCustomerShareDetailDao(CustomerShareDetailDao customerShareDetailDao) {
		this.customerShareDetailDao = customerShareDetailDao;
	}

	@Override
	public ArrayList<CustomerShareDetail> getAllCustomerShareDetails() throws SQLException {

		return customerShareDetailDao.getAllRecord();
	}

}
