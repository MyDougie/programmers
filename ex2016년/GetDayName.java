package ex2016년;

/**
 * 2016년 - 2017/08/30 - Park Taegyu
 * */
public class GetDayName {

	static String dayName[] = { "SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT" };
	static int date[] = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public String getDayName(int a, int b) {
		int day = 5;// FRI
		for (int i = 0; i < a - 1; i++) {
			day += date[i];
		}
		day += b - 1;

		return dayName[day % 7];
	}

	public static void main(String[] args) {
		GetDayName test = new GetDayName();
		int a = 5, b = 24;
		System.out.println(test.getDayName(a, b));
	}

}
