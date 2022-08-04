package com.myapp.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class UserPage
 */
@WebServlet("/UserPage")
public class UserPage extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		HttpSession session = request.getSession(false);
		
		if(session != null)
		{
		
			String username = (String)session.getAttribute("username");
			long loginTime = (Long)session.getAttribute("loginTime");
			
			out.print("<h3 style='width:100%;height:10%;background-color:#E8F9F9'> Welcome "+username+"</h3>");
			out.print("<hr/> "+loginTime);
			
		}
		else
		{
			response.sendRedirect("home.html");
		}
		

		
	}//end of post

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}
	

	
	

}//end of Servlet


















