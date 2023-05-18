package com.yedam.inheri;

public class Application01 {
	public static void main(String[] args) {
		SmartPhone sp= new SmartPhone("아이폰","스그","SK");
		//CellPhone(부모)클래스 필드
		System.out.println("모델 : "+sp.model);
		System.out.println("색상 : "+sp.color);
		//SmartPhone(자식)클래스 필드
		System.out.println("통신사 : "+sp.agency);
		
		//CellPhone(부모) 클래스 메소드
		sp.powerOn();
		sp.bell();
		sp.hangUp();
		sp.powerOff();
		//SmartPhone(자식) 클래스 메소드
		sp.kakaoExe();
		sp.kakaoExit();
		sp.Info();
		
		
		
	}
}
