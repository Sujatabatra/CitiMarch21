package com.sujata.service;

import java.sql.SQLException;
import java.util.ArrayList;

import com.sujata.bean.CustomerShareDetail;
import com.sujata.persistence.CustomerShareDetailDao;
import com.sujata.persistence.CustomerShareDetailDaoImpl;

public class CustomerShareDetailServiceImpl implements CustomerShareDetailService {

//	private CustomerShareDetailDao customerShareDetailDao=new CustomerShareDetailDaoImpl();

	private CustomerShareDetailDao customerShareDetailDao;

	public void setCustomerShareDetailDao(CustomerShareDetailDao customerShareDetailDao) {
		this.customerShareDetailDao = customerShareDetailDao;
	}

	@Override
	public ArrayList<CustomerShareDetail> getAllCustomerShareDetails() throws SQLException {

		return customerShareDetailDao.getAllRecord();
	}

}
