package com.yedam.inter2;

public class Application {
	public static void main(String[] args) {
		//A(Interface) <- B <- C
		A a = new B();
		a.info();
		
		a = new C();
		a.info();
		//C도 B에게 상속 받았기 때문에 B의 메소드가 실행됨
	}
}
