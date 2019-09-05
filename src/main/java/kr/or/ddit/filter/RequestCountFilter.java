package kr.or.ddit.filter;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/*
 * filter를 만드는방법
 * 0. 서블릿 작성, 등록방법과 매우 유사
   1. Filter 인터페이스를 구현한다
   2. url-mapping : 모든 요청에 대해 filter 일률적으로 적용되지 않음.
   				    서블릿과 마찬가지로개발자가 설정한 url pattern에 매칭되는 경우만 filter가 적용
*/
public class RequestCountFilter implements Filter{
	
	private static final Logger logger = LoggerFactory.getLogger(RequestCountFilter.class);
	
	private Map<String, Integer> requestCountMap = new HashMap<String, Integer>();
	private Map<RequestVO, Integer>requestMethodCountMap = new HashMap<RequestVO, Integer>();
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		//application scope 객체
		ServletContext sc = filterConfig.getServletContext();
//		sc.setAttribute("requestCountMap",requestCountMap);
		sc.setAttribute("requestMethodCountMap", requestMethodCountMap);
		
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		logger.debug("requestCountFilter.doFilter");
		//
		
		//다음 필터에 요청 위임, 만약 더이상 필터가 존재하지 않으면
		//클라이언트가 보낸 요청을 처리하는 servlet, jsp...으로 요청을 보낸다
		
		// localhost:8081/login
		// --> web.xml 설정에 따라
		// requestCountFilter.doFilter 실행
		// 1. 전처리 부분 실행
		// 2. chain.doFilter를 통해 
		// 3. loginController.doGet()
		// 4. 응답 생성
		// 5. 후처리 부분 실행 
		
		//전처리 부분
		logger.debug("before doFilter");
		
		//사용자가 보낸 url의 통계 자료를 작성
		// login : 5
		// /login.jsp : 10
		
		//uri
		HttpServletRequest httpRequest = (HttpServletRequest) request;
		String uri = httpRequest.getRequestURI();
		String method = httpRequest.getMethod();
		
		//현재까지 해당 uri로 요청온 횟수를 구한다
//		int uriCount = requestCountMap.getOrDefault(uri, 0);
		int uriCount = requestCountMap.getOrDefault(uri, 0);
		int methodCount = requestMethodCountMap.getOrDefault(uri, 0);
		
		//현재 요청이 왔으므로 한건 증가
		uriCount++;
		methodCount++;
		
		//맵 객체에 데이터를 갱신
		requestCountMap.put(uri, uriCount);
		
		RequestVO requestVo = new RequestVO();
		requestVo.setMethod(method);
		requestVo.setUri(uri);
		
		requestMethodCountMap.put(requestVo , methodCount);
		
		chain.doFilter(request, response);
		
		//후처리 부분
		
		logger.debug("after doFilter");
	}

	@Override
	public void destroy() {
		
	}

}
