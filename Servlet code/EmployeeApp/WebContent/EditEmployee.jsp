<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form method="post" action="ud">
		<table>
		<tr>
			<td> User name </td>
			<td> <input type="text" value="<%=request.getParameter("clickedUser") %>" name="username" readonly="true"> </td>
			<td>  </td>
		</tr>
		<tr>
			<td> Hidden </td>
			<td> <input type="hidden" value="James007" name="hidden007"> </td>
			<td>  </td>
		</tr>
		<tr>
			<td> Role </td>
			<td> <input type="text" value="<%=request.getParameter("role") %>" readonly="true"> </td>
			<td> 
				<input type="radio" value="admin" name="role">Admin
				<input type="radio" value="employee" name="role">Employee
			</td>
		</tr>
		
		<tr>
			<td> <input type="submit" value="Change Role"> </td>
			<td>  </td>
		</tr>
		
		
	</table>
	</form>
</body>
</html>