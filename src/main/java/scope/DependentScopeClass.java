package scope;

import java.io.Serializable;

import javax.enterprise.context.Dependent;


@Dependent // this scope is assigned by default to any free class , we can avoid mentioning it 
public class DependentScopeClass implements Serializable {
	
	public String getHash() {
		
		return " ==== dependent scope is here ==== ";
	}

}
