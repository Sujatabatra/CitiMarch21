package com.sujata.demo;

import java.util.ArrayList;

public class BookDao {

	private static ArrayList<Book> bookList=new ArrayList<Book>();
	
	static {
		bookList.add(new Book(101, "Book1", "Author A", 560, 600));
		bookList.add(new Book(102, "Book2", "Author B", 680, 1600));
		bookList.add(new Book(103, "Book3", "Author A", 750, 800));
		bookList.add(new Book(104, "Book4", "Author B", 980, 1500));
		bookList.add(new Book(105, "Book5", "Author A", 1560, 6200));
	}

	public static ArrayList<Book> getBookList() {
		return bookList;
	}
	
	public ArrayList<Book> getThickBooks(){
		ArrayList<Book> newList=new ArrayList<Book>();
		for(Book book:bookList) {
			if(book.getNoofPages()>750)
				newList.add(book);
		}
		return newList;
	}
	
	public ArrayList<Book> getExpensiveBooks(){
		ArrayList<Book> newList=new ArrayList<Book>();
		for(Book book:bookList) {
			if(book.getPrice()>1000)
				newList.add(book);
		}
		return newList;
	}
	
	//supplying algo(Strategy) as an argument
	public ArrayList<Book> searchBookByStrategy(BookStrategy bookStrategy){
		ArrayList<Book> newList=new ArrayList<Book>();
		for(Book book:bookList) {
			if(bookStrategy.test(book))
				newList.add(book);
		}
		return newList;
	}
}
