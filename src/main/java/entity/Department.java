package entity;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Department {
   
	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
	Long id; 
	
	String name;
	
	
	@OneToMany(mappedBy ="departement") // the employee owns the relationship because it has the foreign key of the department 
	Collection<Employee> employeesList = new ArrayList<>();
	
	
	/////////////////////////////////////////////////
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Collection <Employee> getEmployeesList() {
		return employeesList;
	}

	public void setEmployeesList(List<Employee> employeesList) {
		this.employeesList = employeesList;
	}
	
	
	

}
