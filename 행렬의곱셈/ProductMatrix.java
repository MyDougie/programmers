package 행렬의곱셈;

/**
 * 행렬의 곱셈 - 2017/08/30 - Park Taegyu
 * */
class ProductMatrix {
	public int[][] productMatrix(int[][] A, int[][] B) {// 4,1 * 1,5
        int[][] answer = new int[A.length][B[0].length];

        for(int i=0; i<A.length; i++){
            for(int j=0; j<B[i].length; j++){
                for(int k=0; k<A[i].length; k++){
                    answer[i][j] += A[i][k]*B[k][j];
                }
            }   
        } 
        return answer;
    }

	public static void main(String[] args) {
		ProductMatrix c = new ProductMatrix();
		int[][] a = { { 1, 2 }, { 2, 3 } };
        int[][] b = { { 3, 4 }, { 5, 6 } };
      // 아래는 테스트로 출력해 보기 위한 코드입니다.
      int ans [][] = c.productMatrix(a, b);
      for(int i=0; i<ans.length; i++) {
    	  for(int j=0; j<ans[i].length; j++) {
    		  System.out.print(ans[i][j]+" ");
    	  }
    	  System.out.println();
      }
      
	}
}