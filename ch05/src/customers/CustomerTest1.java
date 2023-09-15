package customers;

public class CustomerTest1 {

	public static void main(String[] args) {
		// 일반고객 1명, VIP 1명의 객체생성
		Customer lee = new Customer();
		//매개변수없으니까 set?
		//입력
		lee.setCustomerId(1001);
		lee.setCustomerName("이순신");
		
		int price = 10000; //구매가격
		lee.calcPrice(price);
		
		//출력
		System.out.println(lee.showCustomerInfo());
		System.out.println("======================================");
		
		VIPCustomer woo = new VIPCustomer();
		//입력
		woo.setCustomerId(1010);
		woo.setCustomerName("우영우");
		woo.setAgentId(7777);
		
		price = 20000; //가격수정
		woo.calcPrice(price);
		//출력
		System.out.println(woo.showCustomerInfo());
	}

}
