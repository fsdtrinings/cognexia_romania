package com.myapp.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.xml.ws.Response;

import com.myapp.dao.DAOImpl;


@WebServlet("/validate")
public class LoginServlet extends HttpServlet {
	
	
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.sendRedirect("home.html");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		
		
		System.out.println(username+" "+password);
		
		DAOImpl dao = new DAOImpl();
		try{
		
			String userRole = dao.validateUser(username, password);
			
			if(userRole != null)
			{
				HttpSession session = request.getSession(true); // no impact if we did not pass any argument
				
				long loginTime = session.getCreationTime();
				
				session.setAttribute("loginTime", loginTime);
				session.setAttribute("username",username);
				session.setAttribute("role", userRole);
				
				
				String userPage =  userRole.equals("employee")?"UserPage":"LoadHrData";
				
				
				request.getRequestDispatcher(userPage).forward(request, response);
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
