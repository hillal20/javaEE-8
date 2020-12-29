package entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.TableGenerator;

@Entity
public class Phone {
    
	@TableGenerator( // is a generation strategy for pk 
			name = "phone_pk_table_generator",// name of the generator strategy 
			pkColumnName = "phone_pKey_name", // name of the pk column in the table 
			pkColumnValue = "phone_pKey_value",// value of the pk in the table rows
			table = "ID_table_generator" // name of  table where to store the pk	
			)
	@GeneratedValue(generator = "phone_pk_table_generator")
	@Id
	Long id;
	
	private String name;

	
	
	
	//////////////////////////////////////////////////////////////////////
			
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}


