package Phasejdbc;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/insertt")
public class insertt extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
            PrintWriter out = response.getWriter();
            out.println("<html><body>");
            Connection con=DBConnect.getMyConnect();
            Statement stmt = con.createStatement();
            stmt.executeUpdate("insert into eproduct(proID, proNAME,procost) values(6,'Samsung', 45000)");
            out.println("Executed an insert operation<br>");
            
            stmt.executeUpdate("update eproduct set procost=50000 where proNAME = 'microsoft'");
            out.println("Executed an update operation<br>");
            
            stmt.executeUpdate("delete from eproduct where proNAME = 'acer'");
            out.println("Executed a delete operation<br>");
            
            stmt.close();
            con.close();
            out.println("</body></html>");
            con.close();
            
	}catch (ClassNotFoundException e) {
        e.printStackTrace();
} catch (SQLException e) {
        e.printStackTrace();
} catch (Exception e) {
	e.printStackTrace();
}
}	
}
