package com.yedam.hw0517;

import java.util.Scanner;

public class StringGame {
	
	String answer;
	
	StringGame(){
		int ranNum = (int) ((Math.random()*4)+1);
		switch(ranNum) {
		case 1:
			this.answer="orange";
			break;
		case 2:
			this.answer="game";
			break;
		case 3:
			this.answer="phone";
			break;
		case 4:
			this.answer="smart";
			break;
		}
	}
	public void setCharData() {
		Scanner sc1 = new Scanner(System.in);
		System.out.println("문자하나를 입력하시오>");
		String char1 = sc1.nextLine();
		if (this.answer.indexOf(char1) >= 0){
			System.out.println("해당문자 : "+char1+"은 있습니다.");				
		} else {
			System.out.println("해당문자 : "+char1+"은 없습니다.");
		}
//		for(int i=0;i<answer.length();i++) {
//		}
	}
	public void setStrData() {
		Scanner sc1 = new Scanner(System.in);
		System.out.println("단어를 입력하시오>");
		String str1 = sc1.nextLine();
		for(int i=0;i<answer.length();i++) {
			if (this.answer.substring(i, str1.length()).equals(str1)){
				System.out.println("");				
			} else {
				System.out.println("");
			}
		}
	}
	public void showCharData() {
		
	}
	public void init() {
		
	}
}