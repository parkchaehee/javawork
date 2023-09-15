package classes.methods;

public class Hello {//인사하는 함수가 들어있는 자료
	
	//생략되어있는 기본생성자
	//public Hello(){}
	
	//sayHello() 메서드 정의
	public void sayHello() {
		System.out.println("안녕~");
	}
	//메서드 오버로딩-함수(메서드)이름은 같고 매개변수가 다른것
	public void sayHello(String name) {
		System.out.println("안녕~" + name);
	}
	

}
