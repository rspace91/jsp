package kr.or.ddit.util;

import static org.junit.Assert.*;

import org.junit.Test;

public class CookieUtilTest {
	/**
	 * 
	 * Method : getCookieTest
	 * 작성자 : PC-12
	 * 변경이력 :
	 * Method 설명 :
	 */
	@Test
	public void getCookieTest() {
		/***Given***/
		String cookieString = "rememberMe=Y; userId=brown; test=testValue";
		String cookieString2 = "userId2=sally";
		/***When***/
		String cookieValue = CookieUtil.getCookie(cookieString, "userId");
		String rememberValue = CookieUtil.getCookie(cookieString, "rememberMe");
		String testValue = CookieUtil.getCookie(cookieString, "test");
		String cookieIdValue = CookieUtil.getCookie(cookieString2, "sally");

		/***Then***/
		assertEquals("brown", cookieValue);
		assertEquals("Y", rememberValue);
		assertEquals("testValue", testValue);
		assertEquals("sally", cookieIdValue);
	}

}
