package Books;

public class Book {
	//필드
	private String bookName;
	private String author;
	
	//생성자
	public Book(String bookName, String author) {
		this.bookName = bookName;
		this.author = bookName;
		
	}
	
	//책의 정보 출력
	/*public void showBookInfo() {
		System.out.println(bookName + ", " + author);
	}*/
	public String showBookInfo() {
		
		return bookName + ", " + author;
	}

}