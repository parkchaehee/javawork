package inheritance.airplan;
//부모클래스
public class AirPlane {
	
	public AirPlane() {}//기본생성자 생략가능
	
	public void 이륙하다() {//takeOff
		System.out.println("비행기가 이륙합니다.");
	}
	
	public void 비행하다() {
		System.out.println("비행기가 일반 비행합니다.");
	}
	
	public void 착륙하다() {
		System.out.println("비행기가 착륙합니다.");
	}

}
