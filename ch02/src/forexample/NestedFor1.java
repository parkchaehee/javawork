package forexample;

public class NestedFor1 {

	public static void main(String[] args) {
		// 중첩 for문
		// 5행5열에 '*' 출력
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				System.out.print('*');
			}
			System.out.println(); //한줄띄움
			
		}
		System.out.println();
		
		//삼각형모양  //행은 그대로 열이 1씩증가
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print('*');
			}
			System.out.println(); //한줄띄움
			
		}
		System.out.println();
		
		//역삼각형모양 //행은 그대로 열이 1씩감소
				for(int i=1; i<=5; i++) {
					for(int j=1; j<=6-i; j++) {
						System.out.print('*');
					}
					System.out.println(); //한줄띄움
				}
				
				System.out.println();
				
		//역삼각형모양 //행은 그대로 열이 1씩감소
				for(int i=1; i<=5; i++) {
					for(int j=5; i<=j; j--) {
						System.out.print('*');
						//System.out.print("i="+i+", j="+j);
					}
					System.out.println();
				}

	}

}
