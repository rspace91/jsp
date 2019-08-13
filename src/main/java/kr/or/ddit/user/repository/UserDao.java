package kr.or.ddit.user.repository;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import kr.or.ddit.user.model.User;
import kr.or.ddit.util.MybatisUtil;

public class UserDao implements IUserDao{


	@Override
	public List<User> getUserList() {
		
		// db에서 조회가 되었다고 가정하고 가짜 객체를 리턴
//		List<UserVO> userList = new ArrayList<UserVO>();
//		userList.add(new UserVO("brown"));
//		userList.add(new UserVO("cony"));
//		userList.add(new UserVO("sally"));
		SqlSession sqlSession = MybatisUtil.getSession();
		List<User> userList  = sqlSession.selectList("user.getUserList");
		sqlSession.close();
		
		
		return userList;
	}
	
	@Override
	public User getUser(String userId) {
		SqlSession sqlSession = MybatisUtil.getSession();
		User userVo = sqlSession.selectOne("user.getUser", userId);
		sqlSession.close();
		return userVo;
	}
	
	@Override
	public List<User> getUserListOnlyHalf() {
		SqlSession sqlSession = MybatisUtil.getSession();
		List<User> userHalfList  = sqlSession.selectList("user.getUserListOnlyHalf");
		sqlSession.close();
		
		return userHalfList;
	}

}
