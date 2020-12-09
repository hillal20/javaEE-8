package entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "carTable",schema = "vehicle")// shcema is the prepend string will be attached to the name of the table
public class Car {

// if we dont add the table annotation the jpa will ask the db to name as is 	
	
	@Id 
	Long id;
	
	String name;
	
}
