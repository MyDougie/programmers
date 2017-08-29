package 스트링을숫자로바꾸기;

/**
 * 스트링을 숫자로 바꾸기 - 2017/08/29 - Park Taegyu
 * */
public class StrToInt {
    public int getStrToInt(String str) { 
      
      boolean isPlus = (str.charAt(0)=='-') ? false : true;
      int ans=0;
      int i = isPlus ? 0 : 1;
      for(; i<str.length(); i++){
        ans = 10*ans + str.charAt(i)-'0';
      }
      
        return isPlus ? ans : -1 * ans;
    }
    //아래는 테스트로 출력해 보기 위한 코드입니다.
    public static void main(String args[]) {
        StrToInt strToInt = new StrToInt();
        System.out.println(strToInt.getStrToInt("-1234"));
    }
}
