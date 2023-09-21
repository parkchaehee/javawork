package abstracts.template;

public class CarTest {

	public static void main(String[] args) {
		//추상클래스는 객체생성안됨
		//Car Car = new Car();
		//추상클래스 타입으로 객체생성
		//부모클래스 이름짓 = new abstract없는클래스이름
		Car hisCar = new ManualCar();
		hisCar.run();
		
		System.out.println("=================");
		
		Car myCar = new AICar();
		myCar.run();
		
		/*final 클래스 테스트
		String msg = "좋은 하루 되세요!";
		System.out.println(msg);
		
		Integer num = 100;
		System.out.println(num);*/
	}

}
