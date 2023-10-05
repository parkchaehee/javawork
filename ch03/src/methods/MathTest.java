package methods;

public class MathTest {

	public static void main(String[] args) {
		// 내장 함수 - 수학(Math)
		int v1 = Math.abs(-10); //절대값(거리): 양수->음수, 음수->양수
		System.out.println("v1 = " + v1);
		
		long v2 = Math.round(5.67); //6 : 반올림해서 정수로 반환
		System.out.println("v2 = " + v2);
		
		double v3 = Math.floor(3.31); //3.0
		System.out.println("v3 = " + v3);
		
		//random() - 무작위  0.0 <= 범위 < 1.0
		double rand = Math.random();
		System.out.println("rand = " + rand);
		
		//dice - 주사위(1 ~ 6)
		int dice = (int)(Math.random()*6) + 1;  //0.9*6 - 5(반올림)
		System.out.println(dice);
		
		//1~10까지 자연수 무작위 출력
		int number = (int)(Math.random()*10) + 1;
		System.out.println(number);
	}

}
