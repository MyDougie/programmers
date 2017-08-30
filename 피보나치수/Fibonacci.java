package 피보나치수;

/**
 * 피보나치 수 - 2017/08/30 - Park Taegyu
 * */
class Fibonacci {
	public long fibonacci(int num) {
    long dp [] = new long[num+1];
    dp[1] = 1;
    for(int i=2; i<=num; i++){
     	dp[i] = dp[i-1] + dp[i-2]; 
    }
    
		return dp[num];
	}

  // 아래는 테스트로 출력해 보기 위한 코드입니다.
	public static void main(String[] args) {
		Fibonacci c = new Fibonacci();
		int testCase = 3;
		System.out.println(c.fibonacci(testCase));
	}
}

