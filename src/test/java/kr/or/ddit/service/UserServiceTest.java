package kr.or.ddit.service;

import static org.junit.Assert.*;

import java.util.List;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

import kr.or.ddit.common.model.Page;
import kr.or.ddit.user.model.User;
import kr.or.ddit.user.service.IUserService;
import kr.or.ddit.user.service.UserService;

public class UserServiceTest {
	
	public IUserService userService;

	@Before
	public void setup() {
		userService = new UserService();
	}

	/**
	 * 
	 * Method : getUserListTest
	 * 작성자 : PC-12
	 * 변경이력 :
	 * Method 설명 : getUserList 테스트
	 */
	@Test
	public void getUserListTest() {
		/***Given***/
		

		/***When***/
		List<User> userList = userService.getUserList();
		
		/***Then***/
		assertEquals(105, userList.size());
	}
	/**
	 * 
	 * Method : getUserTest
	 * 작성자 : PC-12
	 * 변경이력 :
	 * Method 설명 : 사용자 정보 조회 테스트
	 */
	@Test
	public void getUserTest() {
		/***Given***/
		String userId = "brown";

		/***When***/
		User userVo = userService.getUser(userId);

		/***Then***/
		assertEquals("브라운",userVo.getUserNm());
		assertEquals("brown1234",userVo.getPass());
	}
	/**
	 * 
	 * Method : getUserListOnlyHalf
	 * 작성자 : PC-12
	 * 변경이력 :
	 * Method 설명 : 사용자 반만 조회 테스트
	 */
	@Test
	public void getUserListOnlyHalf() {
		/***Given***/

		/***When***/
		List<User> userList = userService.getUserListOnlyHalf();
		
		/***Then***/
		assertEquals(50, userList.size());
	}
	
	/**
	 * 
	 * Method : getUserPagingList
	 * 작성자 : PC-12
	 * 변경이력 :
	 * Method 설명 : 사용자 페이징 리스트 조회 테스트
	 */
	@Test
	public void getUserPagingList() {
		/***Given***/
		Page page = new Page();
		page.setPage(3);
		page.setPagesize(10);

		/***When***/
		Map<String, Object> resultMap = userService.getUserPagingList(page);
		List<User> userList = (List<User>)resultMap.get("userList");
		int paginationSize = (Integer)resultMap.get("paginationSize");
		
		/***Then***/
		assertEquals(10, userList.size());
		assertEquals("xuserid22", userList.get(0).getUserId());
		assertEquals(11, paginationSize );
		
	}
	
	@Test
	public void ceilingTest() {
		/***Given***/
		int toatalCnt = 105;
		int pagesize = 10;

		/***When***/
		double paginationSize = Math.ceil((double)toatalCnt / pagesize);
		/***Then***/
		assertEquals(11, (int)paginationSize);
	}
	

}
