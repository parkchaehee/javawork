package reference.subjects;

public class StudentMain {

	public static void main(String[] args) {
		/*Student std1 = new Student(101, "홍길동");
		Student std2 = new Student(102, "박채희");
		
		//과목 추가
		std1.koreanSubject("국어", 90);
		std1.mathSubject("수학", 83);
		std2.koreanSubject("국어", 100);
		std2.mathSubject("수학", 100);
		
		//학생 정보 출력
		std1.showStudentInfo();
		std2.showStudentInfo();*/
		
		//객체 배열
		Student[] students = {
			new Student(101, "홍길동"),
			new Student(102, "박채희"),
			new Student(103, "임상옥")
		};
		//점수저장
		students[0].koreanSubject("국어", 90);
		students[0].mathSubject("수학", 83);
		students[1].koreanSubject("국어", 100);
		students[1].mathSubject("수학", 100);
		students[2].koreanSubject("국어", 200);
		students[2].mathSubject("수학", 200);
		
		//전체출력
		students[0].showStudentInfo();
		for(int i = 0; i<students.length; i++) {
			students[i].showStudentInfo();
		}
		System.out.println();
		//향상 for
		for(Student student : students)
			student.showStudentInfo();
		

	}

}
