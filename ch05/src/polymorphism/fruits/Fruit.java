package polymorphism.fruits;

public class Fruit {
	//필드
	protected String name;    //과일이름
	protected String weight;  //무게(중량)
	protected int price;      //가격
	
	public Fruit() {}
	
	public void showFruitInfo() {
		System.err.println("과일 이름: " + name);
		System.err.println("과일 무게: " + weight);
		System.err.println("과일 가격: " + price);
	}
	

}
