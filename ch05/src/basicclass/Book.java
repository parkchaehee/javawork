package basicclass;

public class Book //extends Object<-숨겨져있음
								   {
	int bookNumber;   //책 번호
	String bookTitle; //책 제목
	
	Book(int bookNumber, String bookTitle){
		this.bookNumber = bookNumber;
		this.bookTitle = bookTitle;
	}
	//매서드 재정의
	@Override
	public String toString() {
		return bookNumber + ", " + bookTitle;
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
	

}