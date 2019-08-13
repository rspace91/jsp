package kr.or.ddit.lprod.repository;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

import kr.or.ddit.lprod.model.Lprod;

public class LprodDaoTest {
	
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
}
