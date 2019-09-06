package kr.or.ddit.util;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileuploadUtil {

	/**
	 * 
	 * Method : getFilename
	 * 작성자 : PC-12
	 * 변경이력 :
	 * @param contentDisPosition
	 * @return
	 * Method 설명 : Content-disposition 헤더 문자열로부터 파일이름 추출
	 */
	public static String getFilename(String contentDisPosition) {
		
		String[] attrs = contentDisPosition.split(";");
		
		String filename = "";
		for(String attr : attrs) {
			if(attr.startsWith("filename")) {
				String[] keyValue = attr.split("=");
				filename =keyValue[1].substring(keyValue[1].indexOf("\"") + 1, keyValue[1].lastIndexOf("\""));
				break;
			}
		}
		
		return filename;
	}
	/**
	 * 
	 * Method : getFileExtension
	 * 작성자 : PC-12
	 * 변경이력 :
	 * @param contentDisposition
	 * @return
	 * Method 설명 : contentDisposition 헤더 문자열로부터 파일 확장자 추출
	 */
	public static String getFileExtension(String contentDisposition) {
		String[] attrs = contentDisposition.split(";");
		
		//메소드 인자 : "form-date; name=\file\"; filename=\''brown.png"\"";
		String filename = getFilename(contentDisposition);
		
			if(filename.lastIndexOf(".") >0) {
				return filename.substring(filename.lastIndexOf(".")+1, filename.length());
			}
			return "";
	}
	
	public static String getPath() {
		String basicPath = "e:\\upload";
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMM");
		String yyyyMM = sdf.format(new Date());
		String yyyy = yyyyMM.substring(0,4);
		String mm = yyyyMM.substring(4,6);
		
		File yyyyDirectory = new File(basicPath + "\\" + yyyy + "\\" + mm);
		if(!yyyyDirectory.exists()) {
			yyyyDirectory.mkdirs();
		}
		return basicPath + "\\" + yyyy + "\\" + mm + "\\";
	}
}
