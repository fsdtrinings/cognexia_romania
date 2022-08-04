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
	   String userrole = (String)session.getAttribute("role");
	   
	   List<Users> allUsers = (List<Users>) session.getAttribute("allUsers");
	   
	   if(allUsers==null)
	   {
		   allUsers = new ArrayList();
	   }
		
	%>
	welcome<b><i> <%=username%> </i></b> <br/>
	role <%=userrole %>
	<hr/>
	
	
	<table  cellpadding="5px" cellspacing="5px">
		<%
			for(Users user:allUsers)
			{
				
				String uname = user.getUsername();
				String pass = user.getPassword();
				String role = user.getRole();
				
				%>
				<tr>
				
					<td> <%=uname%> </td>
					<td> <%=pass %>  </td>
					<td> <%=role %>   </td>
					<td> <a href="ud?clickedUser=<%=uname%>&role=<%=role%>&city=delhi"> delete </a>   </td>
					<td> <a href="EditEmployee.jsp?clickedUser=<%=uname%>&role=<%=role%>&password=<%=pass%>">chnage role</a>   </td>
					
				</tr>	
				
		<%	}//end of for
		%>
	</table>
	
	
	
	
</body>
</html>




















