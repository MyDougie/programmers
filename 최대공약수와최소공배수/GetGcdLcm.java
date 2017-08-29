package 최대공약수와최소공배수;
/**
 * 최대공약수와 최소공배수 - 2017/08/29 - Park Taegyu
 * */
import java.util.Arrays;

public class GetGcdLcm {

	public int[] gcdlcm(int a, int b) {
		int[] answer = new int[2];

		answer[0] = gcd(a, b);
		answer[1] = a * b / answer[0];

		return answer;
	}

	public static int gcd(int a, int b) {
		if (b == 0) {
			return a;
		} else {
			return gcd(b, a % b);
		}

	}

	// 아래는 테스트로 출력해 보기 위한 코드입니다.
	public static void main(String[] args) {
		GetGcdLcm ex = new GetGcdLcm();
		System.out.println(Arrays.toString(ex.gcdlcm(3, 12)));
	}

}
