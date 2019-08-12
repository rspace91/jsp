package kr.or.ddit.user.model;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class User {
	private static final Logger logger = LoggerFactory.getLogger(User.class);
	private String userNm;  //사용자 이름
	private String userId;
	private String pass;	//사용자비밀번호
	private String alias;	//별명
	private Date reg_dt;	//등록일	
	
	public User() {
		
	}
	
	

	
	
	public String getAlias() {
		return alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}

	public Date getReg_dt() {
		return reg_dt;
	}
	
	public String getReg_dt_fmt() {
		logger.debug("getReg_dt_fmt method call");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		return sdf.format(reg_dt);
	}

	public void setReg_dt(Date reg_dt) {
		this.reg_dt = reg_dt;
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
