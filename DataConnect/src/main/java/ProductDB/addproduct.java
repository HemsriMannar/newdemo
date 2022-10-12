package ProductDB;

import java.sql.Connection;
import java.sql.PreparedStatement;

import StudentDB.DBConnection;

public class addproduct extends ProductServlet{
		try {
			Connection con=DBConnection.getMyConnection();
			String str="Insert into studentDetails (pid,pname,Qantity,price,Total) values(?,?,?,?,?)";
			PreparedStatement ps=con.prepareStatement(str);
			ps.setInt(1, pid);
			ps.setString(2,pname);
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	
	

}
