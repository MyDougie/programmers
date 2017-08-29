package 가운데글자가져오기;

/**
 * 가운데 글자 가져오기 - 2017/08/29 - Park Taegyu
 * */
public class StringExercise {

	String getMiddle(String word) {
		int mid = word.length()/2;
		return (word.length()%2==0) ? word.substring(mid-1, mid+1) : word.substring(mid, mid+1);
	}

	public static void main(String[] args) {
		StringExercise se = new StringExercise();
		System.out.println(se.getMiddle("power"));
	}

}
