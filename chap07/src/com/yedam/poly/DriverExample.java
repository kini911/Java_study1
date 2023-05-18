package com.yedam.poly;

public class DriverExample {
	public static void main(String[] args) {
		Driver driver = new Driver();
		//첫번째 방식
		Taxi taxi = new Taxi();
		driver.drive(taxi);
		//두번째 방식 - Taxi taxi = new Taxi();를 지우는 것 -> 받아줄 변수를 안쓰고 바로 driver메소드에 매개변수를 입력
		driver.drive(new Bus());
		//			new Bus자체가 번지수를 가진 매개변수임
	}
}
