package entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class PayCheck {

	
	// here in this entity the ralation between paycheck and employee is one to one but unileteral 
	// because this entity does not know about the employee 
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Long Id;
	
	
	String  month;
    int amount;

	//////////////////////////////////
	
	public String getMonth() {
		return month;
	}


	public void setMonth(String month) {
		this.month = month;
	}


	public int getAmount() {
		return amount;
	}


	public void setAmount(int amount) {
		this.amount = amount;
	}
	
}

