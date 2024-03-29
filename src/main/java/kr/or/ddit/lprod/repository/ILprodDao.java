package kr.or.ddit.lprod.repository;

import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import kr.or.ddit.common.model.Page;
import kr.or.ddit.lprod.model.Lprod;

public interface ILprodDao {
	
		List<Lprod> getLprodList() ;
		/**
		 * Method : getLprodPagingList
		 * 작성자 : PC-12
		 * 변경이력 :
		 * @param sqlSession
		 * @param page
		 * @return
		 * Method 설명 : Lprod페이징 리스트 조회
		 */
		List<Lprod> getLprodPagingList(SqlSession sqlSession, Page page);
		/**
		 * Method : getLprodTotalCnt
		 * 작성자 : PC-12
		 * 변경이력 :
		 * @param sqlSession
		 * @return
		 * Method 설명 : lprod 전체 건수 조회
		 */
		int getLprodTotalCnt(SqlSession sqlSession);
}
