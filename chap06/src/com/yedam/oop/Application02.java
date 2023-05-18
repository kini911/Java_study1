package com.yedam.oop;

public class Application02 {
	public static void main(String[] args) {
		Bycle bycle = new Bycle();
		
		bycle.setGas(5);	//메소드를 활용한 필드 초기화방법(다섯번째) / Bycle클래스의 setGas메소드값을 5를 입력
							//setGas메소드는 Bycle클래스의 필드값인
		
		boolean gasState = bycle.isLeftGas();
		if(gasState) {
			System.out.println("출발합니다");
			bycle.run();	//Bycle 클래스의 런 메소드를 시작함
		}
		//run메소드가 끝나면 아래if문 실행
		if(bycle.isLeftGas()) {
			System.out.println("gas를 주입할 필요가 없습니다");
			//Bycle클래스에서 isLeftGas문을 실행하는데 리턴값이 참이라면 실행
		}else {
			System.out.println("gas를 주입하세요");
			//Bycle클래스에서 isLeftGas문을 실행하는데 리턴값이 거짓이라면 실행
			//위에서 run메소드를 실행했기 때문에 가스는 0으로되었고 isLeftGas메소드는 gas가 0일때 false값을 출력->지금if문이 거짓이 되기때문에 가스주입하라고 출력나옴
		}
	}
}
