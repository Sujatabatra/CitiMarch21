package com.sujata.service;

import java.util.ArrayList;

import com.sujata.bean.CustomerShareDetails;

public interface CustomerShareService {

	ArrayList<CustomerShareDetails> getDetailsByCustId(String cId);
}
