package transport;

public class Main {

	public static void main(String[] args) {
		//사람 객체 생성
		Person p1 = new Person("이강인", 10000);
		Person p2 = new Person("박채희", 20000);
		
		//버스 객체 생성
		Bus bus100 = new Bus(100); //bus100-객체
		Bus bus740 = new Bus(740); 
		
		//지하철 객체 생성
		Subway green = new Subway("2호선");

		p1.takeBus(bus100);
		p1.takeBus(bus740);
		
		p1.takeSubway(green);
		
		//정보출력
		p1.showPersonInfo();
		p2.showPersonInfo();
		bus100.showBusInfo();
		bus740.showBusInfo();
		green.showSubwayInfo();

		

	}

}