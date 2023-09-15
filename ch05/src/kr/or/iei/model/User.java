package kr.or.iei.model;
//시험 생성자 새터개터 배열
//필드가 많고 오류를 해놓으면 뭔지 맞혀야함
//이클립스에 연습후 적기
//회원 클래스(자료형) 정의
public class User {
	//필드(속성)//접근제어자
	private String id;
	private String pwd;
	private String name;
	
	//기본생성자//생략or매개변수this사용시 만들어야함
	public User() {}
	//시험문제//배열객체**************************
	//생성자(매개변수있음)
	
	public User(String id, String pwd, String name) {
		this.id = id;
		this.pwd = pwd;
		this.name = name;
	}
	
	//set+필드이름()-입력, get+필드이름()함수-출력
	public void setId(String id) {
		this.id = id;
	}
	public String getId() {
		return id;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getPwd() {
		return pwd;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}

}
