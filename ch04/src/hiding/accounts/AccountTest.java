package hiding.accounts;

public class AccountTest {

	public static void main(String[] args) {
		//1. 생략되어있는 기본생성자
		// Account 인스턴스 생성
		Account account = new Account();
		//멤버에 직접 접근하지 못하도록 제한을 둠
		//account.ano = "111-222-3333";
		//멤버 메서드에 접근 가능
		account.setAno("111-2222-3333"); //set입력, get출력/세터,게터
		account.setOwner("김대박");
		account.setBalance(9000);
		
		//계좌번호 출력
		System.out.println("계좌번호: " + account.getAno());
		System.out.println("계좌주: " + account.getOwner());
		System.out.println("잔고: " + account.getBalance());
		
		//System.out.println(account.ano);

	}

}
