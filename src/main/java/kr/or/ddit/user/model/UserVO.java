package kr.or.ddit.user.model;

public class UserVO {
	private String userNm;  //사용자 이름
	private String userId;
	private String pass;

	public UserVO() {	
	}
	
	public UserVO(String userNm) {
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

	

}
