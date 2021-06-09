package utilty;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcConnection {
	
	final static String DBUSER= "root";
	final static String DBPASSWORD="hitperson@123";
	final static String DBURL="jdbc:mysql://localhost:3306/applicationform";
	
	public static Connection getConnection() {
		
		Connection con =null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(DBURL,DBUSER,DBPASSWORD);
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
		
	}
}