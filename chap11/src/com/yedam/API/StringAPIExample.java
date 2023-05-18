package com.yedam.API;

import java.util.Scanner;

public class StringAPIExample {
	public static void main(String[] args) {
		// 예제1
		// 문자열뒤집기
		// String str = "abcdefg" -> "gfedcba"
		
		//직접풀이
//		String str1 = "abcdef";
//		String str2 = "";
//		for(int i=0;i<str1.length();i++) {
//			str2 += str1.charAt(str1.length()-1-i);
//		}
//		System.out.println(str2);
		
		//풀이
		String str = "abcdef";
		for(int i=str.length()-1;i>=0;i--) {
			System.out.print(str.charAt(i));
		}
		System.out.println();
		
		
		// 예제2
		// 문자 개수 찾기
		// 예시)String str = "1n2ASD 330naa1"
		// 숫자 : 6개 알파벳 : 7개 공백(띄어쓰기) : 1개
		
		//직접 풀이
//		String str3 = "1n2ASD 330naa1";
//		byte[] byte1 = str3.getBytes();
//		
//		int cap = 0;
//		int num = 0;
//		int space = 0;
//		
//		for(byte word : byte1) {
//			if(word>=65 && word<=90) {
//				cap++;
//			}else if(word>=97 && word<= 122) {
//				cap++;
//			}else if(word>=48 && word <=57) {
//				num++;
//			}else if(word>=32 && word<= 32) {
//				space++;
//			}
//		}
//		System.out.println("숫자 : "+num+", 알파벳 : "+cap+", 공백 : "+space);
		
		//풀이
		String str3 = "1n2ASD 330naa1";
		int alpha = 0, num = 0, space = 0;
		for (int i = 0; i < str3.length();i++) {
			//문자열 읽기
			char tempCh = str3.charAt(i);
			if(tempCh == ' ') {
				space++;
			}else if(tempCh>='0' && tempCh<='9') {
				num++;
			}else if(tempCh>='A' && tempCh<='Z'||tempCh>='a' && tempCh<='z') {
				alpha++;
			}
		}
		System.out.println("숫자 : "+num+", 알파벳 : "+alpha+", 공백 : "+space);
		
		
		
		// 예제3
		// 주민등록번호 입력 후 나이 계산하기
		// 단, 00~23년생 -> 21세기 / 24~99년생 -> 20세기
		// 예시) String ssn = "980102-12354567"
		// 나이 : 26
		// String ssn1 = "000102-1234567"
		// 나이 : 24
		
		//직접 풀이
		String ssn = "910102-12354567";
		int age = Integer.parseInt(ssn.substring(0,2));
		if(age<24) {
			System.out.println(24-age);
		}else if(age<=99) {
			System.out.println(124-age);
		}
		
		Scanner sc = new Scanner(System.in);
		System.out.println("생년월일>");
		String birth = sc.nextLine();
		int birthNo = Integer.parseInt(birth.substring(0, 2));
		if(birthNo<=23) {
			System.out.println(24-birthNo+"살");
		}else if(birthNo<=99) {
			System.out.println(124-birthNo+"살");
		}
		
		//4)문자열 개수 파악 or 압축
		//String str = "KKHSSSSSSSSE"
		
		//풀이
		String str4 = "KKHSSSSSSSSE";
		String result = "";
		int count = 1;
		for(int i=0;i<str4.length();i++) {
			//문자비교
			if(i<str4.length()-1 && str4.charAt(i)==str4.charAt(i+1)) {
				count++;
			}else {
				result += str4.charAt(i);
				result += String.valueOf(count);
				count = 1;
			}
		}
		System.out.println(result);
	}
}
