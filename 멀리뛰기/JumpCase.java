package 멀리뛰기;

/**
 * DP(멀리뛰기) - 2017/08/31 - Park Taegyu
 * */
class JumpCase {

    public int jumpCase(int num) {
      	int dp [] = new int[num+1];
      	dp[1] = 1;
      	dp[2] = 2;
      	for(int i=3; i<=num; i++){
         	dp[i] = dp[i-1] + dp[i-2]; 
        }

        return dp[num];
    }

    public static void main(String[] args) {
        JumpCase c = new JumpCase();
        int testCase = 4;
        //아래는 테스트로 출력해 보기 위한 코드입니다.
        System.out.println(c.jumpCase(testCase));
    }
}