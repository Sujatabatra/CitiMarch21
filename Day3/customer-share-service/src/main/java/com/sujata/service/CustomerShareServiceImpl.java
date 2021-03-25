package com.sujata.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.sujata.bean.Customer;
import com.sujata.bean.CustomerShareDetails;
import com.sujata.bean.Customers;
import com.sujata.bean.Share;

@Component
public class CustomerShareServiceImpl implements CustomerShareService {

	@Autowired
	RestTemplate restTemplate;
	
	@Override
	public ArrayList<CustomerShareDetails> getDetailsByCustId(String cId) {
		//calling customer-service to get details of customer and shares
		Customers customers=restTemplate.getForObject("http://localhost:8087/customers/"+cId, Customers.class);
		ArrayList<CustomerShareDetails> list=new ArrayList<CustomerShareDetails>();
		for(Customer customer:customers.getCustList()) {
			Share share=restTemplate.getForObject("http://localhost:8085/shares/"+customer.getShareId(), Share.class);
			
			CustomerShareDetails customerShareDetails=new CustomerShareDetails();
			
			customerShareDetails.setCustomerId(cId);
			customerShareDetails.setShareName(share.getShareName());
			customerShareDetails.setQuantity(customer.getQuantity());
			customerShareDetails.setShareType(customer.getShareType());
			customerShareDetails.setUnitPrice(share.getMarketPrice());
			customerShareDetails.setTotalValuation(customer.getQuantity()*share.getMarketPrice());
			list.add(customerShareDetails);
		}
		return list;
	}

}
