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
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import entity.ToDo;
import service.TodoService;

@Path("todo")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class ToDoRest {
	
	@Inject 
	TodoService toDoService;
	
	
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
	
	

}
