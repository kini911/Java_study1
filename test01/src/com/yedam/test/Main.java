package com.yedam.test;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		//문제1
		int num1 = 10;
		double num2 = 2.0;
		System.out.println("문제1)");
		System.out.println((int)(num1+num2));
		System.out.println((int)(num1-num2));
		System.out.println((int)(num1*num2));		
		System.out.println((int)(num1/num2));
		
		//문제2
		//(1)false
		//(2)true
		//(3)false
		
		//문제3
		//큰 금액부터 동전을 우선적으로 거슬러 줘야한다.
		System.out.println("문제3)");
		int[] CoinUnit = {500,100,50,10};
		int money = 2680;
		System.out.println("money="+money);
		for (int i=0;i<CoinUnit.length;i++) {
			if(CoinUnit[i]==10) {
				int count = 0;
				count = (money/CoinUnit[i]);
				System.out.println(CoinUnit[i]+"원 : "+count+"개");
				money = money-(count*CoinUnit[i]);
			}else {
				int count = 0;
				count = (money/CoinUnit[i]);
				System.out.print(CoinUnit[i]+"원 : "+count+"개, ");
				money = money-(count*CoinUnit[i]);				
			}
		}
		//문제4
		//구구단을 단보다 곱하는 수가 작거나 같은 경우까지만 출력하는 프로그램을 작성해보세요
		System.out.println("문제4) 구구단의 단수보다 곱하는수가 작거나 같은 경우만 출력");
		for (int i = 2; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				if(i>=j) {
				System.out.println(i + "*" + j + "=" + (i * j));
				}else {
					break;
				}
			}
		}
		//문제5
		Scanner sc = new Scanner(System.in);
		int diceNum = 0;
		int[] diceRoll = {};
		while(true){
			System.out.println("===1.주사위 크기 2.주사위 굴리기 3.결과보기 4.가장 많이 나온 수 5.종료===");
			System.out.println("메뉴 >");
			int selNum = Integer.parseInt(sc.nextLine());
			
			if(selNum == 1) {
				System.out.println("주사위 크기");
				diceNum = Integer.parseInt(sc.nextLine());					
				if(diceNum<=10 & 5<=diceNum) {
					
				}else {
					diceNum = 0;
					System.out.println("주사위 크기의 범위가 5~10이 아닙니다. 다시 입력하세요");
				}
			}else if(selNum == 2) {
				int dice5Count = 0;
				for(int i=0;i>1;i++) {
					i=(int)((Math.random()*diceNum)+1);
					diceRoll[i]=i;
					dice5Count++;
					if(diceRoll[i]==5) {
						break;
					}
				}
				System.out.println("5가 나올때까지 주사위를 "+dice5Count+"번 굴렸습니다.");
				System.out.println(Arrays.toString(diceRoll));
			}else if(selNum == 3) {
				int[] counter = new int[6];
				for(int i=0;i<diceRoll.length;i++) {
					if(diceRoll[i]!=0) {
						counter[i] = counter[diceRoll[i]-1]+1;												
					}
				}
				System.out.println(Arrays.toString(counter));
				for(int i =0;i<counter.length;i++) {
					for(int j=0;j<counter[i];j++) {
						
						System.out.print((i+1)+"은 "+counter[i]+"번 나왔습니다.");
					}
				}
			}else if(selNum == 4) {
				
			}else if(selNum == 5) {
				System.out.println("프로그램 종료");
			}else {
				System.out.println("번호를 잘못 입력하셨습니다.");
			}
		}
		
	}
}
