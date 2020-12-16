package entity;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "BookTable")
public class Book  extends CharedFieldsClass{
	
	@Embedded // means this instance of embedded class. the jpa provider will create the columns of EmbaddableClass automatically 
	public EmbaddableClass embaddableClass;
	
	
	/* an embedded class is a class that has not entity but occupied  a field  in an entity class
	 * and the jpa will automatically create the embedded columns in the entity table
	 * */

}
