package kr.or.ddit.filter.model;

public class RequestVO {
	private String uri;
	private String method;
	
	public RequestVO() {
		String str = "test";
		
		//동일성(같은객체냐)
		if("test"==str) {
			
		}
		//동치성(같은 값을 같냐)
		if("test".equals("test")) {
			
		}
	}
	
	public  RequestVO (String uri, String method) {
		this.uri=uri;
		this.method=method;
	}
	
	public String getUri() {
		return uri;
	}
	public void setUri(String uri) {
		this.uri = uri;
	}
	public String getMethod() {
		return method;
	}
	public void setMethod(String method) {
		this.method = method;
	}
	@Override
	public String toString() {
		return "RequestVO [uri=" + uri + ", method=" + method + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((method == null) ? 0 : method.hashCode());
		result = prime * result + ((uri == null) ? 0 : uri.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RequestVO other = (RequestVO) obj;
		if (method == null) {
			if (other.method != null)
				return false;
		} else if (!method.equals(other.method))
			return false;
		if (uri == null) {
			if (other.uri != null)
				return false;
		} else if (!uri.equals(other.uri))
			return false;
		return true;
	}

	
	
	
	
}
