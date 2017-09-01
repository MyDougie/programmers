package 가장큰정사각형찾기;

/**
 * 가장 큰 정사각형 찾기 - 2017/09/01 - Park Taegyu
 * */
public class FindLargestSquare {
	
	  public int getMaxSquare(char [][]board, int x, int y){
	      int len = 1;
	    
	      while(true){
	        for(int i=x; i<x+len; i++){
	          for(int j=y; j<y+len; j++){
	            if(i>=board.length || j>=board[0].length || board[i][j]=='X'){
	              return (len-1) * (len-1); 
	            }
	          }
	        }
	       	len++; 
	      }
	     
	    }
	  
	  
	    public int findLargestSquare(char [][]board)
	    {
	  
	      int max = 0;
	      	for(int i=0; i<board.length; i++){
	          for(int j=0; j<board[i].length; j++){
	         		if(board[i][j] == 'O'){
	             	max = Math.max(max, getMaxSquare(board,i,j));
	            }
	          }
	        } 

	        return max;
	    }
	    public static void main(String[] args)
	    {
	    	FindLargestSquare test = new FindLargestSquare();
					char [][]board ={
					{'X','O','O','O','X'},
					{'X','O','O','O','O'},
					{'X','X','O','O','O'},
					{'X','X','O','O','O'},
					{'X','X','X','X','X'}};

	        System.out.println(test.findLargestSquare(board));
	    }
	}
