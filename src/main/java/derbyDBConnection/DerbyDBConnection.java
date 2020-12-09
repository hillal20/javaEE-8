package derbyDBConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DerbyDBConnection {

	
	public static void main(String[] args) throws SQLException {
		String url = "jdbc:derby:c:\\'Program Files'\\Derby-Db\\MyDb;create=true";
		Connection conn = DriverManager.getConnection(url);
		
		System.out.println(" conn successfull =====>"+ conn );
		conn.close();
	}
}
