package stringmethod;

public class StringMethods2 {

	public static void main(String[] args) {
		// indexOf()검색에도움 -인덱스리턴/캐릭터-문자리턴
		// 문자열이 시작되는 인덱스를 리턴합니다
		String str = "Hello World Hello";
		
		int val = str.indexOf("Hello");//앞에서부터 찾음
		System.out.println(val);//0
		
		int val2 = str.lastIndexOf("Hello");//뒤에서부터 찾음
		System.out.println(val2);//12
		
		int val3 = str.lastIndexOf("ok");//찾는문자가 없으면 -1리턴
		System.out.println(val3);//-1
		
		//조건문 만들기
		String subject = "자바 프로그래밍";
		
		if(subject.indexOf("자바") != -1) {//or >=0 //자바가 검색이 된다면
			System.out.println("자바와 관련된 책이군요!");
		}else {//index == -1 이면
			System.out.println("자바와 관련이 없는 책이군요!");
		}
	}

}
