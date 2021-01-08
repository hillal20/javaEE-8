package entity;

import java.util.ArrayList;
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
	
	
	@OneToMany(mappedBy ="departement")
	List<Employee> employeesList = new ArrayList<>();
	
	
	/////////////////////////////////////////////////
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Employee> getEmployeesList() {
		return employeesList;
	}

	public void setEmployeesList(List<Employee> employeesList) {
		this.employeesList = employeesList;
	}
	
	
	

}
