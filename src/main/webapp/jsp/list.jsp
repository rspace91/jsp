<%@page import="kr.or.ddit.user.repository.IUserDao"%>
<%@page import="kr.or.ddit.user.model.UserVo"%>
<%@page import="java.util.List"%>
<%@page import="kr.or.ddit.user.repository.UserDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<%-- 1.userdao 선언
		 2.getUserList() 호출
		 3.호출결과(List<UserVo>)를 for loop를 통해 tr태그를 반복 생성
	
	 --%>
	<table border=1>
		<%IUserDao userDao = new UserDao();
		  List<UserVo> userList = userDao.getUserList();  %>	 
				
		<tr>
			<th>이름</th>
		</tr>
		<%for(UserVo userVo : userList){%>
			<tr>
				<td><%=userVo.getUserName() %></td>
			</tr>
		}
<%-- 			<%for(int i=0; i<userList.size(); i++ ){%> --%>
<!-- 			<tr> -->
<%-- 				<td><%=userList.get(i).getUserName() %></td> --%>
<!-- 			</tr>	 -->
<%-- 			<%} %> --%>
	</table>

</body>
</html>