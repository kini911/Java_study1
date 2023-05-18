package com.yedam.inheri;

public class Child extends Parent {
	//필드
	String name;
	//생성자
	
	//메소드
	@Override
	public void getInfo() {
		super.getInfo();
		//부모클래스는 영어로 super class임(부모 메소드를 호출 할 때는 super.부모메소드이름 사용)
		System.out.println("나의 이름은 "+name+" 입니다.");
	}
	
	@Override
	public void method1() {
		this.getInfo();
		method2();
		//부모클래스의 메소드이면서 자식 클래스에 없는 메소드 라면 super를 안 붙여도 부모클래스의 메소드인걸 알기 때문에 super를 붙여주지 않음
		System.out.println("자식 객체의 method1 실행");
	}
	public void method3() {
		System.out.println("자식 객체의 method3 실행");
	}
	
	
}
