package com.yedam.abs;

public class Dog extends Animal{
	//추상클래스의 자식클래스는 추상클래스의 추상메소드를 꼭 재정의해야 추상클래스를 상속받을 수 있다.
	//->추상클래스의 자식 클래스들은 무조겉 추상메소드를 재정의해야함!!
	@Override
	public void sound() {
		System.out.println("멍멍");
		
	}
}
