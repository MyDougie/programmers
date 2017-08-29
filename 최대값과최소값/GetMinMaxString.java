package 최대값과최소값;

/**
 * 최대값과 최소값 - 2017/08/29 - Park Taegyu
 * */

public class GetMinMaxString {
    public String getMinMaxString(String str) {
      String strArr [] = str.split(" ");
      int min,max,n;
      min = max = Integer.parseInt(strArr[0]);
      for(int i=0; i<strArr.length; i++){
      	n = Integer.parseInt(strArr[i]); 
        min = Math.min(min, n);
        max = Math.max(max, n);
      }
      
      
        return min + " " + max;
    }

    public static void main(String[] args) {
        String str = "1 2 3 4";
        GetMinMaxString minMax = new GetMinMaxString();
        System.out.println("최대값과 최소값은?" + minMax.getMinMaxString(str));
    }
}