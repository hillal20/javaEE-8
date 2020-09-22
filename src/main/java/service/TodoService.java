package service;



import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import entity.ToDo;

@Transactional
public class TodoService {
	

	@PersistenceContext 
	EntityManager entityManager;
	
	
	// Inserting 
	public ToDo createTodo(ToDo toDoObj) {
		
		entityManager.persist(toDoObj);
		return toDoObj;
	}
	
	// updating 
	public ToDo updateToDo(ToDo toDoObj) {	
		entityManager.merge(toDoObj);
		return toDoObj;
	}
	
	// find by id 
	public ToDo findById(Long Id) {
		
		return entityManager.find(ToDo.class, Id);
		
	}
   
	// get list of all the todo`s 
	public List<ToDo > getAllToDo(){
		
		 return entityManager
				 .createQuery("select t from ToDO t", ToDo.class)
				 .getResultList();
	}
	
	
	
}
