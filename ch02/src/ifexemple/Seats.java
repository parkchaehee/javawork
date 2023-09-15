package ifexemple;

import java.util.Scanner;

public class Seats {

	public static void main(String[] args) {
		// 입장객 수에 따른 좌석의 필요 줄수(행) 계산
		// 변수 - customer(고객수), column(열수), row(줄수)
		Scanner sc = new Scanner(System.in);

		
		System.out.print("입장객 수 입력: ");
		int customer = sc.nextInt();
		
		System.out.print("좌석 열 수 입력: ");
		int column = sc.nextInt();
		
		int row = 0;
		
		//연산 처리(if ~ else문)
		row = customer / column;
		
		
		if(customer % column==0) {
			row = customer / column; //row = 몫
			
		}else {//나머지가 있으면
			row = customer / column +1; //row = 몫+1
		}
		
		System.out.println(row + "줄이 필요합니다.");


	}
	
	
	
	

}
