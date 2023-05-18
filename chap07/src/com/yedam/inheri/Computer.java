package com.yedam.inheri;

public class Computer extends Calculator{

	@Override	//어노테이션(@) -> 자바한테 나 재정의한 내용있으니까 알려주는것(빼도 상관은 없지만 명시해놓는것)
				//이름이 같은게 있기 때문에(재정의) 자바 컴파일러에게 미리 알려주는것 ->오버라이딩뿐만 아니라 다른데에도 사용 가능
	double areaCircle(double r) {
		System.out.println("Computer 객체의 메소드 실행");
		return Math.PI*r*r;
	}
}
