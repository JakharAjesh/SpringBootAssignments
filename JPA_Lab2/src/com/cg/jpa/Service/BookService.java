package com.cg.jpa.Service;

import java.util.List;

import com.cg.jpa.entity.Book;

public interface BookService {

	public abstract Book getBookById(int id);

	public abstract List<Book> getAuthor(String author);

	public abstract List<Book> getAllBooks();

	public abstract List<Book> getBooksBtwRange(double low, double high);
	public abstract void commitTransaction();

	public abstract void beginTransaction();

	


}