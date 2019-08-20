package kr.or.ddit.user.service;

import java.util.List;

import kr.or.ddit.user.model.User;

public interface IUserService {
	
	/**
	 * 
	 * Method : getUserList
	 * 작성자 : PC-12
	 * 변경이력 :
	 * @return
	 * Method 설명 : 전체사용자 리스트 조회
	 */
	List<User> getUserList();
	
	/**
	 * 
	 * Method : getUser
	 * 작성자 : PC-12
	 * 변경이력 :
	 * @param userId
	 * @return
	 * Method 설명 : 사용자 상세조회
	 */
	User getUser(String userId);
	/**
	 * 
	 * Method : getUserListOnlyHalf
	 * 작성자 : PC-12
	 * 변경이력 :
	 * @return
	 * Method 설명 : 사용자 반(50명)만 조회
	 */
	List<User> getUserListOnlyHalf();
}
