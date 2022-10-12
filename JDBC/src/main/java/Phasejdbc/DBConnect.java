package Phasejdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnect {
	static Connection con=null;
	public static Connection getMyConnect() throws Exception {
	Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommerce","root","Hemsri@1");
		return con;
	}
}
