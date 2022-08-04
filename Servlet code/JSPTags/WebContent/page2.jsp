<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%@include file="NewFile.jsp" %>
	<hr/>
	
	<%
	String roleSpecificPage = (String)request.getAttribute("role");
	String country = (String)request.getAttribute("country");
	
	%>
	
	Page2
	<hr/>
	User sepcific page 
	<br/>
	<jsp:include page="<%=roleSpecificPage %>">
		<jsp:param value="<%=country %>" name="country"/>
	</jsp:include>
</body>
</html>