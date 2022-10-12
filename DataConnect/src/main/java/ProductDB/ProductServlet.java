package ProductDB;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ProductServlet")
public class ProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int pid=Integer.parseInt(request.getParameter("txtpid"));
		String pname=request.getParameter("txtpname");
		int Qantity=Integer.parseInt(request.getParameter("txtQuantity"));
		int price=Integer.parseInt(request.getParameter("txtprice"));
		int  Total=Integer.parseInt(request.getParameter("txtTotal"));
		PrintWriter out=response.getWriter();
		try {
			
			{
		
	}

	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
