package banking;

import java.util.Scanner;

public class Banking {

	public static void main(String[] args) {
		// 은행 업무
		// 1.예금 2.출금 3.잔고 4.종료
		//메뉴 화면 만들기
		Scanner sc = new Scanner(System.in);
		int balance = 0;     //잔고
		boolean sw = true; //상태 변수
		
		while(sw) {
			System.out.println("==============================");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("==============================");
			
			int selNum = sc.nextInt(); //메뉴 번호 입력
			int money = 0;  //입금, 출금액
			
			switch(selNum) {
			case 1:
				System.out.print("예금액>");
				money = sc.nextInt(); //입금액
				balance += money;
				break;
			case 2:
				System.out.print("출금액>");
				money = sc.nextInt(); //출금액
				if(money > balance) {
					System.out.println("잔액이 부족합니다.");
				}else { //money < balance
					balance -= money;
				}
				break;
			case 3:
				System.out.println("잔고>" + balance);
				break;
			case 4:
				sw = false;  //상태를 바꿈 - while문 종료
				break;
			default:
				System.out.println("지원되지 않는 기능입니다.");
				break;
			}
		}//while 끝
		System.out.println("프로그램 종료");
		sc.close();
	}//main 끝
}//class 끝
