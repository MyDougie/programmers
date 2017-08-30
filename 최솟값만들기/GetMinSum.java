package 최솟값만들기;

/**
 * 최솟값만들기 - 2017/08/30 - Park Taegyu
 * */
import java.util.Arrays;

public class GetMinSum {

	public int getMinSum(int[] A, int[] B) {

		Arrays.sort(A);
		Arrays.sort(B);
		int ans = 0;
		for (int i = 0; i < A.length; i++) {
			ans += A[i] * B[B.length - 1 - i];
		}

		return ans;
	}

	public static void main(String[] args) {
		GetMinSum test = new GetMinSum();
		int[] A = { 1, 2 };
		int[] B = { 3, 4 };
		System.out.println(test.getMinSum(A, B));
	}

}
