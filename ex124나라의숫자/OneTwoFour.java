package ex124나라의숫자;
/**
 * 124나라의 숫자 - 2017/09/27 - Park Taegyu
 * */
class OneTwoFour {
	
	public String change124(int n) {

		String answer = "";
		while (n > 0) {
			int rem = n % 3;

			if (rem == 0) {
				n = n / 3 - 1;
				answer = '4' + answer;
			} else {
				n = n / 3;
				answer = rem + answer;
			}
		}

		return answer;

	}

	// 아래는 테스트로 출력해 보기 위한 코드입니다.
	public static void main(String[] args) {
		OneTwoFour oneTwoFour = new OneTwoFour();
		System.out.println(oneTwoFour.change124(10));
	}
}
