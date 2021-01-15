package entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

public class ParkingSpot {

@Id
@GeneratedValue(strategy = GenerationType.AUTO)
Long id;
	
String name;


@OneToOne
@JoinColumn(name = "employee_id") // the ParkingSpot table will have the foreign key of employee table 
private Employee employee; 


///////////////////////////////////////////

public Employee getEmployee() {
	return employee;
}


public void setEmployee(Employee employee) {
	this.employee = employee;
}


public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}



}

