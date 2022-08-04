package p3;

import java.io.IOException;
import java.util.List;

import javax.management.relation.RelationSupportMBean;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import p1.dao.DAOImpl;
import p1.entity.MyUser;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		DAOImpl dao = new DAOImpl();
		
		MyUser userInfo = dao.validateUser(username, password);
		
		if(userInfo != null)
		{
			HttpSession session = request.getSession(true);
			
			String role = userInfo.getRole();
			String project = userInfo.getProjectName();
			List<String> taskList = userInfo.getTaskName();
			
			session.setAttribute("role",role);
			System.out.println("--------- "+userInfo+"Inside login Servlet Project Information "+project);
			session.setAttribute("project",project);
			session.setAttribute("task",taskList);
			
			
			response.sendRedirect("UserPage.jsp");
		}
		else
		{
			response.getWriter().append("Not Validated ");
		}
		
		
	}

}
