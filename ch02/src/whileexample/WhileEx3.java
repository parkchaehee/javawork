package whileexample;

public class WhileEx3 {

	public static void main(String[] args) {
		// 1~10 출력
		// 반복 조건문(while~if~break)
		// 변수 - i
		int i = 0;
		
		while(true) {//무한반복
			i++;//i = i +1
			if(i > 10)
				break; //i가 10보다 커질때 브레이크
			System.out.println(i); //1,2,3...
			//if(i == 10)
			//break; 10과 같을때 브레이크
		}
		
	}

}
