package kr.or.ddit.user.repository;

import java.util.ArrayList;
import java.util.List;

import kr.or.ddit.user.model.UserVO;

public class UserDao implements IUserDao{

	/**
	 * Method : getUserList
	 * 작성자 : PC-11
	 * 변경이력 :
	 * @return
	 * Method 설명 :
	 */
	@Override
	public List<UserVO> getUserList() {
		
		// db에서 조회가 되었다고 가정하고 가짜 객체를 리턴
		List<UserVO> userList = new ArrayList<UserVO>();
		userList.add(new UserVO("brown"));
		userList.add(new UserVO("cony"));
		userList.add(new UserVO("sally"));
		
		return userList;
	}

	
}
