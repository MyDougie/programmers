package 다음큰숫자;

/**
 * 다음 큰 숫자 - 2017/08/30 - Park Taegyu
 * */
public class NextBigNumber {
	public String makeBinary(int n){
      String strNum = "";
      while(n>0){
        strNum = n%2 + strNum;
        n /=2;
      }
      return strNum;
    }
  
  	public int countOne(String str){
      int cnt = 0;
      for(int i=0; i<str.length(); i++){
       	if(str.charAt(i)=='1'){
         cnt++; 
        }
      }
      return cnt;
    }
  
    public int nextBigNumber(int n)
    {
      int cnt = countOne(makeBinary(n));
      while(cnt != countOne(makeBinary(++n)));
	
      return n;
    }
    public static void main(String[] args)
    {
    	NextBigNumber test = new NextBigNumber();
        int n = 78;
        System.out.println(test.nextBigNumber(n));
    }
}