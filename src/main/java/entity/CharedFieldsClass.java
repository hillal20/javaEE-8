package entity;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass // allow this class to be shared with other classes who has id, name , price fields
public abstract class CharedFieldsClass implements Serializable{
	
	// this class wont have a table in the db , it is just a helper class to provide the shared fields 
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO) // auto generate the id 
	Long id;
	
	String name;
	
	Integer price ;
	
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	
	
}
