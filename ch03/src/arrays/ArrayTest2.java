package arrays;

public class ArrayTest2 {

	public static void main(String[] args) {
		// 배열의 선언 및 사용
		// 크기가 4인 cars 배열 선언
		// 값이 비어있으면 null을 출력
		String[] cars = new String[4];
		
		// 입력(저장)
		cars[0] ="Sonata0";
		cars[1] ="Sonata1";
		cars[2] ="Sonata2";
		cars[3] ="Sonata2";
		
		
		// 특정한 위치(1번 인덱스) 접근
		System.out.println(cars[1]);
		
		
		// 전체 출력
		System.out.println(cars.length);
		for(int i = 0; i < cars.length; i++) {
			System.out.println(cars[i]);
		}
		
				

	}

}
