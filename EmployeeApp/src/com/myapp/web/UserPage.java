package com.myapp.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UserPage
 */
@WebServlet("/UserPage")
public class UserPage extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		Integer point = (Integer)(request.getAttribute("points"));
		

		out.print("<h3 style='width:100%;height:10%;background-color:#E8F9F9'> Welcome "+username+"</h3>");
		out.print("<hr/>");
		out.print("points :- "+point);
		
	}

	

}
