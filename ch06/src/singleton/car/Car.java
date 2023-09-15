package singleton.car;

public class Car {
	//필드
	private static int serialNum = 1000; //기준번호 - 클래스변수
	private int carNum; //차량 번호//인스턴스 변수(new해야함)
	
	public Car(){
		serialNum++;
		carNum = serialNum;
	}
	//자동차 번호 출력 메서드
	public int getCarNum() {
		return carNum;
	}

}
