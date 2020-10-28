package scope;

import java.io.Serializable;
import javax.enterprise.context.SessionScoped;

@SessionScoped // any instance of this class will have lifeCyle binded to the Http  session lifetime
public class SessionScopeClass implements Serializable {

	public String getHash() {
		
		return "==== session  scope is here ==== ";
	}

}
