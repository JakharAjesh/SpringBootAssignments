package com.cg.jpa;

import com.cg.jpa.Service.BookService;
import com.cg.jpa.Service.BookServiceImp;
import com.cg.jpa.entity.Book;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BookService service = new BookServiceImp();
		
		service.beginTransaction();
		System.out.println("Books Available");
		for(Book book:service.getAllBooks()) {
			System.out.println(book); }
			
		System.out.println("Books By Author_A");
		for(Book book:service.getAuthor("Author_A") ) {
		    System.out.println(book); }
				
		 System.out.println("Books Between 500-600 Rs");
		 for(Book book:service.getBooksBtwRange(500, 600) ) {
			System.out.println(book);
			}
		 
	    System.out.println("Book with Id=1");
		System.out.println("Book with ID 1:"+service.getBookById(1));
		
		service.commitTransaction();

	}
}	
