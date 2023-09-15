package classes.student;

public class StudentTest {

	public static void main(String[] args) {
		// Student 객체(변수) 생성
		// 메모리 영역(new를 하면 heap 영역 사용)
		// 점 연산자로 접근함
		Student student1 = new Student();// 생성자
		student1.name = "홍길동";
		student1.studentId = 101;
		student1.grade = 1;
		
		/*System.out.println(student1.name);
		System.out.println(student1.studentId);
		System.out.println(student1.grade);*/
		student1.showStudentInfo();
		
		System.out.println("======================");
		
		Student student2 = new Student();
		student2.name = "박채희";
		student2.studentId = 102;
		student2.grade = 2;
		student2.showStudentInfo();
		
		
		/*System.out.println("이름: " + student2.name);
		System.out.println(student2.studentId + "학번");
		System.out.println(student2.grade + "학년");*/
				
		

	}

}