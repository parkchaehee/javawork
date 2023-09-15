package switchexample;

public class SwitchCaseTest3 {

	public static void main(String[] args) {
		// 사칙연산 - 산술기호
		// 변수 - num1, num2, operator(기호/연산자), result(결과값)
		// 2*3 = 6
		
		int num1 = 10;
		int num2 = 2;
		char operator = '-'; //값을 초기화
		int result = 0; // 0으로 초기화
		// String sts = ''; 가능
		
		// if else문
		if(operator == '+') {//중괄호가 브레이크
			result = num1 + num2;
		}else if(operator == '-') {
			result = num1 - num2;
		}else if(operator == '*') {
			result = num1 * num2;
		}else if(operator == '/') {
			result = num1 / num2;
		}else {
			System.out.println("지원되지 않는 기능입니다.");
			return; //즉시 종료
		}
		
		//switch case문
		switch(operator) { //변수
		case '+':
			result = num1 + num2;
			break;
		case '-':
			result = num1 - num2;
			break;
		case '*':
			result = num1 * num2;
			break;
		case '/':
			result = num1 / num2;
			break;
		default:
			System.out.println("지원되지 않는 기능입니다.");
			return; //즉시 종료
		}
		System.out.println("결과 값은 " + result + "입니다.");
		
	} //main끝

}   //class 끝
