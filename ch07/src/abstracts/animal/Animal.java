package abstracts.animal;

public abstract class Animal { //추상메서드는 abstract 붙이기
	
	//필드
	public String kind;  //종
	
	public void breathe() {
		System.out.println("동물이 숨을 쉽니다.");
	}
	//추상메서드는 abstract 붙이기(구현을 안함, 상속받는 클래스는 필수로 구현해야함)
	//예를 들명 cry()는 안되고, sound() 사용하도록 강제
	public abstract void sound();

}
