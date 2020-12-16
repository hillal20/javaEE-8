package entity;

import javax.persistence.Embeddable;

@Embeddable // means it does not have it own entity class, 
public class EmbaddableClass {
	
	private String street;
	private int zipCode;
	private String city;
	private String country;
}
