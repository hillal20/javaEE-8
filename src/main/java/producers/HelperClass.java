package producers;

import java.util.List;
import java.util.logging.Logger;

import javax.inject.Inject;
import javax.persistence.EntityManager;











public class HelperClass {

	
	@Inject // injection the return of the function  getMyLogs in the HelperClass 
	public Logger loging;
	
	@Inject // injecting the return of the function getMyList in HelperClass 
	public List<String> getMyList;
	
	public void showLoging() {
		
		System.out.println(" logging ====> "+ loging );
		System.out.println(" getMyList ====> "+ getMyList );
	}
	
	
	@Inject 
	public EntityManager eManager;

	
	 
	
}
