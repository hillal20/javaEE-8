package events.observers;

import java.io.Serializable;

import javax.annotation.Priority;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.event.Observes;
import javax.enterprise.event.ObservesAsync;
import javax.enterprise.event.Reception;
import javax.enterprise.event.TransactionPhase;

import enums.MyEnum;
import events.EventClass;
import qualifiers.annotations.PopularStand;

@RequestScoped
public class EventObserver implements Serializable {

	// this the function that will do the observation for all events that takes EventClass instances(objects)
	public void myObserver(@Observes EventClass objCopy ) {
		// this observer will fire automatically when the event.fire() invoked in EventRest 
		
		System.out.println(" observer ===>" + objCopy.getEmail());
	}
	
	
	// this the function that will do the observation , and cover the popularStander annotated EventClass objects only 
	public void myCustomObserver(@Observes @PopularStand EventClass objCopy) {	
		// this observer will fire automatically when the event.fire() invoked in EventRest 
		System.out.println(" popularStand observer ===> " + objCopy.getEmail());
	}
	
	
	// this the function that will do the observation , and cover only certain cases as  mentioned inside @observes, plus this observer will take only the objects of EventClass
		public void conditionalObserver(
				@Observes(notifyObserver = Reception.IF_EXISTS, during = TransactionPhase.AFTER_COMPLETION )
		        EventClass objCopy
		        ) {	
			// this observer will fire automatically when the event.fire() invoked in EventRest 
			System.out.println(" conditional observer ===> " + objCopy.getEmail());
		}
		
		
		
		
		// this the function that will do the observation , and cover only the async events ,  this observer will take only the objects of EventClass
				public void asyncObserver( @ObservesAsync EventClass objCopy ) {	
					// this observer will fire automatically when the event.fire() invoked in EventRest 
					System.out.println(" async  observer ===> " + objCopy.getEmail());
					try {
						Thread.sleep(3000);
						
					}catch(InterruptedException err) {
						System.out.println(" async  error ===> " + err.getMessage());
					}
					
				}
				
				
				// this the function that will do the observation ,  this observer will take only string
				public void priorityObserverFisrt(@Observes() @Priority(200)  String text ) {	
					// this observer will fire automatically when the event.fire() invoked in EventRest 
					System.out.println(" observer priotiry 2  ===> " + text);
				}
				
				// this the function that will do the observation ,  this observer will take only string
				public void priorityObserverSecond(@Observes() @Priority(100)  String text ) {	
					// this observer will fire automatically when the event.fire() invoked in EventRest 
					System.out.println(" observer priotiry 1  ===> " + text);
				}
				
}
