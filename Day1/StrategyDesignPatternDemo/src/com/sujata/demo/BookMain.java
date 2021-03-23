package com.sujata.demo;

import java.util.ArrayList;

public class BookMain {

	public static void main(String[] args) {
		ArrayList<Book> bookList=BookDao.getBookList();
		for(Book book:bookList) {
			System.out.println(book);
		}
		System.out.println("===============");
		BookDao bookDao=new BookDao();
		ArrayList<Book> thickBooks=bookDao.getThickBooks();
		System.out.println(thickBooks);

		ArrayList<Book> expensiveBooks=bookDao.searchBookByStrategy(new ExpensiveBookStrategy());
		
	}

}
