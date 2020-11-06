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

@Path("events")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class EventRest {
	
	@Inject 
	EventClass eventClass;
	
	@Inject 
	Event<EventClass> event; // <EventClass> means that the event.fire() will take on instance of EventClass
	
	@Inject 
	Event<EventClass> conditionalEvent;
	
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
	public void triggerEventFn() {
		     EventClass obj = new EventClass(LocalDateTime.now(), "bill@gmail.com");
		event.fire(obj); // the observer will receive the obj 
		
	}
	
}
