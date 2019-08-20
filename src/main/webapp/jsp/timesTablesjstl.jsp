<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri = "http://java.sun.com/jsp/jstl/core" %>    
<%--스크립틀릿, 표현식--> jstl, el --%>    
<!DOCTYPE html>
<html>
<title>jsp 구구단</title>
<style>
	table{
		border-collapse:collapse;
		width:700px;
		height:350px;
		text-align : center;
	}
</style>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>

<body>
	
	
	<h2>times tables jstl</h2>
	<table border=1>
		<c:forEach begin="1" end="9" var="i"  >
				<tr>
			<c:forEach begin="2" end="9" var="j" >
				<td>${j} * ${i} = ${j *i}</td>
			</c:forEach>
				</tr>
		</c:forEach>
	</table>

</body>
</html>