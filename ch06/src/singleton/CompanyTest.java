package singleton;

public class CompanyTest {

	public static void main(String[] args) {
		//직접접근
		Company company1 = Company.getInstance();
		Company company2 = Company.getInstance();
		
		System.out.println(company1);
		System.out.println(company2);
		
		System.out.println(company1 == company2); //true/주소동일
		
		

	}

}
