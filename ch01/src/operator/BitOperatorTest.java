package operator;

public class BitOperatorTest {

	public static void main(String[] args) {
		//비트 논리 연산자
		int num1 = 5;  // 00000101
		int num2 = 10; // 00001010
		               // 00000000  - &
		               // 00001111  - |
		int result;
		result = num1 & num2;//두개모두 1일때 1이고, 나머지는 0
		System.out.println(result);//0
		
		result = num1 | num2; //둘중 1개만 1이여도 1
		System.out.println(result);//15
		
		//비트 이동 연산자
		//  a<<2 - 변수 a를 2비트만큼 왼쪽으로 이동
		//  a>>2 - 변수 a를 2비트만큼 오른쪽으로 이동
		int a = 10; //00001010
		System.out.println("a왼쪽이동= " + (a << 2));//00101000 -> 40
		System.out.println("a오른쪽이동= " + (a >> 2));//00000010 -> 2
		
	}

}
