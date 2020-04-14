package com.capgemini.dao;

import com.capgemini.entities.Author;

public interface AuthorDao {
	public abstract void addAuthor(Author author);

	public abstract void removeAuthor(Author author);
	
	public abstract Author getAuthorById(int id);

	public abstract void commitTransaction();

	public abstract void beginTransaction();
	
	public abstract void updateAuthor(Author author);

}
