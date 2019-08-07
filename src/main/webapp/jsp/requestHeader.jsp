<%@page import="java.util.Enumeration"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
<<<<<<< HEAD
		Enumeration<String> headerNames =  request.getHeaderNames();
	%>
	<h2>request header</h2>
	<ul>
		<%while(headerNames.hasMoreElements()){ 
			String headerName = headerNames.nextElement();
		%>
			<li><%=headerName %> : <%=request.getHeader(headerName) %></li>
		<%} %>
	</ul>
=======
	  Enumeration<String> headerNames = request.getHeaderNames();
	
	%>
	<h2>request header</h2>
	<ul>
		<%while(headerNames.hasMoreElements()){
			String headerName =headerNames.nextElement();
		%>	
			<li><%= headerName%> : <%=request.getHeader(headerName) %></li>
		<%}%>
	
	</ul>

>>>>>>> branch 'master' of https://github.com/rspace91/jsp.git
</body>
</html>