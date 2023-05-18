package com.yedam.inheri;

public class Application03 {
	public static void main(String[] args) {
		int r = 10;
		
		Computer com = new Computer();
		System.out.println("원 면적 : "+com.areaCircle(r));
		
		Child child = new Child();
		
//		//부모 객체
//		child.getInfo();	//자식객체가 재정의한(오버라이딩된) 메소드 실행
//		child.method1();	//자식객체가 재정의한(오버라이딩된) 메소드 실행
//		child.method2();	//부모객체가 가진 메소드가 실행 -> 재정의 되지 않았기 때문
//		//자식 객체
//		child.method3();	//자식 객체의 메소드 실행	
		
		SupersonicAirPlane sa = new SupersonicAirPlane();
		
		sa.takeOff();
		
		sa.fly();	//부모 클래스에 정의해 놓은 내용
		sa.flyMode = SupersonicAirPlane.SUPERSONIC;
		sa.fly();	//자식 클래스에 정의해 놓은 내용
		sa.flyMode = SupersonicAirPlane.NORMAL;
		sa.fly();	//부모 클래스에 정의해 놓은 내용
		
		sa.land();
		
		
		
	}
}
