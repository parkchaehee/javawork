package inheritance.airplan;

public class Main {

	public static void main(String[] args) {
		SuperSonicAirPlane sa = new SuperSonicAirPlane();
		
		sa.이륙하다();
		sa.비행하다();
		
		//모드변경 - 상수는 클래스 이름으로 직접접근 - static
		sa.flyMode = SuperSonicAirPlane.SUPERSONIC; //모드 변경
		sa.비행하다();
		
		sa.flyMode = SuperSonicAirPlane.NORMAL; //모드 변경
		sa.비행하다();
		sa.착륙하다(); //실행

	}

}
