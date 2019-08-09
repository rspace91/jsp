package kr.or.ddit.util;

public class CookieUtil {

   /**
    * 
    * Method : getCookie
    * 작성자 : PC-12
    * 변경이력 :
    * @param cookieString
    * @param string
    * @return
    * Method 설명 :쿠키 문자열로부터 특정 쿠키의 값을 반환한다.
    */
   public static String getCookie(String cookieString, String cookieId) {
       
      // 혜인
//      String cookieValue = null;
//      int count = 0;
//      
//      for (int j = 0; j < cookieString.length(); j++) {
//            if (String.valueOf(cookieString.charAt(j)).equals("=")) {
//                count++;
//            }
//        }
//
//      for(int i = 0; i < count; i++) {
//         
//         if(cookieId.equals(cookieString.split("; ")[i].split("=")[0])) {
//            cookieValue = cookieString.split("; ")[i];
//            break;
//         }
//      }
//        
//      return cookieValue.split("=")[1];
      
      // SEM
      
      // cookieString : "userId=brown; rememberMe=Y; test=testValue"
      // cookieId : userId
         
      String[] cookies = cookieString.split("; ");
         
      for(String cookie : cookies) {
         String[] cookiNmVal = cookie.split("=");
         
         if(cookiNmVal[0].equals(cookieId)) {
            return cookiNmVal[1];
         }
      }
      
      return null;
   }

}