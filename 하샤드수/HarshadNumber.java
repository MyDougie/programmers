package 하샤드수;

/**
 * 하샤드수 - 2017/08/30 - Park Taegyu
 * */
public class HarshadNumber{
	public boolean isHarshad(int num){
	
    int divisor = 0;
    int temp = num;
    while(temp>0){
     divisor += temp % 10; 
      temp /= 10;
    }

		return num%divisor==0;
	}
  
       // 아래는 테스트로 출력해 보기 위한 코드입니다.
	public static void  main(String[] args){
		HarshadNumber sn = new HarshadNumber();
		System.out.println(sn.isHarshad(12));
	}
}