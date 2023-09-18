 

import java.sql.Connection;
import java.sql.DriverManager;
 import java.sql.SQLException;

 

public class JdbcCon {

	private JdbcCon() {

	}

	public static void getConn() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/t", "root", "ajay123");
 			java.sql.Statement statement = con.createStatement();

			//statement.execute(" CREATE TABLE P(" + "prod_id int," + "prod_name varchar(20)," + "prod_qty int,"
			//		+ "primary key(prod_id))");
			
			statement.execute("INSERT INTO P VALUES( 106,'PowerBank',20)");
 		
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

	
}