package com.sujata.test;

import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

import org.junit.Test;
import org.junit.runner.RunWith;

import com.sujata.app.MathsApplication;
import com.sujata.service.CalculatorService;

@RunWith(MockitoJUnitRunner.class)
public class MathApplicationTester {

	//Injecting the Mock Behaviour in  Application
	@InjectMocks
	private MathsApplication mathApplication=new MathsApplication();
	
	//Mocking the behaviour of CalculatorService
	@Mock
	CalculatorService calculateService;
	
	@Test
	public void testAdd() {
		//Behaviour Specification of MockService
		when(calculateService.add(10, 20)).thenReturn(30);
		
		assertEquals(30, mathApplication.sum(10, 20));
		
	}
}
