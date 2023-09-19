package generic;

import java.util.ArrayList;

public class GenericTest {

	public static void main(String[] args) {
		// Generic(일반화) 이전의 코드 작성
		ArrayList cartlist = new ArrayList();
		cartlist.add("egg");
		cartlist.add("coffee");
		//강제 형변환(다운캐스팅)필요
		String item = (String)cartlist.get(0);
		System.out.println(item);
		
		//Generic을 이용한 코드 작성-자바1.5버전 이후
		//제네릭 프로그래밍 = 어떤값이 하나의 자료형이 아닌 여러자료형을 사용할수있도록
		//프로그래밍 하는것을 말함
		ArrayList<String> list = new ArrayList<>();
		list.add("egg");
		list.add("coffee");
		String item2 = list.get(0);
		System.out.println(item2);

	}

}
