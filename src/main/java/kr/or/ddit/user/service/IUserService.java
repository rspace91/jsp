package kr.or.ddit.user.service;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import kr.or.ddit.common.model.Page;
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

	/**
	 * 
	 * Method : getUserPagingList
	 * 작성자 : PC-12
	 * 변경이력 :
	 * @param page
	 * @return
	 * Method 설명 : 사용자 페이징 리스트 조회 테스트
	 */
	Map<String, Object> getUserPagingList(Page page);
	

	/**
	 * Method : getUserTotalCnt
	 * 작성자 : PC-12
	 * 변경이력 :
	 * @param sqlSession
	 * @return
	 * Method 설명 :전체 사용자 건수 조회
	 */
	int getUserTotalCnt();
	
	/**
	 * Method : insertUser
	 * 작성자 : PC-12
	 * 변경이력 :
	 * @param sqlSession
	 * @param user
	 * @return
	 * Method 설명 : 사용자 등록 
	 */
	int insertUser( User user);
	
	/**
	 * Method : deleteUser
	 * 작성자 : PC-12
	 * 변경이력 :
	 * @param sqlSession
	 * @param userId
	 * @return
	 * Method 설명 : 사용자 삭제
	 */
	int deleteUser( String userId);
	
	
	/**
	 *
	 * Method : updateUser
	 * 작성자 : PC-12
	 * 변경이력 :
	 * @param user
	 * @return
	 * Method 설명 : 사용자 수정
	 */
	int updateUser(User user);
	
	
}
