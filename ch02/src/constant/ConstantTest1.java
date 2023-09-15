package constant;

public class ConstantTest1 {

	public static void main(String[] args) {
		// 상수선언 및 사용
		//int maxNum = 100;
		final int MAX_NUM = 100;
		// MAX_NUM =1000; <=에러 상수는 변경할수 없음
		
		System.out.println(MAX_NUM);
		
		
		//원의 넓이 = 반지름  * 반지름 * 원주율(파이PI)
		//변수 - radius(반지름), circleArea(원의넓이)
		//상수 - PI
		int radius = 5;        //변수
		final double PI = 3.14;//상수
		double circleArea;   //결과값 ->선언만
		
		//PI = 3.15; =>에러 상수이므로 변경불가
		circleArea = radius * radius * PI;
		
		System.out.println("원의 넓이 : " + circleArea);

	}

}
