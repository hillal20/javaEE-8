package producers;


import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import javax.enterprise.inject.Produces;
import javax.enterprise.inject.spi.InjectionPoint;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import qualifiers.Police;
import qualifiers.Salute;

public class ProcducerClass {

	
	@Produces // this annotation will turn getLogs method into a bean in the CDI
	public Logger getMyLogs(InjectionPoint injectionPoint ) {
		// we are injecting a pre-built CDI bean called InjectionPoint 
		
		return Logger.getLogger(injectionPoint.getMember().getDeclaringClass().getName());
	}
	
	
	@Produces // since this function is a producer bean, the CDI will invoke it once we inject in elsewhere
	public List<String> getMyList() {
		/* 
		 if we  pass a parameter 'Logger myLogger'  to this produce function-bean ,
		 the CDI container will invoke the getMylogs function automatically and makes 
		 myLogger equal to what the function getMylogs return 
		*/
		List<String>   books = new ArrayList<>();
		books.add("book-1");
		books.add("book-2");
		books.add("book-3");
		books.add("book-4");
		return books;
	}
	
	
	@Produces 
	@PersistenceContext
	public EntityManager eManager; // this entity manager could be injected elsewhere
	
	
	@Produces
	//@Police // we annotate it with police to make the salute return as police 
	public Salute getSalution() { // salute is an interface 
		
		return new Police(); // police is a call implementation of the interface salute
	}
	
	
}
