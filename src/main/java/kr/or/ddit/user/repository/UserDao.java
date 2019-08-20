package kr.or.ddit.user.repository;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import kr.or.ddit.user.model.User;
import kr.or.ddit.util.MybatisUtil;

public class UserDao implements IUserDao{


	@Override
	public List<User> getUserList(SqlSession sqlSession) {
		
		// db에서 조회가 되었다고 가정하고 가짜 객체를 리턴
//		List<UserVO> userList = new ArrayList<UserVO>();
//		userList.add(new UserVO("brown"));
//		userList.add(new UserVO("cony"));
//		userList.add(new UserVO("sally"));
		return sqlSession.selectList("user.getUserList");
	}
	
	@Override
	public User getUser(SqlSession sqlSession,String userId) {
		return sqlSession.selectOne("user.getUser", userId);
	}
	
	@Override
	public List<User> getUserListOnlyHalf(SqlSession sqlSession) {
		
		return sqlSession.selectList("user.getUserListOnlyHalf");
	}

}
