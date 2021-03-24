package com.sujata.service;

import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.sujata.bean.CustomerShareDetail;
import com.sujata.persistence.CustomerShareDetailDao;
import com.sujata.persistence.CustomerShareDetailDaoImpl;

@Component
public class CustomerShareDetailServiceImpl implements CustomerShareDetailService {

//	private CustomerShareDetailDao customerShareDetailDao=new CustomerShareDetailDaoImpl();

	//@Autowire : automatic wiring of dependent component, but if multiple candidates found
	//narrow down wiring to one is done by @Qualifier
	@Autowired
	@Qualifier("customerShareDetailDaoImpl")
	private CustomerShareDetailDao customerShareDetailDao;

	public void setCustomerShareDetailDao(CustomerShareDetailDao customerShareDetailDao) {
		this.customerShareDetailDao = customerShareDetailDao;
	}

	@Override
	public ArrayList<CustomerShareDetail> getAllCustomerShareDetails() throws ClassNotFoundException, SQLException {

		return customerShareDetailDao.getAllRecord();
	}

}
