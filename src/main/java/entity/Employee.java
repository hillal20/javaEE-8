package entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // asking jpa to create a column named Identity and it will be the foreign keys
	Long id;
	
	 private String name;
	 private int age;
 
	@ManyToOne // this tell JPA  that this class has a ManyToOne relationship with the department entity 
	@JoinColumn(name="dep_ID") // this will name the foreign key column in the employee table 
	private Department department; // the ownership means  who has the foreign key , the employee table will have the foreign key of the department 
	
	
	
	@OneToOne
	@JoinColumn(name="pay_check_id")
	private PayCheck payCheck;
	
	
	
	
	
	
	
	////////////////////////////////////////////////////////
	
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	  
  
}
