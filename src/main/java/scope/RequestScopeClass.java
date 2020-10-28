package scope;

import javax.enterprise.context.RequestScoped;

@RequestScoped // this scope means any instance of this class will have a lifecyle within the requst lifetime 
public class RequestScopeClass {

	
	public String getHash() {
		
		return "==== request scope is here ====  ";
	}
}
