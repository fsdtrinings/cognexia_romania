package com.myapp.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.myapp.dao.DAOImpl;

/**
 * Servlet implementation class RegistrationServlet
 */
@WebServlet("/RegistrationServlet")
public class RegistrationServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String role = request.getParameter("role");
		
		DAOImpl dao = new DAOImpl();
		
		try {
		
			if(dao.insertUser(username, password, role))
			{
				response.sendRedirect("home.html");
			}
			else
			{
				throw new Exception("Database Issue ..Contact to Customer Care :- care@abc.com");
			}
		} catch (Exception e) {
				response.getWriter().append(""+e.getMessage());
		}
		
	}

}
