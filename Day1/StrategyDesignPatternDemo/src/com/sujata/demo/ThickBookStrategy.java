package com.sujata.demo;

public class ThickBookStrategy implements BookStrategy {

	@Override
	public boolean test(Book book) {
		// TODO Auto-generated method stub
		return book.getNoofPages()>750;
	}

}
