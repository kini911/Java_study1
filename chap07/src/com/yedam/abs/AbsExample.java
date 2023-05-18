package com.yedam.abs;

public class AbsExample {
	public static void main(String[] args) {
		SmartPhone sp = new SmartPhone("홍길동");
		sp.internetSearch();
		sp.turnon();
		sp.turnOff();
		
		Phone p = sp;
		p.turnon();
		p.turnOff();
		
		SmartPhone sp2 = (SmartPhone) p;
		sp2.internetSearch();
		sp2.turnon();
		sp2.turnOff();
	}
}
