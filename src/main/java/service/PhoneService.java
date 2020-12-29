package service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import entity.Phone;


@Transactional 
public class PhoneService {
	
	
	@PersistenceContext 
	EntityManager entityManager; // means the db manager
	
	   // Inserting  a phone
		public Phone createPhone(Phone phone) {
			
			entityManager.persist(phone);
			return phone;
		}
		
		
		// get all phones 
		public List<Phone> getAllPhones(){
			
			 return entityManager
					 .createQuery("select t from Phone t",Phone.class)
					 .getResultList();
		}
		
}
