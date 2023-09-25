package threads.synchronize;

public class User1Thread extends Thread {
	//Calculator 객체 참조해서 변수 선언
	private Calculator calculator;
	
	public  User1Thread() {
		setName("User1Thread"); //스레드이름설정
	}
	public void setCalculator(Calculator calculator) {
		this.calculator = calculator;
	}
	//run 재정의
	@Override
	public void run() {
		calculator.setMemory(50);
		
	
	}
}
