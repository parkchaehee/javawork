package arrays;

public class ArrayTest1 {

	public static void main(String[] args) {
		// 변수 ==비효율적
		String car1 = "Sonata1";
		String car2 = "Sonata2";
		String car3 = "Sonata3";
		
		System.out.println(car1);
		System.out.println(car2);
		System.out.println(car3);
		System.out.println("============================");
		
		//배열 - 순서가 있음, 중복 가능
		//직접 저장 - 중괄호{}사용
		String[] cars = {"Sonata1", "Sonata2", "Sonata3", "Sonata3"};
		//String[] cars = new String[]<=생략{"Sonata1", "Sonata2", "Sonata3", "Sonata3"};
		System.out.println(cars[0]);
		System.out.println(cars[1]);
		System.out.println(cars[2]);
		System.out.println(cars[3]);
		System.out.println("============================");
		
		
		//배열의 크기(개수) - 배열이름.ㅣ둫소
		System.out.println("배열의 크기 : " + cars.length);
		
		//for문 - 전체 조회
		for(int i = 0; i < cars.length; i++) {
			System.out.println(cars[i]);
		}
	}

}
