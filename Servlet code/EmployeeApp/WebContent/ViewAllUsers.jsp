<%@page import="com.myapp.dao.DAOImpl"%>
<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@page import="java.util.List"%>
<%@page import="com.myapp.entity.Users"%>
<%@page import="java.sql.ResultSet"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<ul>


	<%
		Users obj = new Users();
	List<Integer> list = obj.getData();
	
		for(Integer x:list)
		{
			%>
				<li> <%=x%> </li> 
			<%
		}//end for
	%>
</ul>
<hr/>

	<%
		try{
			ResultSet rs = new DAOImpl().getAllUsers();
			while(rs.next())
			{
				String username = rs.getString("username");
				String password = rs.getString("password");
				String role = rs.getString("role");
				
		%>
				<%=username %> - <%=password %> - <%=role%> <br/>
		
		<%
			
			}
			
		}
		catch(Exception e)
		{
			out.print(e);
		}
	%>

</body>
</html>

















