package interceptors;

import java.util.List;

import javax.annotation.Priority;
import javax.inject.Inject;
import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;

@MyInterceptor // my custom intercepter annotation assigned to this intercepting class 
@Interceptor // telling the cdi container this class is intercepting class that holds the code 
@Priority(Interceptor.Priority.APPLICATION ) 
public class InterceptorClass {
	
	// this class will hold the intercepting code that will run during the interception 
	
	@Inject
	public List<String> books;
	
	private String user ="Hill";
	
   @AroundInvoke // this to precise the method which does the interception 
   public Object getInvokation(InvocationContext context ) throws Exception {
	   
	   System.out.println(" ====="+ user + " intercepted ======");
	   return context.proceed();
	  
   }
	
}
