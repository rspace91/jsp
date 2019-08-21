package kr.or.ddit.user.repository;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import kr.or.ddit.common.model.Page;
import kr.or.ddit.user.model.User;
import kr.or.ddit.util.MybatisUtil;

public class UserDao implements IUserDao{

	//전체사용자 리스트 조회
	@Override
	public List<User> getUserList(SqlSession sqlSession) {
		
		// db에서 조회가 되었다고 가정하고 가짜 객체를 리턴
//		List<UserVO> userList = new ArrayList<UserVO>();
//		userList.add(new UserVO("brown"));
//		userList.add(new UserVO("cony"));
//		userList.add(new UserVO("sally"));
		return sqlSession.selectList("user.getUserList");
	}
	
	//사용자 상세조회
	@Override
	public User getUser(SqlSession sqlSession,String userId) {
		return sqlSession.selectOne("user.getUser", userId);
	}
	
	//사용자 반(50명)만 조회
	@Override
	public List<User> getUserListOnlyHalf(SqlSession sqlSession) {
		
		return sqlSession.selectList("user.getUserListOnlyHalf");
	}
	
	//사용자 페이징 리스트 조회
	@Override
	public List<User> getUserPagingList(SqlSession sqlSession, Page page) {
		
		return sqlSession.selectList("user.getUserPagingList",page);
	}
	/**
	 * Method : getUserTotalCnt
	 * 작성자 : PC-12
	 * 변경이력 :
	 * @param sqlSession
	 * @return
	 * Method 설명 :전체 사용자 건수 조회
	 */
	@Override
	public int getUserTotalCnt(SqlSession sqlSession) {
		return sqlSession.selectOne("user.getUserTotalCnt");
	}

}
