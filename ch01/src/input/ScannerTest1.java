package input;

import java.util.Scanner;


public class ScannerTest1 {

	public static void main(String[] args) {
		// 입력처리
		// 문자열 - nextLine()
		// 숫자 - nextInt() 넥스트인풋
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("이름 입력:");
		String name = scanner.nextLine(); //문자열입력
		
		
		System.out.print("나이 입력: ");
		int age = scanner.nextInt();
	 
		
		System.out.println("당신의 이름은 " + name +", 나이: " + age);
		
		scanner.close(); //닫기

	}

}
