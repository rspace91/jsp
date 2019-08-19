package kr.or.ddit.prod.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import kr.or.ddit.prod.model.Prod;
import kr.or.ddit.prod.repository.IProdDao;
import kr.or.ddit.prod.repository.ProdDao;

/**
 * Servlet implementation class ProdController
 */
@WebServlet("/prodList")
public class ProdController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private static final Logger logger = LoggerFactory.getLogger(ProdController.class);
	
	private IProdDao prodDao;
	
	@Override
	public void init() throws ServletException {
		prodDao = new ProdDao();
	}
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String prodId = request.getParameter("lprod_gu");
		
		List<Prod> list = prodDao.getProd(prodId);
		
		request.setAttribute("list", list);
		
		request.getRequestDispatcher("/prod/prodList.jsp").forward(request, response);
	}

	
}
