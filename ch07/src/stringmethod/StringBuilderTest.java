package stringmethod;

public class StringBuilderTest {
	
	public static void main(String[] args) {
		//StringBuilder, StringBuffer - 문자열 변경이 가능한 클래스(메모리 주소 변경되지않고 유지)
		String javaStr = new String("java");
		StringBuilder buffer = new StringBuilder(javaStr);
		System.out.println(buffer);
		
		System.out.println("연산전 buffer 메모리 주소: "+ System.identityHashCode(buffer));
		
		//문자열 추가, 연결 - append()사용
		buffer.append(" and");
		buffer.append(" android");
		buffer.append(" programming is fun!!");
		
		System.out.println(buffer);
		//연산전과 주소값이 같다/메모리 낭비가 되지않음
		System.out.println("연산후 buffer 메모리 주소: "+ System.identityHashCode(buffer));
		
		
	}
}
