package kr.or.ddit.util;

public class CookieUtil {
   /**
    * 
    * Method : getCookie
    * 작성자 : PC-23
    * 변경이력 :
    * @param cookieString
    * @param string
    * @return
    * Method 설명 : 쿠키 문자열로부터 특정 쿠키의 값을 반환한다.
    * 
    */
   public static String getCookie(String cookieString, String cookieId) {
      
         String cookieValue = null;
         int count = 0;
         
         for (int j = 0; j < cookieString.length(); j++) {
               if (String.valueOf(cookieString.charAt(j)).equals("=")) {
                   count++;
               }
           }

         for(int i = 0; i < count; i++) {
            
            if(cookieId.equals(cookieString.split("; ")[i].split("=")[0])) {
               cookieValue = cookieString.split("; ")[i];
               break;
            }
         }
           
         return cookieValue.split("=")[1];
      }

}