package kr.or.ddit.lprod.web;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.annotations.ResultMap;

import kr.or.ddit.common.model.Page;
import kr.or.ddit.lprod.model.Lprod;
import kr.or.ddit.lprod.service.ILprodService;
import kr.or.ddit.lprod.service.LprodServiceImpl;
import kr.or.ddit.user.service.IUserService;
import kr.or.ddit.user.service.UserService;

/**
 * Servlet implementation class LprodPagingListController
 */
@WebServlet("/lprodPagingList")
public class LprodPagingListController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ILprodService lprodService;

	@Override
	public void init() throws ServletException {
		lprodService = new LprodServiceImpl();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		String pageStr = request.getParameter("page");
		String pagesizeStr = request.getParameter("pagesize");
		
		int pagesize = pagesizeStr == null ? 5 : Integer.parseInt(pagesizeStr);
		int page = pageStr == null ? 1: Integer.parseInt(pageStr);
		
		Page p = new Page(page,pagesize);
		request.setAttribute("pageVo", p);
		
		Map<String, Object> resultMap = lprodService.getLprodPagingList(p);
		List<Lprod> lpordList = (List<Lprod>)resultMap.get("lprodList");
		
		int paginationSize = (Integer)resultMap.get("paginationSize");
		request.setAttribute("lprodList", lpordList);
		request.setAttribute("paginationSize", paginationSize);
		
		request.getRequestDispatcher("/lprod/lprodPagingList.jsp").forward(request, response);
		
	}

}
