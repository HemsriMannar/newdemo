package LoginCheck;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Checker
 */
@WebServlet("/Checker")
public class Checker extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uname=request.getParameter("txtUname");
		String pword=request.getParameter("txtPassword");
		PrintWriter out=response.getWriter();
		//RequestDispatcher- an interface to include content on same page or different pages
		RequestDispatcher rd;
		if(uname.equalsIgnoreCase("java") && pword.equals("eclipse123")){
			//session object is created bby web conatiner and generate sessionid
			HttpSession session=request.getSession(true);
			session.setAttribute("username", uname);
			
			rd=request.getRequestDispatcher("Welcome");
			rd.forward(request, response);
		}
		else {
			out.println("Invalid Username or Password");
			rd=request.getRequestDispatcher("login.html");
			response.setContentType("text/html");
			rd.include(request, response);
		}
	}

}
