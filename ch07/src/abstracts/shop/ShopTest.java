package abstracts.shop;

public class ShopTest {

	public static void main(String[] args) {
		//추상 클래스는 객체 생성 안됨
		//부모 타입으로 객체 생성
		//HeadShop shop1 = new HeadShop();
		HeadShop shop1 = new Shop1();
		shop1.된장찌게();
		shop1.김치찌게();
		shop1.비빔밥();
		
		HeadShop shop2 = new Shop2();
		shop2.된장찌게();
		shop2.김치찌게();
		shop2.비빔밥();

	}

}
