package methods;

public class ReturnMethodsTest {
	// return 이 있는 함수(반환자료형) - int, String
	// 호출한 곳으로 반환값을 보냄

	public static void main(String[] args) {
		int n1 =10, n2 = 20; //지역변수 - local 변수
		//더하기 함수 호출
		int result = add(10, 20);
		System.out.println("결과값: " + result);
		
		//제곱수 호출
		int result2 = square(n1);
		System.out.println("결과값2: " + result2);
		
		//메시지 호출
		String msg = message();
		System.out.println(msg);

	}
	
	//return이 있고, 매개변수 2개인 함수이름 - add()
	public static int add(int a, int b) {//파라미컬?? 변수
		return a + b;
	}
	
	//return이 있고, 매개변수 1개인 함수
	public static int square(int x) {//제곱수를 계산하는 함수
		return x * x;
	}
	
	//return이 있고, 매개변수 없는 함수
	public static String message() {
		return "행운을 빌어요!";
	}

}
