package events;

import java.time.LocalDateTime;

public class EventClass {
	
	public LocalDateTime time;	
	public String email;
	
	public EventClass(LocalDateTime time, String email) {
	    this.time = time ;
	    this.email = email;
		
	}
     public EventClass() { // empty constructor
		
	}
     
     
	public LocalDateTime getTime() {
		return time;
	}

	public void setTime(LocalDateTime time) {
		this.time = time;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	
	
	
}
