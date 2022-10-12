package Phasejdbc;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class List
 */
@WebServlet("/List")
public class List extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	      
               
               try {
                        PrintWriter out = response.getWriter();
                        out.println("<html><body>");
                        
                       InputStream in = getServletContext().getResourceAsStream("/WEB-INF/config1.properties");
                       Properties props = new Properties();
                       props.load(in);
                       
                       DBConnection conn = new DBConnection(props.getProperty("url"), props.getProperty("userid"), props.getProperty("password"));
                       Statement stmt = conn.getConnection().createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
                       stmt.executeUpdate("insert into eproduct values(5,'microsoft',20000)");
                       ResultSet rst = stmt.executeQuery("select * from eproduct");
                       
                       while (rst.next()) {
                               out.println(rst.getInt("proID") + ", " + rst.getString("proNAME") + ", " + rst.getString("procost")+"<Br>");
                       }
                       
                       stmt.close();
                       out.println("</body></html>");
                       conn.closeConnection();
                       
               } catch (ClassNotFoundException e) {
                       e.printStackTrace();
               } catch (SQLException e) {
                       e.printStackTrace();
               }
	       }
	}
