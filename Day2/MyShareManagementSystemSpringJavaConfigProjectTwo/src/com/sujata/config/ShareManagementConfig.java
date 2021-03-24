package com.sujata.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.sujata.persistence.CustomerShareDetailDaoImpl;
import com.sujata.persistence.ShareDaoImpl;
import com.sujata.presentation.SharePresentationImpl;
import com.sujata.service.CustomerShareDetailServiceImpl;
import com.sujata.service.ShareServiceImpl;

@Configuration
public class ShareManagementConfig {

	@Bean("customerShareDetailDaoImpl")
	public CustomerShareDetailDaoImpl customerShareDetailDaoImpl() {
		return new CustomerShareDetailDaoImpl();
	}
	
	//if we are not giving bean name , then id of the bean will b same as dat of the method name
	@Bean
	public ShareDaoImpl shareDaoImpl() {
		return new ShareDaoImpl();
	}
	
	@Bean
	public CustomerShareDetailServiceImpl customerShareDetailServiceImpl() {
		CustomerShareDetailServiceImpl c1=new CustomerShareDetailServiceImpl();
		c1.setCustomerShareDetailDao(customerShareDetailDaoImpl());
		return c1;
	}
	
	@Bean
	public ShareServiceImpl shareServiceImpl() {
		ShareServiceImpl s1=new ShareServiceImpl();
		s1.setShareDao(shareDaoImpl());
		return s1;
	}
	
	@Bean
	public SharePresentationImpl sharePresentationImpl() {
		SharePresentationImpl s1=new SharePresentationImpl();
		s1.setCustomerShareDetailService(customerShareDetailServiceImpl());
		s1.setShareService(shareServiceImpl());
		return s1;
	}
}
