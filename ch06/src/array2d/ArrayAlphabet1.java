package array2d;

public class ArrayAlphabet1 {

	public static void main(String[] args) {
		// 대문자 26자를 배열에 저장
		// for문 출력
		/*char c = 'A';
		System.out.println(c);
		System.out.println((int)c);
		
		char c2 = 66;
		System.out.println(c2);*/
		System.out.println("일반 for문을 사용 알파벳 출력");
		
		char c;
		for(c=65; c<=90; c++) { //65아스키코드값
			System.out.print(c + " ");
		}
		System.out.println("\n변수의 마지막 값: "+(char)(c-1));
		
		System.out.println("\n== 알파벳을 배열에 저장하고 출력 ==");
		char[] alphabets = new char[26];
		char ch = 'A';
		
		//alphabets[0] = ch;
		//System.out.println(alphabets[0]);//A
		//alphabets[1] = (char)(ch+1);   //자바에 덧셈연산하면 int형으로 바뀜->다시char로 형변환
		//ch++; //ch = ch + 1 - 1증가(후증가)
		//alphabets[1] = ch;
		//System.out.println(alphabets[1]);//B
		
		//알파벳을 배열에 저장, 1증가
		for(int i=0; i<alphabets.length; i++) {
			alphabets[i] = ch;
			ch++;
		}
		for(int i=0; i<alphabets.length; i++) {
			System.out.print(alphabets[i] + " ");
		}
	}
}
