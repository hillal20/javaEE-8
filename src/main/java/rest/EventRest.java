package rest;

import java.time.LocalDateTime;

import javax.enterprise.event.Event;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import events.EventClass;
import qualifiers.annotations.PopularStand;

@Path("events")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class EventRest {
	
	@Inject // just a regular class injected here 
	EventClass eventClass;
	
	@Inject // event interface from javaEE takes a string  
	Event<String> eventString; // <String> means that the event.fire() will take  a string 
	
	
	
	@Inject // event interface from javaEE takes an object of type EventClass 
	Event<EventClass> event; // <EventClass> means that the event.fire() will take on instance of EventClass
	
	@Inject 
    @PopularStand // this is a custom qualifier 
    Event<EventClass> conditionalEvent; // this event will be marked by a qualifier and only the observers  which has the same qualifier will be observing it 
	
	@Inject 
	Event<EventClass> manualEvent;
	
	
	@Path("info")
	@GET()
	public String showInfo() {
		eventClass.setEmail("Hill@gamail.com");
		eventClass.setTime(LocalDateTime.now());
		return eventClass.getTime().toString() + eventClass.getEmail(); 
	}

	
	@Path("showEvent")
	@GET()
	public void triggerEventFn(){
		
	    EventClass obj = new EventClass(LocalDateTime.now(), "bill@gmail.com");
		event.fire(obj); // by firing this event, the observer will receive the obj pssed here 	
		
		
		EventClass obj1 = new EventClass(LocalDateTime.now(), "poplarStandEmail@gmail.com");
		conditionalEvent.fire(obj1);// this will traget the oservers with the qualifier @PopularStand As well
		
		
		EventClass obj2 = new EventClass(LocalDateTime.now(), "asyncEmail@gmail.com");
		event.fireAsync(obj2);// this will traget the async observers which has a delay of 3000 milliisecond
			
			
		eventString.fire("Hello word");
			
		
	}
	
}
