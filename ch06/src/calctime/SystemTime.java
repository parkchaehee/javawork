package calctime;

public class SystemTime {

	public static void main(String[] args) {
		// 성능 테스트 소요 시간 측정 - ms, ns
		
		//long start = System.currentTimeMillis();// 현재까지의 시간(밀리초)
		long start = System.nanoTime();
		
		long sum = 0;
		for(int i=1; i<10000000; i++) {
			sum +=i;
		}
		//long end = System.currentTimeMillis();//밀리초
		long end = System.nanoTime();//나노초
		System.out.println(sum);
		//System.out.println((end-start) + "ms");//밀리초
		System.out.println((end-start)/1000000 + "ns");//나노초

	}

}
