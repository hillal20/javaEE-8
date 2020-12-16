package entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.json.bind.annotation.JsonbDateFormat;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

import enums.MyEnum;

@Entity
@Table(name = "carTable",schema = "vehicle")// shcema is the prepend string will be attached to the name of the table
public class Car {

// if we dont add the table annotation the jpa will ask the db to name as-is 	
	
	@Id 
	Long id; 
	
	@JsonbDateFormat(value = "yyyy-MM-dd")
	LocalDateTime  creationDate;
	
	@JsonbDateFormat(value = "yyyy-MM-dd")
	LocalDateTime  updatedOn;
	
	
	String name;
	
	@Enumerated(EnumType.STRING) // this will force jpa to use the enum values as strings and wont use the index 
	private MyEnum myEnum; 
	
	
	@Lob // long object 
	@Basic(fetch = FetchType.LAZY) // let jpa provider to not fetch because it is big unless it is demanded by the getter
	byte[] carImage;

	
	
	/* the concept of fetching is the process when the jpa provider goes to the db and
	 * bring a row of data which represent an instance of an entity class ,
	 * the fields of the entity class are the column in the db ,
	 * by default the FetchType.eager is the default unless stated in the @Basic 
	 */
	

	
	

	public LocalDateTime getCreationDate() {
		return creationDate;
	}


	public void setCreationDate(LocalDateTime creationDate) {
		this.creationDate = creationDate;
	}


	public LocalDateTime getUpdatedOn() {
		return updatedOn;
	}


	public void setUpdatedOn(LocalDateTime updatedOn) {
		this.updatedOn = updatedOn;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public byte[] getCarImage() {
		return carImage;
	}


	public void setCarImage(byte[] carImage) {
		this.carImage = carImage;
	}
	
	
}
