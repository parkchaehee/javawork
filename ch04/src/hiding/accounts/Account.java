package hiding.accounts;

//은행 통장 계좌 자료형 생성
//정보은닉 및 캡슐화 - private 사용
public class Account {
	//필드
	private String ano;    //계좌번호
	private String owner;  //계좌주
	private int balance;   //잔고
	
	//1. 기본생성자 //생략불가-사용중(AccountTest)
	
	
	public Account() {}
	
	//2. 매개변수 있는 생성자
	public Account(String ano, String owner, int balance) {
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
	}
	
	//get(), set() 메서드 생성
	//만드는 방법: set+필드이름(함수) - 필드이름의 첫글자 대문자
	public void setAno(String a) {//매개변수로 계좌번호 전달
		ano = a;
	}
	//출력
	public String getAno() {
		return ano;
	}
	public void setOwner(String own) {
		owner = own;
	}
	public String getOwner() {
		return owner;
	}
	public void setBalance(int bal) { //void 매개변수, 숫자int
		balance = bal;
	}
	public int getBalance() {
		return balance;
	}
	
}
