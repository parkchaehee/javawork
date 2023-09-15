package hiding.accounts;

public class AccountTest2 {

	public static void main(String[] args) {
		// 2. 매개변수 있는 생성자
		//생성자를 통해 계좌정보 입력
		Account account = 
				new Account("111-222-3333", "김대박", 900000000);
		
		//계좌번호 출력
				System.out.println("계좌번호: " + account.getAno());
				System.out.println("계좌주: " + account.getOwner());
				System.out.println("잔고: " + account.getBalance());
		

	}

}
