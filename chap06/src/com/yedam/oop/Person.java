package com.yedam.oop;

public class Person {
	//필드
	final String nation = "대한민국";
	final String ssn;
	//final 필드로 지정되면 값을 입력해줘야함
	String name;
	//생성자
	Person(String ssn, String name){
		this.ssn = ssn;
		//final ssn필드는 값을 입력해야해서 생성자로 데이터 받아올 수 있게 해주면 위의 오류는 사라짐
		this.name = name;
	}
	//메소드
}
