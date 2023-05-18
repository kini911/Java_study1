package com.yedam.loop;

import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i =1; i<=100;i++) {
			if(i%2 == 0) {
				System.out.println(i);
			}
		}
		
		int i = 1;
		while(i<=100) {
			if(i%2==0) {
				System.out.println(i);
			}
			i++;
		}
		
		//계산기 프로그램
		//무한 루프
		//어떠한 조건 -> 프로그램 종료 -> 두가지
		//1)변수 활용
		
		boolean run = true;
		
		Scanner sc = new Scanner(System.in);
		
		while(run) {
			System.out.println("1. 덧셈 | 2. 뺄셈 | 3. 곱셈 | 4. 종료");
			System.out.println("입력>");
			
			int num = Integer.parseInt(sc.nextLine());
			
			//if, switch(switch문으로 한번 만들어봅시다)
			switch(num) {
			case 1:
				System.out.println("더하고자 하는 두 수 입력");
				System.out.println("1>");
				int num1 = Integer.parseInt(sc.nextLine());
				System.out.println("2>");
				int num2 = Integer.parseInt(sc.nextLine());
				
				System.out.println(num1+"+"+num2+"의 결과"+(num1+num2));
				break;
			case 2:
				System.out.println("빼고자 하는 두 수 입력");
				System.out.println("1>");
				int num3 = Integer.parseInt(sc.nextLine());
				System.out.println("2>");
				int num4 = Integer.parseInt(sc.nextLine());
				
				System.out.println(num3+"-"+num4+"의 결과"+(num3-num4));
				break;
			case 3:
				System.out.println("곱하고자 하는 두 수 입력");
				System.out.println("1>");
				int num5 = Integer.parseInt(sc.nextLine());
				System.out.println("2>");
				int num6 = Integer.parseInt(sc.nextLine());
				
				System.out.println(num5+"*"+num6+"의 결과"+(num5*num6));
				break;
			case 4:
				System.out.println("프로그램 종료");
				run = false;
				break;
			}

		}
		//while문은 true일때만 반복가능함
		//while문의 조건이 4가 아닐때이기(num != 4) 때문에 4를 입력하면 false로 인식되어 반복문 종료됨
		//num < 4도 가능
		int num = 0;
//		while(num != 4)
		while(num < 4) {
			System.out.println("1. 덧셈 | 2. 뺄셈 | 3. 곱셈 | 4. 종료");
			System.out.println("입력>");
			
			num = Integer.parseInt(sc.nextLine());
			if(num == 1) {
				
			}else if(num == 2) {
				
			}else if(num == 3) {
				
			}else if(num == 4) {
				System.out.println("프로그램 종료");
			}
		}
		
		//오락실 만들기
		//오락한번 -> 500원
		//1500원 투입 -> 3번
		System.out.println("===insert coin===");
		int money = Integer.parseInt(sc.nextLine());
		
		while(money >= 500) {
			//몫을 활용해서 게임의 기회 보여줌 => 1500/500 -> 3
			System.out.println((money/500)+"번 기회 남았습니다.");
			System.out.println("1.가위바위보 | 2. UP & DOWN | 3.종료");
			
			System.out.println("메뉴 입력>");
			int gameNo = Integer.parseInt(sc.nextLine());
			
			switch(gameNo) {
			case 1:
				System.out.println("가위바위보 진행");
				money = money - 500;
				break;
			case 2:
				System.out.println("UP & DOWN 진행");
				money = money - 500;
				break;
			default:
				System.out.println("프로그램 종료");
				money = 0;
				break;
			}
		}
		
		//do-while
		int month;
		
		do {
			System.out.println("올바른 월을 입력하세요[1-12]");
			month = Integer.parseInt(sc.nextLine());
		}while(month <1 || month > 12);
		
		System.out.println("사용자가 입력한 월은 "+month);
		
		
		
		
	}

}
