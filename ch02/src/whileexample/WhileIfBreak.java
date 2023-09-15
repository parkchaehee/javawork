package whileexample;

public class WhileIfBreak {

	public static void main(String[] args) {
		// 반복 조건문(while ~ if ~ break)
		// 1부터 10까지 출력
		
		int i = 0;       //1.초기값
		
		while(true) {   //무한반복
			i++;         //3.증감값
			System.out.println(i);
			if(i == 10) //중괄호 블럭 실행문한줄일때 생략가능
				break; //탈출 2.종료조건
		}

	}

}
