package com.yedam.print;

import java.io.IOException;
import java.util.Scanner;

public class KeyCode {
	public static void main(String[] args) throws IOException {
		//keyCode->하나의 문자만 받아 올 때
		System.out.println("입력>");
		
		int keyCode = 0;
		
		keyCode = System.in.read();
		System.out.println("KeyCode : "+ keyCode);
		keyCode = System.in.read();
		System.out.println("KeyCode : "+ keyCode);
		keyCode = System.in.read();
		System.out.println("KeyCode : "+ keyCode);
		
		//Scanner
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("입력>");
		//문자열 읽기
		//nextLine : 문자열 읽기
		//특이한 성격:엔터키 이전까지 데이터를 받아옴
		//		  :엔터키 기준으로 데이터를 읽어 옴
		String inputData = scanner.nextLine();
		//정수 읽기
		int data = scanner.nextInt();
		//밑에 상황 후 scanner.nextLine입력해서 엔터키  소멸시킴
		scanner.nextLine();
		
		inputData = scanner.nextLine();
		//문자열 입력 후 정수 입력후 다음데이터를 입력하려고 해도 콘솔창에 프린트가 먼저뜸
		//(nextLine은 엔터를 기준으로 데이터를 읽어오는데 정수 입력후 엔터하면 inputData에 빈 데이터가 들어감)
		System.out.println("Scanner 활용 => " + inputData);
		
		//데이터 비교 -> 입력한 값 == 저장된 값 비교
		
		//기본타입 (정수, 실수 비교는 == 사용)
		//문자열 -> equals를 사용해야함
		if(inputData.equals("yedam")) {
			System.out.println("yedam과 일치합니다.");
		} else {
			System.out.println("yedam과 불일치합니다.");
		}
		
		
		
		
		
		
		
		
		
	}
}
