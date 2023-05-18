package com.yedam.oop;

public class Korean {
	//필드
	String nation = "대한민국";
	String name;
	String ssn;
	//생성자
	Korean(String name, String ssn){
		//매개변수와 필드의 이름을 같게 해야함(this활용)
		this.name = name;	
	  //this.name은 필드의 name을 의미함(객체의 name을 의미)
		this.ssn = ssn;
	}
	//변수와 함수는 같은이름으로 생성불가능
	//하지만 자바에서는 생성자를 오버로딩 할 수 있음(오버로딩:매개변수를 다르게 해서 여러개 선언할 수 있음)
	//매개변수 갯수,타입,타입의 순서에 따라서 서로 다른 생성자로 구분할 수 있음
	
	//메소드
}
