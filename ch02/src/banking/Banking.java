package banking;

import java.util.Scanner;

public class Banking {

	public static void main(String[] args) {
		// 은행업무 프로그램
		//1.예금 2.출금 3.잔고 4.종료
		
		
		Scanner sc = new Scanner(System.in);
		int balance = 0;    //잔고
		boolean sw = true; //상태 변수
		int money = 0;
		
		while(sw) {
		// 메뉴화면 만들기
		System.out.println("============================");
		System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
		System.out.println("============================");
		
		int selNum = sc.nextInt(); //메뉴번호 입력대기
		
		switch(selNum) {
		case 1:
			System.out.println("예금액->");
			balance += sc.nextInt();
			break;
		case 2:
			System.out.println("출금액->");
			money = sc.nextInt();
			if (money > balance) {
				System.out.println("잔액이 부족합니다");
			}else { //money < balance
				balance -= money;
			}
			balance -= sc.nextInt();
			break;
		case 3:
			System.out.println("잔고->" + balance);
			break;
		case 4:
			sw = false;   //상태바꿈 - while문 종료.
			break;
		default 
		:
			System.out.println("지원되지 않는 기능입니다.");
			break;
		   }
		
		}
		System.out.println("프로그램 종료");
		sc.close();

	}//main 끝
	

}//class끝



