package arraylist.shape;

import java.util.ArrayList;

class Shape{
	public void draw() {
		System.out.println("Shape");
	}
}
//원이 도형 클래스를 상속 받음
class Circle extends Shape{

	@Override
	public void draw() {
		System.out.println("Circle");
	}
}
class Triangle extends Shape{

	@Override
	public void draw() {
		System.out.println("Triangle");
	}
}
public class ShapeTest {
	
	public static void main(String[]args) {
		ArrayList<Shape> list = new ArrayList<>();
		
		list.add(new Circle());
		list.add(new Triangle());
		list.add(new Shape());
		
		for(Shape s : list) {
			s.draw();
		}
	}
}