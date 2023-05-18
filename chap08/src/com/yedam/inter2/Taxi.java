package com.yedam.inter2;

public class Taxi implements Vehicle{

	@Override
	public void run() {
		System.out.println("택시가 달립니다.");
	}
	public void checkFare() {
		System.out.println("택시승차 요금 확인");
	}
}
