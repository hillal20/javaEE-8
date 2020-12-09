package entity;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.AttributeOverride;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Transient;

@Entity
@AttributeOverride(name = "id", column = @Column(name ="computerID"))
@Access(AccessType.FIELD) // it is the default access for jpa into a class field , i am just adding it here to show that it is existing
public class Computer  extends CharedFieldsClass{
	// AttributOverride is  to override the id coming form the charedClass and to make computerID is the primary key  

	@Basic // to let the jpa konw the type of the field is simple: string, long, int , double ....
	private String company;
	
	@Column(name = "ctry") // to customize this  field in the db 
	private String country;
	
	 @Transient // to tell the jpa not to create it in the db and keep it only at the entity level
	 private int ram;

	 
	 
	 
	 
	 
	 
	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}
	 
	 
	
}
