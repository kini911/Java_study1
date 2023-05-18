package com.yedam.access;

public class Singleton {
	
	//클래스 내부에서 하나의 객체를 생성
	//만들어진 하나의 객체는 외부에서 접근이 불가능
//	private static Singleton singleton = new Singleton();	//<-기본방법
	//메모리를 아낄수 있는 singleton생성 방법
	private static Singleton singleton = null;
	
	//외부에서 객체를 생성하지 못하도록 막는 역할
	private Singleton() {
		
	}
	
	//클래스 내부에서 만든 단 하나의 객체를 외부에 전달하기 위한 용도
//	public static Singleton getInstance() {
//		return singleton;
//	}	//<-기본방법
	//메모리를 아낄 수 있는 singleton 생성 방법
	public static Singleton getInstance() {
		if(singleton == null) {
			singleton = new Singleton();
		}
		return singleton;
	}
	
	//필드
	public String name;
	public int age;
	//메소드
	public void info() {
		System.out.println("싱글통의 인스턴스 메소드 info 출력");
	}
}
