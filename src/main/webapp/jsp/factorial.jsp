<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- 선언부 : 메소드나 변수를 선언 -->
<%!
	public int factorial(int fac){
		int result = 0;
		
		if(fac <= 1){
		  return 1;
		}else{
			
			result = fac * factorial(fac-1);
			return result;
		}
		
	}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%for(int i = 0; i < 9; i++){ %>
		factorial(<%=i %>) : <%=factorial(i) %><br>
	<%} %>
</body>
</html>