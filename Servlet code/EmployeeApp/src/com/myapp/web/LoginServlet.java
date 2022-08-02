package com.myapp.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.myapp.dao.DAOImpl;


@WebServlet("/validate")
public class LoginServlet extends HttpServlet {
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		
		
		System.out.println(username+" "+password);
		
		DAOImpl dao = new DAOImpl();
		try{
		
			boolean loginStatus = dao.validateUser(username, password);
			
			if(loginStatus)
			{
				int points = 100; // after some business process
				request.setAttribute("points", points);
				// redirect request 
				request.getRequestDispatcher("UserPage").forward(request, response);
			}
			else
			{
				throw new Exception("Invalid Username & Password ");
			}
			
		}
		catch(Exception e)
		{
			response.getWriter().append(" Exception :- "+e);
		}
		
		
		
	}

}
