package rest;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import entity.ToDo;
import qualifiers.Salute;
import qualifiers.annotations.Police;
import scope.ApplicationScopeClass;
import scope.ConversationScopeClass;
import scope.DependentScopeClass;
import scope.RequestScopeClass;
import scope.SessionScopeClass;
import service.TodoService;
import interceptors.MyInterceptor;
@Path("todo")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class ToDoRest {
	
	@Inject 
	TodoService toDoService;
	
	// contextual scoped instances 
	@Inject 
	ApplicationScopeClass appScopeClass;
	@Inject 
	ConversationScopeClass conversationScopeClass;
	@Inject
	DependentScopeClass dependentScopeClass;
	@Inject 
	RequestScopeClass requestScopeClass;
	@Inject 
	SessionScopeClass sessionScopeClass;
	
	
	@Inject // injecting a  list which is a return of a function bean invoked   by the CDI 
	private List<String> getMyList;
	
	@Inject 
	@Police //  Injecting  an object  which is a return of a  bean function invoked by the CDI 
	private Salute getSalution;
	
	
	
	
	
	@Path("new")
	@POST
	public Response createToDo(ToDo toDoObj) {
		     
		 toDoService.createTodo(toDoObj);
		 return Response.ok(toDoObj).build();
		
		
	}
	
	@Path("update")
	@PUT
	public Response updateToDo(ToDo toDoObj) {
		     
		 toDoService.updateToDo(toDoObj);
		 return Response.ok(toDoObj).build();
		
		
	}
	
	@Path("{Id}")
	@GET
	public Response getToDoById(@PathParam("Id") Long  Id) {
		     
		ToDo result =  toDoService.findById(Id);
		 return Response.ok(result).build();
		
		
	}
	
	@Path("all")
	@GET
	public Response getAllToDo() {
		     
		List<ToDo>result =  toDoService.getAllToDo();
		 return Response.ok(result).build();
		
		
	}
	
	
	@Path("status")
    @POST
    public Response updateCompleted(@QueryParam("id") Long id) {
		
		ToDo toDo = toDoService.findById(id);
		toDo.setCompleted(true);
		
		 toDoService.updateToDo(toDo);
		 
		return Response.ok(toDo).build();
	}
	
	@Path("getScope")
	@GET
	public void  getAllScopes() {
		
	 System.out.println(appScopeClass.getHash() + " " +  appScopeClass.hashCode());
	 System.out.println(sessionScopeClass.getHash() + " " +sessionScopeClass.hashCode());
	 System.out.println(requestScopeClass.getHash() + " " + requestScopeClass.hashCode());
	 System.out.println(dependentScopeClass.getHash() + " " +  dependentScopeClass.hashCode());
	 System.out.println(conversationScopeClass.getHash() + " " + conversationScopeClass.hashCode());
	
	}

	
	@Path("getMyBook")
	@GET
	public void  getMyBook() {		
	 System.out.println("==== My book ====>: " + getMyList.get(1) );
	 
	}
	
	@MyInterceptor
	@Path("getPolice")
	@GET
	public void  getPloice() {		
	 System.out.println("==== My police ====>: " + getSalution.salute("hello") );
	 
	}
}
