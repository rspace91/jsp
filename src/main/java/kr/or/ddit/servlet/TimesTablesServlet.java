package kr.or.ddit.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



public class TimesTablesServlet extends HttpServlet {
	
	private static final Logger logger = LoggerFactory.getLogger(TimesTablesServlet.class);
	
	

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		System.out.println("TimeTableServlet.doGet()");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
		
		String method = req.getMethod();
		
		logger.debug("traceTimesTablesServlet.doGet() {} {}",method,method+"test");
		logger.trace("debug TimesTablesServlet.doGet()");
		logger.info("info TimesTablesServlet.doGet()");
		logger.warn("warn TimesTablesServlet.doGet()");
		logger.error("error TimesTablesServlet.doGet()");
		
		resp.setContentType("text/html; charset=utf-8");
	
		PrintWriter pw = resp.getWriter();
		pw.write("<html>");
		pw.write("  <head>");
		pw.write("  	<title>구구단</title>");
		pw.write("  </head>");
		pw.write("  <body>");
		pw.write("  	<h1>현재시간 :</h1>");
		pw.write("		<table border=1>");
		for(int i=1; i<=9; i++) {
			pw.write("<tr>");
			for(int j=2; j<10; j++) {
				pw.write("<td>"+j+"*"+i+"="+i*j +" </td>");
				
			}
			pw.write("</tr>");
			
		}
		pw.write("		</table>");
		pw.write("  </body>");
		pw.write("</html>");
		
	}
	
}

