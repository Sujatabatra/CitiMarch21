package com.sujata.demo;

public class Book {

	private int bId;
	private String bookName;
	private String authorName;
	private int noofPages;
	private int price;
	
	public Book() {
		
	}

	
	public Book(int bId, String bookName, String authorName, int noofPages, int price) {
		super();
		this.bId = bId;
		this.bookName = bookName;
		this.authorName = authorName;
		this.noofPages = noofPages;
		this.price = price;
	}


	public int getbId() {
		return bId;
	}

	public void setbId(int bId) {
		this.bId = bId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public int getNoofPages() {
		return noofPages;
	}

	public void setNoofPages(int noofPages) {
		this.noofPages = noofPages;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}


	@Override
	public String toString() {
		return "Book [bId=" + bId + ", bookName=" + bookName + ", authorName=" + authorName + ", noofPages=" + noofPages
				+ ", price=" + price + "]";
	}
	
	
	
}
