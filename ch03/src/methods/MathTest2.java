package methods;

public class MathTest2 {

	public static void main(String[] args) {
		// 주사위 10번 던지기
		for(int i=1; i<=10; i++) {
			int dice = (int)(Math.random()*6) + 1;		
			System.out.println(dice);
		}
		
		//배열에서 문자열 랜덤 추출
		String[] word = {"나", "너", "우리", "나라"};
		
		System.out.println(word[0]);
		//전체출력
		for(int i=0; i<word.length; i++) {
			System.out.print(word[i]);
		}
		System.out.println();
		//랜덤출력
		int idx = (int)(Math.random()*word.length); //0~3 배열은+1(x)
		//System.out.println(idx); //배열숫자나옴
		System.out.println(word[idx]);

	}

}
