package kr.or.ddit.lprod.repository;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import kr.or.ddit.common.model.Page;
import kr.or.ddit.lprod.model.Lprod;
import kr.or.ddit.util.MybatisUtil;

public class LprodDaoTest {
	private static final Logger logger = LoggerFactory.getLogger(LprodDaoTest.class);
	private ILprodDao lprodDao;
	private SqlSession sqlSession;
	
	@Before
	public void setup() {
		logger.debug("before");
		lprodDao = new LprodDao();
		sqlSession = MybatisUtil.getSession();
	}
	
	@After
	public void tearDown() {
		logger.debug("after");
		sqlSession.close();
	}
	/**
	 * 
	 * Method : getLprodListTest
	 * 작성자 : PC-12
	 * 변경이력 :
	 * Method 설명 :
	 */
	@Test
	public void getLprodListTest() {
		/***Given***/
		ILprodDao lprodDao = new LprodDao();

		/***When***/
		List<Lprod> lprodList = lprodDao.getLprodList();
		/***Then***/
		assertEquals(9, lprodList.size());
	}
	
	@Test
	public void getLprodPagingList() {
		/***Given***/
		Page page = new Page();
		page.setPage(1);
		page.setPagesize(5);
		/***When***/
		List<Lprod> lprodList = lprodDao.getLprodPagingList(sqlSession, page);
		/***Then***/
		assertEquals(5, lprodList.size());
	}
	
	@Test
	public void getLprodTotalCnt() {
		/***Given***/
		/***When***/
		int totalCnt = lprodDao.getLprodTotalCnt(sqlSession);
		/***Then***/
		assertEquals(9, totalCnt);
	}
}
