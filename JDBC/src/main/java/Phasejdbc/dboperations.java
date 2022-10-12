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



@WebServlet("/dboperations")
public class dboperations extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            PrintWriter out = response.getWriter();
            out.println("<html><body>");
            Connection con=DBConnect.getMyConnect();
            Statement stmt = con.createStatement();
            stmt.executeUpdate("create database mydatabase");
            out.println("Created database: mydatabase<br>");
            stmt.executeUpdate("use mydatabase");
            out.println("Selected database: mydatabase<br>");
            stmt.executeUpdate("drop database mydatabase");
            stmt.close();
            out.println("Dropped database: mydatabase<br>");
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
