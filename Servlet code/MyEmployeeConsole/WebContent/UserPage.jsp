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
		String role = (String)session.getAttribute("role");
		String pageToAdd = ""; 
		
		String projectName = (String)session.getAttribute("project");
		out.print("--- project Name "+projectName);
		if(projectName == null) // || projectName.length()<=0  )
		{
			projectName = "Project Not Allocated Yet !!";
			out.print("--- inside if project Name "+projectName);
		}
		out.print("--- project Name "+projectName);
		if(role.equals("HR"))
		{
			pageToAdd = "hr.jsp";
		}
		else if(role.equals("Developer"))
		{
			pageToAdd = "developer.jsp";
		}
		
	%>
	<div>
		<%@ include file="Header.jsp" %>
	</div>
	<table style="width: 100%;height: 100%">
		<tr>
			<td style="width: 50%">
				<jsp:include page="<%=pageToAdd%>">
					<jsp:param value="<%=projectName%>" name="project"/>
				</jsp:include>
			</td>
			
			
			
			<td>
			
					Some user Specific things
			</td>
			
			
		
		</tr>
	</table>
</body>
</html>