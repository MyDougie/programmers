package 소수찾기;

/**
 * 소수찾기 - 2017/08/30 - Park Taegyu
 * */
public class NumOfPrime {
	
	int numberOfPrime(int n) {
		int result = 0;

		for (int i = 2; i <= n; i++) {
			for (int j = 2; j <= i / 2 + 1; j++) {
				if (i / 2 + 1 == j) {
					result++;
				} else if (i % j == 0) {
					break;
				}
			}

		}

		return result;
	}

	public static void main(String[] args) {
		NumOfPrime prime = new NumOfPrime();
		System.out.println(prime.numberOfPrime(10));
	}

}