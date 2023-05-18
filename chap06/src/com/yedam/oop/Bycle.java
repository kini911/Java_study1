package com.yedam.oop;

public class Bycle {
	//필드
	int gas;
	//생성자
	
	//메소드
	void setGas(int gas) {
		this.gas = gas;
	}
	
	boolean isLeftGas() {	//boolean이 반환할 리턴값은 T F밖에 없음
		if(gas==0) {
			System.out.println("gas가 없습니다");
			return false;
		}
		System.out.println("gas가 있습니다");
		return true;
	}
	
	void run() {
		while(true) {
			if(gas>0) {
				System.out.println("달립니다.(gas잔량 :"+gas+")");
				gas -= 1;
			}else {
				System.out.println("멈춥니다.(gas잔량 :"+gas+")");
				return;	//void는 리턴값이없음 ->ruturn;문으로 void를 강제 종료
			}
		}
	}
}
