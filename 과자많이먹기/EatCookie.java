package 과자많이먹기;

/**
 * DFS(과자많이먹기) - 2017/09/27 - Park Taegyu
 * */
class EatCookie
{
  int max=0;
	public int eatCookie(int []cookies){
		
    for(int i=0; i<cookies.length; i++){
     	dfs(cookies[i]+"", cookies, i); 
    }
    
		return max;
	}
  
  void dfs(String str, int[] cookies, int index){
   
    String s [] = str.split(" ");
		max = Math.max(max, s.length);
    
    for(int i=index+1; i<cookies.length; i++){
     	 if(Integer.parseInt(s[s.length-1]) < cookies[i]){
         dfs(str + " " + cookies[i], cookies, i);
       }
    }
    
  }
  

	// 아래는 테스트로 출력해 보기 위한 코드입니다.
	public static void main(String[] args) {
		EatCookie e = new EatCookie();
		int []cookies = {1, 4, 2, 6, 3, 4, 1, 5};
		System.out.println(e.eatCookie(cookies));
	}
}