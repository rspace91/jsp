package kr.or.ddit.lprod.service;

import java.util.Map;

import kr.or.ddit.common.model.Page;

public interface ILprodService {
	/**
	 * Method : getLprodPagingList
	 * 작성자 : PC-12
	 * 변경이력 :
	 * @param page
	 * @return
	 * Method 설명 : Lprod 페이징 리스트 조회 
	 */
	Map<String, Object> getLprodPagingList(Page page);
	

}
