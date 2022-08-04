package com.myapp.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.myapp.entity.Users;
import com.myapp.service.HrService;


@WebServlet("/LoadHrData")
public class LoadHrData extends HttpServlet {
	
	
	HrService service = new HrService();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		HttpSession session = request.getSession(false);
		
		if(session != null)
		{
			try {
				
				List<Users> allUsers = service.getAllUsers();
				if(allUsers.size()>0)
					session.setAttribute("allUsers", allUsers);
			
				request.getRequestDispatcher("HrPage.jsp").forward(request, response);
			} 
			catch (Exception e) {
				response.sendError(500);
			}
		}
		else
		{
			response.sendRedirect("Home.html");
		}
		
		
	}
	

}
