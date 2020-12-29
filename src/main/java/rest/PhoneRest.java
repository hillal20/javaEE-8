package rest;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import entity.Phone;
import service.PhoneService;

@Path("phone")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class PhoneRest {

	
	@Inject 
	PhoneService phoneService;
	
	private List<Phone> listOfPhones;
	
	@Path("new")
	@POST
	public Response createToDo(Phone phoneObj) {
		     
		 phoneService.createPhone(phoneObj);
		 return Response.ok(phoneObj).build();
			
	}
	
	
	@Path("all")
	@GET
	public List<Phone>  getAllPohones() {
		listOfPhones = phoneService.getAllPhones();
		return  listOfPhones;
	}
	
}
