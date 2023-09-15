package operator;

public class OperaterEx4 {

	public static void main(String[] args) {
		// 논리연산자 - &&앰퍼샌드(그리고), ||bar2개, !
		//&& 두항이모두참=true(논리곱,교집합)
		//|| 두항중하나참=true(논리합,합집합)
		//!  항이참=false, 항이거짓=true (논리부정,아니다)
		
		System.out.println((4<5) && (10==11));//그리고
		System.out.println((4<5) || (10==11));//또는
		System.out.println(!(10==10));//논리부정 true
		

	}

}
