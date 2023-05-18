package com.yedam.inter;

public class InterFaceExample {
	public static void main(String[] args) {
		//인터페이스는 스스로 객체x
		//구현 클래스의 도움을 받아야함
		RemoteControl rc = new Television();
		rc.turnOn();
		rc.setVolume(5);
		rc.setVolume(12);
		rc.setVolume(-50);
		rc.turnOff();
		rc.search("www.daum.net");
		//인터페이스의 다중상속으로 remotecontrol에서 search메소드를 사용할 수 있다
		System.out.println();
		
//		rc = new Audio();
//		rc.turnOn();
//		rc.setVolume(3);
//		rc.setVolume(-1);
//		rc.turnOff();
		
//		Searchable rc2 = new Television();
//		rc2.search("www.naver.com");
//		rc2.turnOn();
		//Television클래스는 searchable과 RemoteControl인터페이스가 같이 있지만 타입지정을 다르게 했기때문에 두가지종류의 메소드를 다 쓸수 없음!!!!
		
		InterfaceC ic = new ImplementsC();
		ic.method1();
		ic.method2();
		ic.method3();
		
		
	}
}
