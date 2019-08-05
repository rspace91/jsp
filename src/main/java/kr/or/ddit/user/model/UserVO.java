package kr.or.ddit.user.model;

public class UserVO {
	
	private String userId;		// 사용자 아이디
	private String pass;		// 사용자 비밀번호
	private String userName;	// 사용자 이름

	public UserVO() { }
	
	public UserVO(String userName) {
		this.userName = userName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	@Override
	public String toString() {
		return "UserVO [userId=" + userId + ", pass=" + pass + ", userName=" + userName + "]";
	}

}
