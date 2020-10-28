package scope;

import java.io.Serializable;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped // it is an app lifetime scope, it is singleton scope 
public class ApplicationScopeClass implements Serializable {
	
	public String getHash () {
		
		return "==== application scope is here ==== ";
	}
}
