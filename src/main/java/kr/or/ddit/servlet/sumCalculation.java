package kr.or.ddit.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@WebServlet("/sumCalculation")
public class sumCalculation extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private static final Logger logger = LoggerFactory.getLogger(sumCalculation.class);   
    
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String start = request.getParameter("start");
		String end = request.getParameter("end");
		
		int startNum = Integer.parseInt(start);
		int endNum = Integer.parseInt(end);
		
		int resultNum=0;
		for(int i=startNum; i<=endNum; i++) {
			resultNum +=  i;
		}
		HttpSession session = request.getSession();
		session.setAttribute("sumResult", resultNum);
		
		request.getRequestDispatcher("/jsp/sumResult.jsp").forward(request, response);
		for(int i=startNum; i<=endNum; i++) {
			
			logger.debug("startNum : "+startNum);
			logger.debug("endNum: " + endNum );
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/jsp/sumInput.jsp").forward(request, response);
	}

}
