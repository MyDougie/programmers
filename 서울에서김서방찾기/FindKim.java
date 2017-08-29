package 서울에서김서방찾기;

/**
 * 서울에서 김서방 찾기 - 2017/08/29 - Park Taegyu
 * */
public class FindKim {
	public String findKim(String[] seoul){
		//x에 김서방의 위치를 저장하세요.
		int x = 0;
		while(x<seoul.length){
     if(seoul[x].equals("Kim")){
      	break;	 
     }else{
      	x++; 
     }
    }
		
		return "김서방은 "+ x + "에 있다";
	}
	
	// 실행을 위한 테스트코드입니다.
	public static void main(String[] args) {
		FindKim kim = new FindKim();
		String[] names = {"Queen", "Tod","Kim"};
		System.out.println(kim.findKim(names));
	}
}

