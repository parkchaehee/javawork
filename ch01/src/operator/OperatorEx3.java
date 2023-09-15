package operator;

public class OperatorEx3 {

	public static void main(String[] args) {
		// 조건 연산자 -> 조건문(if문)
		// 결과값 = (조건비교) ? 참값:거짓값
		
		//예제1. 결과값이 정수면 정수변수(int)선언
		int num = (4>5)?10:20;//false이므로 20을 반환
		System.out.println("결과값: "+ num);
		int num2 = (4<5)?10:20;//true이므로 10을 반환
		System.out.println("결과값: "+ num2);
		
		//예제2. 결과값이 한 문자로 출력 T/F
		int fatherAge = 45;
		int motherAge = 48;
		
		char result = (fatherAge > motherAge) ? 'T':'F';
		System.out.println(result); //F
		
		//예제3. 짝수/홀수를 판정하는 프로그램(산술,비교,조건연산자 예제)
		//조건연산자 - 어떤수를 2로 나눠서 나머지가 0이면 짝수, 1이면 홀수
		//결과값이 "짝수입니다" 또는 "홀수입니다"
		int number = 10;
		
		String str = number % 2 == 0 ? "짝수입니다." : "홀수입니다.";
		System.out.println("판정: "+str);
		


	}

}
