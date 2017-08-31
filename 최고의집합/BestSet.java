package 최고의집합;

/**
 * 최고의 집합 - 2017/08/31 - Park Taegyu
 * */
public class BestSet {

    public int[] bestSet(int n, int s){
      	if(n>s){
         	return new int[]{1}; 
        }
      
        int[] answer = new int[n];
      	int quo = s/n;
      	int rem = s%n;
      	for(int i=answer.length-1; i>=0; i--,rem--){
         	answer[i] = quo; 
          if(rem>0){
           	answer[i]++; 
          }
        }	
      
        return answer;
    }
    public static void main(String[] args) {
        BestSet c = new BestSet();
        //아래는 테스트로 출력해 보기 위한 코드입니다.
        System.out.println(Arrays.toString(c.bestSet(3,13)));
    }

}