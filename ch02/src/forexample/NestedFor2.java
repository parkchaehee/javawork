package forexample;

public class NestedFor2 {

	public static void main(String[] args) {
		// 숫자 증가
		/*
		 1 2 3 4 5       ->(5*0)+1
		 6 7 8 9 10      ->(5*1)+1
		 11 12 13 14 15  ->(5*2)+1
		                (열개수*i)+1
		 */
		
		for (int i=0; i<5; i++) {
			for(int j=1; j<=5; j++) {
				System.out.print(5
						
						*i+j + " ");
				
			}
			System.out.println();
		}

	}

}
