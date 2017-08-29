package 평균구하기;

/**
 * 평균구하기 - 2017/08/29 - Park Taegyu
 * */
public class GetMean {
    public int getMean(int[] array) {
      
      if(array==null || array.length==0){
        return 0;
      }
      
      int sum=0;
      for(int i=0; i<array.length; i++){
        sum += array[i];
      }
        return sum/array.length;
    }

    public static void main(String[] args) {
        int x[] = {5, 4, 3};
        GetMean getMean = new GetMean();
        System.out.println("평균값 : " + getMean.getMean(x));
    }
}