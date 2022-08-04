<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

Developer Page
<hr/>
<%
	String projectName = request.getParameter("project");
	out.print("-->> Developer Page "+projectName);
%>
<%-- <h1> ${1+1} - <%=projectName %> </h1> --%>

<%
  List<String> taskList = (List<String>)session.getAttribute("task");
	
if(taskList !=null &&  taskList.size()>0)
{
	for(String t:taskList)
	{
		
		%>
			<%=t %> - ${task} <br/>
		<%
	}//end for
}//end if
%>
</body>
</html>