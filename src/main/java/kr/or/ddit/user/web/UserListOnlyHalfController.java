package kr.or.ddit.user.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.ddit.user.model.User;
import kr.or.ddit.user.service.IUserService;
import kr.or.ddit.user.service.UserService;

/**
 * Servlet implementation class UserListOnlyHalfController
 */
@WebServlet("/userListOnlyHalf")
public class UserListOnlyHalfController extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*
		 *  -doGet
		 *  userDao 사용자 리스트 조회
		 *  request 객체에 사용자 리스트 정보를 저장
		 *  userList.jsp를 통해서 화면응답을 생서하도록 위임
		 */
		
		UserService userService = new UserService(); 
		List<User> userList = userService.getUserListOnlyHalf();
		
		request.setAttribute("userList", userList);
		
		request.getRequestDispatcher("/user/userListOnlyHalf.jsp").forward(request, response);
	}
	

}
