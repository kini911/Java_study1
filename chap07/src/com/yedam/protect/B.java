package com.yedam.protect;

public class B extends A {
	@Override
	public void method() {
		A a = new A();
		a.field = "value";
		a.method();
		//같은 패키지라 사용 가능
		//객체를 만들어 사용한것
	}
}
