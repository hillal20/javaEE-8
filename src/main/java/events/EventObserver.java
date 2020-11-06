package events;

import java.io.Serializable;


import javax.enterprise.context.RequestScoped;
import javax.enterprise.event.Observes;

@RequestScoped
public class EventObserver implements Serializable {

	// this the function that will do the observation 
	public void myObserver(@Observes EventClass objCopy ) {
		// this observer will fire automatically when the event.fire() invoked in EventRest 
		
		System.out.println(" observer ===>" + objCopy.getEmail());
	}
	
	
}
