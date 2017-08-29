package 삼각형출력하기;

/**
 * 삼각형 출력하기 - 2017/08/29 - Park Taegyu
 * */
public class PrintTriangle {
	public String printTriangle(int num){
		StringBuffer sb = new StringBuffer();
    StringBuffer stars = new StringBuffer("*");
    
    for(int i=0; i<num; i++){
      sb.append(stars+"\n");
       stars.append("*");
    }
    
		return sb.toString();		
	}

	// 아래는 테스트로 출력해 보기 위한 코드입니다.
	public static void main(String[] args) {
		PrintTriangle pt = new PrintTriangle();
		System.out.println( pt.printTriangle(3) );
	}
}