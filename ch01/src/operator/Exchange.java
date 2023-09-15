package operator;

public class Exchange {

	public static void main(String[] args) {
		// 변수의 값 교환
		// 변수 선언 - 입력
		int x = 0;
		int y = 1;
		int temp; //임시 변수 선언
		
		
		//출력
		System.out.println("*******교환 전*********");
		System.out.println(x);
		System.out.println(y);
		System.out.println(x +","+ y);
		System.out.println("x=" + x + ", y=" + y);
		
		//교환 처리(연산)
		temp = x;  //temp = 0///오른쪽에 있는걸 왼쪽으로 대입
		x = y;     //x = 0->1로 바뀜
		y = temp;  //y = 1->0로 바뀜
		
		System.out.println(); // 한줄공백
		
		//출력
		System.out.println("*******교환 후*********");
		System.out.println("x=" + x + ", y=" + y);
		

	}

}
