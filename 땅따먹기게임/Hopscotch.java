package 땅따먹기게임;

/**
 * 땅따먹기 게임 - 2017/09/01 - Park Taegyu
 * */
public class Hopscotch {
	    int hopscotch(int[][] board, int size) {
	        int result = 0;
	        int max = 0;
	      
	      	for(int i=0; i<board.length-1; i++){
	          int temp [] = new int[4];
	         	for(int j=0; j<4; j++){//i+1번째행에서 j를밟는게
	            max = 0;    
	        		for(int k=0; k<4; k++){//가장 max인 K를 찾아라 i행에서
	              if(j==k){
	               	continue; 
	              }
	              max = Math.max(max, board[i][k] + board[i+1][j]);
	            }
	            temp[j] = max;
	          }
	          board[i+1] = temp;
	          temp = null;
	        }
	      
	      for(int i=0; i<4; i++){
	       	result = Math.max(result, board[board.length-1][i]); 
	      }
	        return result;
	    }

	    public static void main(String[] args) {
	        Hopscotch c = new Hopscotch();
	        int[][] test = { { 1, 2, 3, 5 }, { 5, 6, 7, 8 }, { 4, 3, 2, 1 } };
	        //아래는 테스트로 출력해 보기 위한 코드입니다.
	        System.out.println(c.hopscotch(test, 3));
	    }

	}