package com.assistedservlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;

/**
 * Servlet Filter implementation class CredentialChecker
 */
@WebFilter("/SalaryServlet")
public class CredentialChecker extends HttpFilter implements Filter {
       

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		PrintWriter out=response.getWriter();
		String uname = request.getParameter("txtUname");
		String pword=request.getParameter("txtPassword");
		if(uname.equalsIgnoreCase("accountant") && pword.equals("act123")) {
			
			chain.doFilter(request, response);
		}
		else
			out.println("Invalid Username or Password");
	}

	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
