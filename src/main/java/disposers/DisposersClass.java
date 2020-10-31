package disposers;

import java.util.List;

import javax.enterprise.inject.Disposes;

public class DisposersClass {
	
	// Dispose annotation  has to be passed along with the injected value as a param to a void method
	//public void myFn(@Disposes List<String> books) {
      // Disposes annotation does the opposite of Produces. after injecting the books list 
	// the disposes annotation allows modifying the books list as shown below 
	//books = null;
	
	//}
}
