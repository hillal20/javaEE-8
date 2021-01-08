package service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import entity.Book;

@Transactional
public class BookService {
	
	@PersistenceContext
	EntityManager entityManager;
	
	
	
	// saving the book
	public Book creatBook(Book book) {
		
		entityManager.persist(book);
		return book;
	}
	

	// get All books 
    public List<Book> getAllBooks(){
    	 	
    	return  entityManager
    	.createQuery("SELECT t FROM  Book  t", Book.class).getResultList();
    	
    
    }
	
    //  sow tables 
    public String  getAllTables(){
    	 	
    	return  (String) entityManager
    	.createQuery(" show tables").toString();
    	
    
    }
}
