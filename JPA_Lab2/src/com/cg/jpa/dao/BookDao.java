package com.cg.jpa.dao;

import java.util.List;

import com.cg.jpa.entity.Book;


public  interface BookDao {
	
	public  Book getBookById(int id);
	
	public  List<Book> getAuthor(String author);

	public  List<Book> getAllBooks();

	public  List<Book> getBooksBtwRange(double low, double high);
	
	public  void commitTransaction();

	public  void beginTransaction();

}
