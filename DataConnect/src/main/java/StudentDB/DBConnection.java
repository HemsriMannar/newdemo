package StudentDB;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection{
	static Connection con=null;
	public static Connection getMyConnection() throws Exception {
	Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","Hemsri@1");
		return con;
	}
}
