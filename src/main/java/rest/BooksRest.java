package rest;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import entity.Book;
import service.BookService;


@Path("book")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class BooksRest {

	
	@Inject 
	BookService bookService;
	
	private List<Book> listOfBooks;
	
	@Path("new")
	@POST
	public Response createToDo(Book bookObj) {
		     
		 bookService.creatBook(bookObj);
		 return Response.ok(bookObj).build();
			
	}
	
	
	@Path("all")
	@GET
	public List<Book>  getAllBooks() {
		listOfBooks = bookService.getAllBooks();
		return  listOfBooks;
	}
	
	@Path("tables")
	@GET
	public String  getTables() {		
		return  bookService.getAllTables();
	}
	
}
