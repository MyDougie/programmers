package 문자열내림차순으로배치하기;

/**
 * 문자열 내림차순으로 배치하기 - 2017/08/29 - Park Taegyu
 * */
import java.util.Arrays;

public class ReverseStr {
	public String reverseStr(String str){
		StringBuffer sb = new StringBuffer();
    
    char chArr [] = str.toCharArray();
    Arrays.sort(chArr);
    
    for(int i=chArr.length-1; i>=0; i--){
     sb.append(chArr[i]); 
    }
    
		return sb.toString();
	}

	// 아래는 테스트로 출력해 보기 위한 코드입니다.
	public static void main(String[] args) {
		ReverseStr rs = new ReverseStr();
		System.out.println( rs.reverseStr("Zbcdefg") );
	}
}