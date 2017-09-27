package NQueen;

/**
 * 백트래킹(N-Queen) - 2017/09/28 - Park Taegyu 
 * */

public class NQueen {

	int answer = 0;
	int[] cols;

	public int nQueen(int n) {
		cols = new int[n];
		for (int i = 0; i < cols.length; i++) {
			cols[i] = -1;
		}

		backTracking(0, n);

		return answer;
	}

	void backTracking(int row, int n) {
		if (row == n) {
			answer++;
			return;
		} else {
			for (int col = 0; col < n; col++) {
				if (isPossible(row, col)) {
					cols[row] = col;
					backTracking(row + 1, n);
					cols[row] = -1;
				}
			}

		}
	}

	boolean isPossible(int targetRow, int targetCol) {
		for (int row = 0; row < cols.length; row++) {
			if (cols[row] == targetCol || targetRow - row == Math.abs(targetCol - cols[row])) {
				return false;
			}
		}
		return true;
	}

	// 아래는 테스트로 출력해 보기 위한 코드입니다.
	public static void main(String[] args) {
		NQueen nq = new NQueen();
		System.out.println(nq.nQueen(7));
	}
}
