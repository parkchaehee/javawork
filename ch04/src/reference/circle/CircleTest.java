package reference.circle;

public class CircleTest {

	public static void main(String[] args) {
		/*Circle c1 = new Circle(2, 3, 5);
		c1.showCircleInfo();
		
		Circle c2 = new Circle(10, 12, 10);
		c2.showCircleInfo();*/
		
		
		//객체 배열
		/*Circle[] circle = {
				new Circle(2, 3, 5),  //circle [0]번 인덱스
				new Circle(10, 12, 10),  //circle [1]번 인덱스
				new Circle(-10, -12, -10)  //circle [2]번 인덱스
		};*/
		
		Circle[] circle = new Circle[3];
		circle[0] = new Circle(2, 3, 5);
		circle[1] = new Circle(10, 12, 10);
		circle[2] = new Circle(-10, -12, -10);
		
		//특정 한가지 인덱스 조회(출력)
		circle[0].showCircleInfo();
		System.out.println("===================================");
		
		//전체 조회(출력)
		for(int i=0; i<circle.length; i++) {
			circle[i].showCircleInfo();
		}
		

	}

}
