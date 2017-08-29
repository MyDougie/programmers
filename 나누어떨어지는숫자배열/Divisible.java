package 나누어떨어지는숫자배열;

/**
 * 나누어 떨어지는 숫자배열 - 2017/08/29 - Park Taegyu
 * */
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

class Divisible {
	public int[] divisible(int[] array, int divisor) {
		//ret에 array에 포함된 정수중, divisor로 나누어 떨어지는 숫자를 순서대로 넣으세요.
    List<Integer> list = new ArrayList<>();
    for(int num : array){
    	if(num % divisor == 0){
      	list.add(num); 
      }
    }
    
    int ret [] = new int[list.size()];
    for(int i=0; i<ret.length; i++){
    	ret[i] = list.get(i); 
    }
    
		return ret;
	}
	// 아래는 테스트로 출력해 보기 위한 코드입니다.
	public static void main(String[] args) {
		Divisible div = new Divisible();
		int[] array = {5, 9, 7, 10};
		System.out.println( Arrays.toString( div.divisible(array, 5) ));
	}
}