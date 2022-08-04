package com.myapp.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.xml.ws.RequestWrapper;

import com.myapp.entity.Users;
import com.myapp.service.HrService;

/**
 * Servlet implementation class DeleteEmployeeServlet
 */
@WebServlet("/ud")
public class DeleteEmployeeServlet extends HttpServlet {
	
	HrService service = new HrService();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//responsible for delete operation
		
		System.out.println("inside doGet delete");
		String username = request.getParameter("clickedUser");
		try
		{
			boolean isDeleted = service.deleteUser(username);
			if(isDeleted)
			{
				
				HttpSession session = request.getSession(false);
				session.removeAttribute("allUsers");
				List<Users> list = service.getAllUsers();
				session.setAttribute("allUsers", list);
				
				response.sendRedirect("HrPage.jsp");
			}
			else throw new Exception("Unknown error during deleting "+username);
		}
		catch(Exception e)
		{
			throw new ServletException(e.getMessage());
		}
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		 // responsible for update operation
	
		String hiddenValue = req.getParameter("hidden007");
		String username = req.getParameter("username");
		String role = req.getParameter("role");
		
		try
		{
			boolean isUpdated = service.updateRole(role, username);
			if(isUpdated)
			{
				
				HttpSession session = req.getSession(false);
				session.removeAttribute("allUsers");
				List<Users> list = service.getAllUsers();
				session.setAttribute("allUsers", list);
				
				resp.sendRedirect("HrPage.jsp");
			}
			else throw new Exception("Unknown error during updating role for "+username);
		}
		catch(Exception e)
		{
			throw new ServletException(e.getMessage());
		}
		
		
	
	}
	
	

}
