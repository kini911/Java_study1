package com.yedam.inheri;

public class People {
	//부모 클래스로 사용
	//필드
	String name;
	String ssn;
	//생성자
	//매개변수가 있는 생성자가 있다면 자식 클래스에서 부모클래스의 생성자를 가져가야함!
	public People(String name, String ssn) {
		this.name = name;
		this.ssn = ssn;
	}
}
