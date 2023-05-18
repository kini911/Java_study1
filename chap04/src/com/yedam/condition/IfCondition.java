package com.yedam.condition;

import java.util.Scanner;

public class IfCondition {
	public static void main(String[] args) {
		int score = 93;

		// if문 한개일때
		if (score >= 90) {
			System.out.println("점수가 90이상이고 등급 A");
		}

		// if문 실행문 한줄일때
		if (score > 90)
			System.out.println("점수가 90이상이고 등급 A");
		System.out.println("스코어 " + score);

		// if-else
		if (score >= 90) {
			System.out.println("점수가 90이상입니다.");
		} else {
			System.out.println("점수가 90미만입니다.");
		}

		if (score >= 90) {
			System.out.println("등급 A");
		} else if (score >= 80) {
			System.out.println("등급 B");
		} else if (score >= 70) {
			System.out.println("등급 C");
		} else {
			System.out.println("등급 D");
		}

		if (score < 70) {
			System.out.println("등급 D");
		} else if (score < 80) {
			System.out.println("등급 C");
		} else if (score < 90) {
			System.out.println("등급 B");
		} else {
			System.out.println("등급 A");
		}

		// random() 값 추출
		// 1)Random() / 2)Math.random()
		// Math.random() -> 실수로 나옴 / 0<=Math.random()<1 : 0 ~ 0.9xxx
		System.out.println(Math.random());
		// 1부터 10사이의 데이터를 랜덤 추출
		// 1) 0 * 10 ~ 1 * 10 * 10
		// 2) 0 ~ 10 / double -> int소수점 삭제
		// 3) (int)0 ~ (int)10
		// 4) (int)0 + 1 ~ (int)10 + 1
		// 5) (int)1 ~ (int)11 --> 1 <= x < 11 (1에서 10까지)

		System.out.println((int) (Math.random() * 10) + 1);

		// 주사위 번호 뽑기
		// 0<=x<1
		// 0*6<= x*6 <1*6
		// (int)0 <= (int)x*6 < (int)6
		// (int)0 +1 <= (int)x*6 +1 < (int)6 +1
		int number = (int) (Math.random() * 6) + 1;
		if (number == 1) {
			System.out.println("주사위 눈 1");
		} else if (number == 2) {
			System.out.println("주사위 눈 2");
		} else if (number == 3) {
			System.out.println("주사위 눈 3");
		} else if (number == 4) {
			System.out.println("주사위 눈 4");
		} else if (number == 5) {
			System.out.println("주사위 눈 5");
		} else {
			System.out.println("주사위 눈 6");
		}
		
		//중첩 if문
		//하나의 데이터를 여러번 조건을 확인할 때
//		if(조건식) {
//			실행문
//			if(조건식) {
//				실행문
//				if(조건식) {
//					실행문
//				}	
//			}	
//		}
		
		int no = 10;
		if(no %2 == 0) {
			if(no %5 == 0) {
				if(no%10 == 0) {
					System.out.println("2의 배수, 5의 배수, 10의 배수");
				}
			}
		}
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("점수 입력>");
		
		score = Integer.parseInt(sc.nextLine());
		//Integer.parseInt -> int로 변환
		
		String grade = "";
		if(score >= 90) {
			if(score >= 95) {
				grade = "A+";
			}else {
				grade = "A";
			}
		}
		
		System.out.println("획득한 학점 : "+grade);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
