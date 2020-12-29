

package derbyDBConnection;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;




public class DerbyDBConnection {

	
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		
		  String url = "jdbc:derby:C:\\MyDerbyDb\\Derby-Db\\MyDb;";
		   Connection conn = DriverManager.getConnection(url);
		  System.out.println(" conn successfull =====>"+ conn );
		   Properties schema = conn.getClientInfo();
		   System.out.println("======> "+ schema.isEmpty());
		 
		
		
		
		// ===============================================================   how to create tables ======
		
		/*
		 * //Registering the driver
		 * Class.forName("org.apache.derby.jdbc.EmbeddedDriver"); //Getting the
		 * Connection object String URL = "jdbc:derby:C:\\MyDerbyDb\\Derby-Db\\MyDb;";
		 * Connection conn = DriverManager.getConnection(URL);
		 * 
		 * //Creating the Statement object Statement stmt = conn.createStatement();
		 * 
		 * //Executing the query String query = "CREATE TABLE Employees( " +
		 * "Id INT NOT NULL GENERATED ALWAYS AS IDENTITY, " + "Name VARCHAR(255), " +
		 * "Salary INT NOT NULL, " + "Location VARCHAR(255), " + "PRIMARY KEY (Id))";
		 * stmt.execute(query); System.out.println("====  Table created ====");
		 */
	
	}
}
