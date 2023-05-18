package com.yedam.hw0517;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StringGame2 {
	
	//필드와 리스트 생성
	private String[] strData = { "Orange", "Game", "Phone", "Smart" };
	private String strAnswer;
	// 랜덤으로 뽑은 단어중에 입력한 문자에 존재하면 list에 담는다.
	private List<Character> charData;
	
	//생성자
	public StringGame2() {
		init();
	}
	
	//메소드
	public void setCharData() {
		showStrData();
		// list의 길이와 문자열의 길이가 같다면, 단어가 가진 문자는 다 찾았다.
		if (charData.size() == strAnswer.length()) {
			System.out.println("문자열을 구성하는 문자를 다 입력했습니다");
		} else {
			//문자열의 길이와 리스트의 길이가 다르면 데이터를 입력받는다.
			String inputStr = inputData();
			//-1이 아니다 -> 포함이 되어ㅇ있다
			if(strAnswer.indexOf(inputStr.charAt(0))!= -1) {
				System.out.println("문자열을 구성하는 문자입니다.");
				charData.add(inputStr.charAt(0));
			}else {
				System.out.println("문자열을 구성하는 문자가 아닙니다.");
			}
		}

	}

	public void showStrData() {
		// TODO Auto-generated method stub
		System.out.println("형재까지 확인된 문자열의 문자들은 다음과 같습니다.");
		//두가지 for문은 같은 역할을 함! 첫번째는 향상된 for문, 두번째는 일반적인 for문
//		for(char data :charData) {
//			System.out.println(data+" ");
//		}
		for(int i = 0;i<charData.size();i++) {
			System.out.print(charData.get(i)+ " ");
		}
		System.out.println();
	}

	private String inputData() {
		// TODO Auto-generated method stub
		System.out.println("입력값>");
		return new Scanner(System.in).next().toLowerCase();
	}

	public void setStrData() {
		showStrData();
		
		String inputStr = inputData();
		if(strAnswer.equals(inputStr)) {
			System.out.println("정답입니다.");
		}else {
			showStrData(inputStr);
		}
	}

	private void showStrData(String inputStr) {
		// TODO Auto-generated method stub
		if(strAnswer.length()==inputStr.length()) {
			for(int i=0;i<strAnswer.length();i++) {
				if(strAnswer.charAt(i)==inputStr.charAt(i)) {
					System.out.print("O ");
				}else {
					System.out.print("X ");
				}
			}
			System.out.println();
		}else {
			System.out.println("입력된 문자열의 길이가 정답과 다릅니다.");
		}
	}

	public void showCharData() {
		showStrData();
	}

	public void init() {
		//랜덤 단어
		strAnswer = getStrAnswer();
		//입력한 내역 초기화
		charData = new ArrayList<>();
	}

	private String getStrAnswer() {
		// TODO Auto-generated method stub
		int idx = (int)(Math.random()*4);
		String str = strData[idx].toLowerCase();
		return str;
	}
	
	
	
	
	
}