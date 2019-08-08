package kr.or.ddit.user.model;

public class User {
	private String userNm;  //사용자 이름
	private String userId;
	private String pass;

	public User() {	
	}
	
	public User(String userNm) {
		this.userNm = userNm;
	}

	public String getUserNm() {
		return userNm;
	}

	public void setUserNm(String userNm) {
		this.userNm = userNm;
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
		return "UserVO [userNm=" + userNm + ", userId=" + userId + ", pass=" + pass + "]";
	}

	public boolean checkLoginValidate(String userId, String pass) {
		  if(userId.equals(this.userId)&& pass.equals(this.pass))
			  return true;
		  return false;
		  
	}

}
