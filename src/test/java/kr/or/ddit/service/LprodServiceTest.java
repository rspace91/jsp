package kr.or.ddit.service;

import static org.junit.Assert.*;

import java.util.List;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

import kr.or.ddit.common.model.Page;
import kr.or.ddit.lprod.model.Lprod;
import kr.or.ddit.lprod.service.ILprodService;
import kr.or.ddit.lprod.service.LprodServiceImpl;

public class LprodServiceTest {

	public ILprodService lprodService;

	@Before
	public void setup() {
		lprodService = new LprodServiceImpl();
	}

	/**
	 * Method : getLprodPagingList
	 * 작성자 : PC-12
	 * 변경이력 :
	 * @param page
	 * @return
	 * Method 설명 : Lprod 페이징 리스트 조회 
	 */
	@Test
	public void getLprodPagingList(){
	/***Given***/
	Page page = new Page();
	page.setPage(1);
	page.setPagesize(5);

	/***When***/
	Map<String, Object> resultMap = lprodService.getLprodPagingList(page);
	List<Lprod> lprodList = (List<Lprod>)resultMap.get("lprodList");
	int paginationSize = (Integer)resultMap.get("paginationSize");

	/***Then***/
	assertEquals(5, lprodList.size());
	assertEquals(2, paginationSize);
}
}
