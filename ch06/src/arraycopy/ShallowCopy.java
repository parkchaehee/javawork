package arraycopy;

public class ShallowCopy {

	public static void main(String[] args) {
		Book[] array1 = new Book[3];
		Book[] array2 = new Book[3];
		
		array1[0] = new Book("미생1", "윤태호1");
		array1[1] = new Book("미생2", "윤태호2");
		array1[2] = new Book("미생3", "윤태호3");
		
		System.out.println("***array1 출력***");
		//array1의 첫번째 요소 수정
		array1[0].setBookName("아리랑1");
		array1[0].setAuthor("조정래");
		
		for(int i=0; i<array1.length; i++) {
			System.out.println(array1[i]);
		}
		//배열복사
		for(int i=0; i<array1.length; i++) {
			array2[i] = array1[i];
		}
		
		System.out.println("*** array2 출력 ***");
		for(int i=0; i<array2.length; i++) {
			System.out.println(array2[i].toString());
		}
		System.out.println("*** array3 clone 출력 ***");
		//clone()배열복사
		Book[] array3 = array2.clone();
		for(int i=0; i<array3.length; i++) {
			System.out.println(array3[i].toString());
		}
		System.out.println("*** array3 향상for문 출력 ***");
		//clone == 향상 for문
		//for(자료형 변수 : 배열이름){변수출력}
		for(Book arr3 : array3) {
			System.out.println(arr3);//.toString()생략가능
		}

	}

}
