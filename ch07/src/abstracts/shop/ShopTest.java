package abstracts.shop;

public class ShopTest {

	public static void main(String[] args) {
		//추상클래스는 객체생성이 안됨
		//부모타입으로 객체생성
		HeadShop shop1 = new Shop1();
		shop1.된장찌개();
		shop1.김치찌개();
		shop1.비빔밥();
		
		HeadShop shop2 = new Shop2();
		shop2.된장찌개();
		shop2.김치찌개();
		shop2.비빔밥();

	}

}
