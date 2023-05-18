package com.yedam.inheri;

public class Student extends People {
	//자식 클래스
	//필드
	int stdNo;
	
	public Student(String name, String ssn, int stdNo) {
		super(name, ssn);
		//부모클래스를 객체로 만들어야 하기 때문에 부모클래스의 생성자에 맞게 super의 필드값이 있어야함
		this.stdNo = stdNo;
	}
}