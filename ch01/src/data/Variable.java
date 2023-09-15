package data;

public class Variable {

	public static void main(String[] args) {
		// 변수 사용
		//변수 선언 방법 - <자료형, 변수이름>
		int year;  //정수 자료형 변수 year를 선언함
		year = 2023;//변수 year에 2023을 대입
		System.out.println(year+ "년");//숫자와 문자 연결
		
		int month = 9;//변수의 초기화(선언과 동시에 값 대입)
		System.out.println(month + "월");
		
		int day =5;
		System.out.println(day + "일");
		
		//손흥민은 3학년 2반입니다.
		//변수 - 이름(변수이름:name), 학년(grade), 반(schoolClass)
		//문자열 자료형 - String, 한 문자 자료형 - char
		
		/*변수 이름 명명시 문법 오류 주의점
		1.예약어(이미정해진명령어)는 사용할수없음
		2.변수이름에 공백(문자) 사용불가
		3.숫자로 시작불가
		 */
		
		String name = "손흥민";
		int grade = 3;
		int schoolClass = 2; 

		
		System.out.println(name+"은 "+grade+"학년 "+
				schoolClass+"반 입니다.");
		
		

	}

}
