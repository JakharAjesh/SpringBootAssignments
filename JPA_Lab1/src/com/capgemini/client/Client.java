package com.capgemini.client;

import com.capgemini.entities.Author;
import com.capgemini.service.AuthorService;
import com.capgemini.service.AuthorServiceImp;

public class Client {
	public static void main(String ar[])
	{
		AuthorService authorService=new AuthorServiceImp();
		
		Author author=new Author();
		author.setAuthorId(1);
		author.setAuthorFirstName("Ram");
		author.setAuthorLastName("Singh");
		author.setAuthorPhoneNumber("123456789");
		authorService.addAuthor(author);
		System.out.println(authorService.findAuthorById(1));
		author.setAuthorPhoneNumber("436378537");
		authorService.updateAuthor(author);
		
		Author author2=new Author();
		author2.setAuthorId(2);
		author2.setAuthorFirstName("Shyam");
		author2.setAuthorLastName("Chaudhary");
		author2.setAuthorPhoneNumber("987654321");
		authorService.addAuthor(author2);
		
		System.out.println(authorService.findAuthorById(1));
		authorService.removeAuthor(author2);
		
	}

}
