package com.yedam.API;

import java.util.Date;
import java.util.Random;

public class SystemExample {
	public static void main(String[] args) {
		//System클래스
		//강제 종료 : System.exit(0);
		
//		for(int i =0;i<=10;i++) {
//			System.out.println(i);
//			if(i==5) {
//				System.exit(0);
//				//강제종료!!
//				//프로그램 종료라는 구문은 출력되지않음 -> 시스템 강제종료를 사용했기 때문
//				//위험하니까 쓰지말라고 알려주는거임
//				//!!SO DANGEROUS!!
//			}
//		}
//		System.out.println("프로그램 종료");
		
		//현재 시간 읽기
		//소요시간(끝나는 시간 - 시작 시간 = 소요 시간)
		long time = System.nanoTime();	//시작시간
		//프로그램이 실행하는 순간의 시간
		
		int sum =0;
		
		for(int i = 0; i<=1000000;i++) {
			sum+=i;
		}
		long time2 = System.nanoTime();
		
		System.out.println(time);
		System.out.println(time2);
		System.out.println("1~1000000의 합 : "+sum);
		System.out.println("소요 시간 : "+(time2-time)+"나노 초 소요");
		//이렇게 초로 쪼개져 있는 시간을 사용하는 이유 : 중복되지 않은 데이터 구할 때(읽어 올 때) 사용
		System.out.println("현재 시간 : "+System.currentTimeMillis());
		//random(seed) ->random값을 가져옴
		//random(System.currentTimeMillis()) -> 시간은 중복되지 않기 때문에 중복값없는 랜덤값을 가져올 수 있음
		Date date = new Date();
		System.out.println(date);
		
		Random r = new Random(System.currentTimeMillis());
		//Random() -> 뒤에 들어가는 매개변수에 따라 값이 바뀜 -> 겹치지 않는 데이터를 넣으면 완전한 랜덤값이 나옴
		System.out.println(r.nextInt());
		
	}
}
