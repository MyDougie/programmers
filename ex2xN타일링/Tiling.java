package ex2xN타일링;

/**
 * 2xN타일링 - 2017/09/01 - Park Taegyu
 * */
public class Tiling {
		public int tiling(int n) {
	    
	    int dp[] = new int[n+1];
	    dp[1] = 1;
	    dp[2] = 2;
	    for(int i=3; i<=n; i++){
	     dp[i] = (dp[i-1] + dp[i-2]) % 100000; 
	    }

			return dp[n];
		}

		public static void main(String args[]) {
			Tiling tryHelloWorld = new Tiling();
			// 아래는 테스트로 출력해 보기 위한 코드입니다.
			System.out.print(tryHelloWorld.tiling(78));
		}
	}