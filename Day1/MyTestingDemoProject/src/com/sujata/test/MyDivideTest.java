package com.sujata.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.sujata.client.MyDivide;

public class MyDivideTest {

	private MyDivide myDivide;
	
	@Before
	public void setUp() throws Exception {
		myDivide=new MyDivide();
	}

	@After
	public void tearDown() throws Exception {
		myDivide=null;
	}

	@Test
	public void testDivide1() {
		
		assertEquals(5, myDivide.divide(10, 2));
		/* 
		fail("Not yet implemented");
		*/
	}
	
	@Test
	public void testDivide2() {
		assertEquals(0, myDivide.divide(-10, -2));
		
	}
	@Test
	public void testDivide3() {
		assertEquals(0, myDivide.divide(-20, 4));
		
	}
	@Test
	public void testDivide4() {
		assertEquals(0, myDivide.divide(20, -6));
		
	}
	
	@Test(expected = ArithmeticException.class)
	public void testDivide5() {
		assertEquals(0, myDivide.divide(10, 0));
		
	}

}
