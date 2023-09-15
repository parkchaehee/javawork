package arrays;

public class ArrayGugudan {
	public static void main(String[] args) {
		//구구단 3단 출력
		int dan = 3;
		
		for(int i=1; i<10; i++) {
			System.out.println(dan + " x " + i + " = " + dan*i);
		}
		System.out.println("====================");
		//배열사용 구구단[]
		int[]gugudan = new int[9];
		//배열요소 저장
		for(int i=0; i<gugudan.length; i++) {
			gugudan[i] = dan * (i + 1);
			
		}
		//배열요소 출력
		for(int i=0; i <gugudan.length; i++) {
			System.out.println(dan + " x " + (i+1) + " = " + gugudan[i]);
		}
		System.out.println("====================");
		//배열 복사
		int[] gugudan2 = new int[9];
		
		
		//1. 일반복사
		for(int i = 0; i<gugudan.length; i++) {
			gugudan2[i] = gugudan[i];
		}
		for(int i = 0; i<gugudan.length; i++) {
			System.out.println(dan + " x " + (i+1) + " = " + gugudan2[i]);
		}
		System.out.println("====================");
		//2. Object 클래스의 clone()
		int[]gugudan3 = gugudan2.clone();
		
		for(int i = 0; i<gugudan.length; i++) {
			System.out.println(dan + " x " + (i+1) + " = " + gugudan3[i]);
		}
		
		
		
	}

}
