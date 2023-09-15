package forexample;

public class GugudanText {

	public static void main(String[] args) {
		// 단일 for()
		/*
		 3 x 1 = 3
		 3 x 2 = 6
		 3 x 3 = 9
		 ...
		 3 x 8 = 24
		 3 x 9 = 27
		 */
		int dan = 3;
		for(int i=1; i<20; i++) {
			System.out.println(dan +" x "  + i + " = " + (dan*i));
		}

	}

}
