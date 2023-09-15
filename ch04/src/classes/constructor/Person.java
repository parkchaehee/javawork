package classes.constructor;

//참조자료형 - Person 클래스 정의(int 기본자료형)
//생성자 오버로딩 - 이름이 같고 자료형이 다름
public class Person {
	String name;  //사람이름//선언만, 사용할때 대입
	float height; //키
	float weight; //몸무게
	
	//기본 생성자
	public Person() {}
	
	//매개변수가 있는 생성자
	public Person(String n) {//이름 매개변수
		name = n;
	}
	
	//매개변수가 있는 생성자(모든 필드)
	public Person(String n, float h, float w) {
		name = n;   //외부에서 입력된 이름값을 저장
		height = h; //외부에서 입력된 키값을 저장
		weight = w; //외부에서 입력된 몸무게값을 저장
	}
	
	//메서드
	public void showPersonInfo() {
		System.out.printf("이름: %s, 키: %.1f, 몸무게: %.1f\n", 
				name, height, weight);
	}
	
}