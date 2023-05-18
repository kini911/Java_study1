package com.yedam.inter;

public class ImplementsC implements InterfaceC {

	@Override
	public void method1() {
		System.out.println("InterfaceA의 method1 실행");
	}

	@Override
	public void method2() {
		System.out.println("InterfaceB의 method2 실행");

	}

	@Override
	public void method3() {
		System.out.println("InterfaceC의 method3 실행");

	}

}
