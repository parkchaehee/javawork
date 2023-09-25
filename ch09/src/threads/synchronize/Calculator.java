package threads.synchronize;

public class Calculator {
	
	private int memory;
	
	public int getMemory() {
		return memory;
	}
	//synchronized 키워드를 붙이면 lock 걸어서
	//다른 스레드에 의해서 변경되지 않음
	public synchronized void setMemory(int memory) {
		this.memory = memory;
		
		try {
			Thread.sleep(2000); //2초 대기
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		//현재 스레드 이름
		System.out.println(Thread.currentThread().getName()
				+ ": " + this.memory);
	}
}
