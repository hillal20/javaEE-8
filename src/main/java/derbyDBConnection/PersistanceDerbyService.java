package derbyDBConnection;

import javax.annotation.sql.DataSourceDefinition;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;



@DataSourceDefinition(
		url = "jdbc:derby://localhost:1527/dataBase-1;create=true",
		password = "hill" ,
		user = "hill",
		name = "dataBase-1",
		className = "org.apache.derby.jdbc.ClientDriver"
		)
@Stateless
public class PersistanceDerbyService {
	
	@Inject
	EntityManager eManager;

}
