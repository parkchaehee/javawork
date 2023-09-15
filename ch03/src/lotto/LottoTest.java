package lotto;

public class LottoTest {

	public static void main(String[] args) {
		// 로또 번호 생성기
		// 1~45중 6개 생성
		// 배열의 크기가 6개인 lotto선언
		int[] lotto = new int[6];
		
		//lotto[0] = (int)(Math.random()*45 + 1);
		//System.out.println(lotto[0]);
		
		//6개 동시 생성
		for(int i=0; i<lotto.length; i++) {
			lotto[i] = (int)(Math.random()*45 + 1);
			
			//중복 해결 - 중첩for
			for(int j = 0; j<i; j++) {
				if(lotto[i] == lotto[j])
					i--; //이전 인덱스로 이동
			}
			/*
			 10 5 8 5 30 35
			 i=0일때      결과:10
			 i=1일때 j=0  결과:5
			 i=2일때 j=1  결과:8
			 i=3일때 j=2  결과:5 - 중복(재추첨)
			 i=4일때 j=3  결과:30
			 i=5일때 j=4  결과:35
			
			 */
		}
		//6개 출력
		for(int i =0; i<lotto.length; i++) {
			System.out.print(lotto[i] + " ");
		}
		System.out.println();
		
		//파일 이름 출력
		LottoTest lottoTest = new LottoTest();
		System.out.println(lottoTest);
		

	}

}