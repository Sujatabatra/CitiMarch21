package com.sujata.demo;

public class ExpensiveBookStrategy implements BookStrategy{

	@Override
	public boolean test(Book book) {
		return book.getPrice()>1000;
	}

}
