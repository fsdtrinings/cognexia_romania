<%@page import="java.util.ArrayList"%>
<%@page import="com.myapp.entity.Users"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
	   // use to write java code
	   
	   String username = (String)session.getAttribute("username");
	   String role = (String)session.getAttribute("role");
	   
	   List<Users> allUsers = (List<Users>) session.getAttribute("allUsers");
	   
	   if(allUsers==null)
	   {
		   allUsers = new ArrayList();
	   }
		
	%>
	welcome<b><i> <%=username%> </i></b> <br/>
	role <%=role %>
	<hr/>
	
	
	<table>
		<%
			for(Users user:allUsers)
			{
				%>
				<tr>
				
					<td> <%=user.getUsername() %> </td>
					<td> <%=user.getPassword() %>  </td>
					<td> <%=user.getRole() %>   </td>
					<td> <a href="#">edit</a>   </td>
					<td> <a href="#">delete</a>   </td>
					
				</tr>	
				
		<%	}//end of for
		%>
	</table>
	
	
	
	
</body>
</html>




















