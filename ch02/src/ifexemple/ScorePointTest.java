package ifexemple;

import java.util.Scanner;

public class ScorePointTest {

	public static void main(String[] args) {
		/* 점수에 따른 학점 계산 프로그램
		A (90점 이상) ~ F (60점 미만)*/
		// 변수 - score(정수형), grade(문자형)
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수를 입력하시오:");
		int score = sc.nextInt();
		char grade = 'A';
		//연산
		if(score >= 90 && score <= 100) {
			grade = 'A';
		}else if(score >= 80 && score > 90) {
			grade = 'B';
		}else if (score >= 70 && score > 80) {
			grade = 'C';
		}else if (score >= 60 && score > 70) {
			grade = 'D';
		}else {//if(score < 60 && score >= 0) <-생략
			grade = 'F';
		}//출력
		System.out.println(grade + "학점입니다.");
		
		
		
		sc.close();

	}

}
