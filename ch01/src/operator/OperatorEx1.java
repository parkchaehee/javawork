package operator;

public class OperatorEx1 {

	public static void main(String[] args) {
		// 산술 연산자(상수) -,+,*,/,%(나머지)
		// 계산의 기본은 정수형
		// 자바의 기본형 - int, double
		System.out.println(4+8); //12
		System.out.println(4-8); //-4
		System.out.println(4*8); //32
		System.out.println(4/(double)8); //0.5, 형변환(type conversion)
		
		//나머지 연산자
		System.out.println(4%8); //4
		System.out.println(5%2); //1 =5나누기2 나머지 값
		//홀수, 짝수 판별
		System.out.println(4%2);//0
		
		System.out.println("=============");
		//산술 연산자(변수 사용)
		int a =4;
		int b =8;
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println((double)a/b);
		
		System.out.println("=============");
		
		//점수의 합계, 평균
		int korScore = 95, mathScore=80;
		
		int sumScore;//합계변수 선언
		double avgScore; //평균 총점/과목수
		
		sumScore = korScore+mathScore;//합계 계산
		avgScore = (double)sumScore/2;
		
		System.out.println("총점: "+sumScore);
		System.out.println("평균: "+avgScore);
		

	}

}
