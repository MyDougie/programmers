package 정수내림차순으로배치하기;

/**
 * 정수내림차순으로 배치하기 - 2017/08/30 - Park Taegyu
 * */
public class ReverseInt {
	public int reverseInt(int n){
		int arr[] = new int[10];
    int ans = 0;
    while(n>0){
      arr[n%10]++;
      n/=10;
    }
    
    for(int i=arr.length-1; i>=0; i--){
      while(arr[i] != 0){
    		ans = ans*10 + i;
        arr[i]--;
      }
    }
		return ans;
	}
  
	// 아래는 테스트로 출력해 보기 위한 코드입니다.
	public static void  main(String[] args){
		ReverseInt ri = new ReverseInt();
		System.out.println(ri.reverseInt(118372));
	}
}
