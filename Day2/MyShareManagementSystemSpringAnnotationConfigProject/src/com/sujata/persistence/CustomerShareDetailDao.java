package com.sujata.persistence;

import java.sql.SQLException;
import java.util.ArrayList;

import com.sujata.bean.CustomerShareDetail;

public interface CustomerShareDetailDao {

	public ArrayList<CustomerShareDetail> getAllRecord()throws ClassNotFoundException,SQLException;
}
