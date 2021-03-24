package com.sujata.service;

import java.sql.SQLException;
import java.util.ArrayList;

import com.sujata.bean.CustomerShareDetail;

public interface CustomerShareDetailService {

	ArrayList<CustomerShareDetail> getAllCustomerShareDetails()throws SQLException;
}
