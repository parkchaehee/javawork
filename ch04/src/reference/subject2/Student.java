package reference.subject2;

import reference.subjects.Subject;

public class Student { //클래스안에 변수가 쓰이면 생략//main안에서는 해야함
	private int studentId;   //int studentId = 0
	private String studentName; //String studentName = null
	private Subject[] subjects;
	
	public Student(int studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
		subjects = new Subject[10]; //과목을 저장할 배열10개저장
	}
	
	//과목추가
	public void addSubject(String name, int score) {
		//과목 객체를 생성해서 값(과목이름, 점수)을 저장
		Subject subject = new Subject(name, score);
		//subject.setSubjectName(name);
		//subject.setScorePoint(score);
		
		//과목을 배열에 저장
		//subjects[0] = subject; //1개 저장
		for(int i=0; i<subjects.length; i++) {
			if(subjects[i] == null) {//배열의 요소가 비어있을때
				subjects[i] = subject;//배열 객체를 저장
				break;
			}
		}
	}
	//학생정보출력
	public void showStudentInfo() {
		int total = 0;  //총점 
		double average; //초기화 안해도됨
		int count = 0;
		for(int i=0; i < subjects.length; i++) {
			if(subjects[i] != null) {     //배열의 요소가 비어있지 않을때
				//Subject subject = subjects[i];   //객체를 생성하고 출력
				count++;                         //true일때 1증가
				total += subjects[i].getScorePoint();//점수 누적
				System.out.println(studentId + "번 학생 " + studentName + "의 " + 
				subjects[i].getSubjectName()+ "점수는 " + subjects[i].getScorePoint() + "점 입니다.");
			}
		}
		average = (double)total / count; //<-length 수정필요
		System.out.printf("과목의 총점은 %d점 이고, 평균은 %.1f입니다.\n", total, average);
	}
	

}