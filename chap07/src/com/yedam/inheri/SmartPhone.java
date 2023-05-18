package com.yedam.inheri;

public class SmartPhone extends CellPhone {
	//extends를 사용하면 부모클래스의 필드를 가져올 수 있음.
	//필드
	String agency;
	//생성자
	SmartPhone(String model, String color, String agency){
		//부모 클래스 생성자 호출이 생략되어있음!!
		//자식클래스로 객체를 생성할때는 부모클래스로 객체를 생성한 다음 자식클래스를 객체로 생성함
		super();	//<-부모클래스의 생성자를 호출함! (기본 생성자의 경우 생략이 가능해짐)
		System.out.println("자식 객체 생성중");
		this.model = model;
		this.color = color;
		this.agency = agency;
	}
	SmartPhone(String model, String color){
		super(model);
		//super에 어떤 매개변수가 오냐에 따라 부모클래스의 생성자를 골라서 넣을 수 있다.
		this.color = color;
		this.agency = "KT";
	}
	void kakaoExe() {
		System.out.println("카카오톡을 실행합니다.");
	}
	void Info() {
		System.out.println("통신사 : "+agency+"입니다.");
	}
	
	void kakaoExit() {
		System.out.println("카카오톡을 종료합니다.");
	}
	
	
}
