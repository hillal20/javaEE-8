package scope;

import java.io.Serializable;

import javax.enterprise.context.ConversationScoped;

@ConversationScoped
public class ConversationScopeClass implements Serializable {

	
	public String getHash() {
		return "==== conversation scope is here ==== ";
	}
}
