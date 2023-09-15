package input;

import java.util.Scanner;

public class BonusPointTest {

	public static void main(String[] args) {
		// 고객의 이름, 구매 금액을 입력
		// 이름과 구매포인트 출력
		// 구매포인트 = 상품가격(bonusPoint) * 포인트적립율(bonusRatio)
		// 입력
		
		System.out.println("성함을 입력하시오");
		Scanner sc = new Scanner(System.in);
		String customer = sc.nextLine(); //사용자 - 이름 입력
		
		System.out.println("구매금액을 입력하시요:");
		
		int price = sc.nextInt(); //사용자 - 금액입력
		double bonusRatio = 0.02;
		int bonusPoint = 0;
		
		//계산처리
		bonusPoint = (int)(price * bonusRatio); //정수형으로 강제 형변환함
		
		//출력
				System.out.println(customer + "님의 보너스 포인트는 " + bonusPoint 
						+ "점 입니다.");
				sc.close();
	
	
	
	
	}

}
