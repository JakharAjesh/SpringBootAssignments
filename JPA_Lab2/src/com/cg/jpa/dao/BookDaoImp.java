package com.cg.jpa.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import com.cg.jpa.entity.Book;


public class BookDaoImp implements BookDao  {

	private EntityManager entityManager;

	public BookDaoImp() {
		entityManager = JPAUtility.getEntityManager();
	}

	
	@Override
	public List<Book> getAllBooks() {
		Query query = entityManager.createNamedQuery("getAllBooks");
		List<Book> bookList = query.getResultList();
		return bookList;
	}
		@Override
		public List<Book> getAuthor(String author) {
			String qStr = "SELECT book FROM Book book WHERE book.author=:pAuthor";
			TypedQuery<Book> query = entityManager.createQuery(qStr, Book.class);
			query.setParameter("pAuthor", author);
			List<Book> bookList = query.getResultList();
			return bookList;
			}
		
	@Override
	public List<Book> getBooksBtwRange(double low,double high) {
		String qStr = "SELECT book FROM Book book WHERE book.price between :low and :high";
		TypedQuery<Book> query = entityManager.createQuery(qStr, Book.class);
		query.setParameter("low", low);
		query.setParameter("high", high);
		List<Book> bookList = query.getResultList();
		return bookList;
	}
	
	@Override
	public Book getBookById(int id) {
		Book book = entityManager.find(Book.class, id);
		return book;
	}
	
	@Override
	public void commitTransaction() {
		entityManager.getTransaction().begin();
		
	}

	@Override
	public void beginTransaction() {
		entityManager.getTransaction().commit();
		
	}

}
