package transport;

public class Subway {
	//필드
	String lineNumber; //지하철 호선
	int passenger;
	int money;
	
	public Subway(String lineNumber) {
		this.lineNumber = lineNumber;
	}
	
	public void take(int fee) { //요금을 받음
		this.money += fee;   //수입이 늘어남
		passenger++;         //승객수 1명 증가, passenger=passenger+1
	}
	public void showSubwayInfo() {
		System.out.printf("%s번 지하철의 수입은 %,d 원 이고, 승객 수는 %d명 입니다.",
				lineNumber, money, passenger);
	}
		


}
