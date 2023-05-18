package com.yedam.poly;

public class Tire {
	// 필드
	//타이어의 수명
	public int maxRotation;
	//타이어의 누적 사용횟수
	public int accumulateRotation;
	//타이어의 위치
	public String location;

	// 생성자
	public Tire(String location, int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;
	}

	// 메소드

	public boolean roll() {
		//누적사용횟수를 증가시키는 구문
		++accumulateRotation;
		//수명과 사용횟수를 비교하는 구문
		if (accumulateRotation < maxRotation) {
			System.out.println(location + " Tire 수명 :" + (maxRotation - accumulateRotation) + "회");
			return true;
		}else {
			//타이어 수명이 다된경우
			System.out.println("*** " + location + " Tire 펑크");
			return false;
		}
	}

}
