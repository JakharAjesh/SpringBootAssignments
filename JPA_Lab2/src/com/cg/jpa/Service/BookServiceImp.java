package com.cg.jpa.Service;

import java.util.List;

import com.cg.jpa.dao.BookDao;
import com.cg.jpa.dao.BookDaoImp;
import com.cg.jpa.entity.Book;

public class BookServiceImp implements BookService {

	private BookDaoImp dao;

	public BookServiceImp() {
		dao = new BookDaoImp();
		
	}

	@Override
	public Book getBookById(int id) {
		
		return dao.getBookById(id);
	}

	
	@Override
	public List<Book> getAuthor(String author) {
		return dao.getAuthor(author);
	}

	@Override
	public List<Book> getAllBooks() {
		return dao.getAllBooks();
	}
	
	@Override
	public List<Book> getBooksBtwRange(double low, double high){
		return dao.getBooksBtwRange(low, high);
	}
	
	@Override
	public void commitTransaction() {
		dao.commitTransaction();
		
	}

	@Override
	public void beginTransaction() {
		dao.beginTransaction();
		
	}

}
