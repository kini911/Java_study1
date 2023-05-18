package com.yedam.oop;

import java.util.Scanner;

public class Application04 {
	public static void main(String[] args) {
		//참조 배열
		String[] strAry = new String[3];
		strAry[0] = "첫번째";
//		strAry[1] = "두번째";
		//strAry의 인덱스 1,2번에는 null값 들어가있음 
		
		//객체배열
		//Book Class
		Book[] bookAry = new Book[10];
		
		//객체를 생성해서 저장
		Book b1 = new Book("혼자 공부하는 자바","학습서","24000원","한빛 미디어","0001");
		//(변수생성후 변수를 배열에 저장)
		bookAry[0] = b1;
		//b1->주소값이 됨
		//bookAry[0] -> b1이면서 주소값이됨
		System.out.println(b1);
		System.out.println(bookAry[0]);
		
		b1.getInfo();
		bookAry[0].getInfo();
		
		//배열의 공간에 바로 객체 생성
		bookAry[1] = new Book("자바스크립트", "학습서","15000원","어포스트","0002");

//		Book b2 = new Book("자바스크립트", "학습서","15000원","어포스트","0002");

		
		//객체배열
		//책들의 정보를 저장하는 프로그램
		//1. 책이 몇권인지 데이터 입력받기
		//2. 책 정보 입력하기
		//3. 책 정보 확인
		//4. 종료
		
		//책 정보를 보관하는 배열 만들기
		Book[] bookAry2 = null;
		
		//책 몇권인지 받아오는 변수]
		int bookNum = 0;
		
		//데이터 입력을 받을 수 있는 스캐너 만들기
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("=======================================");
			System.out.println("1.책 수 | 2. 책 입력 | 3. 정보확인 | 4. 종료");
			System.out.println("=======================================");
			
			String selectNo = sc.nextLine();
			if(selectNo.equals("1")) {
				//데이터 입력 -> 배열 -> 크기
				System.out.println("책 수>");
				bookNum = Integer.parseInt(sc.nextLine());
				
			}else if(selectNo.equals("2")) {
				bookAry2 = new Book[bookNum];
				//책 정보 입력
				for(int i=0;i<bookAry2.length;i++) {
					//객체를 생성하고 배열에 저장
					Book book = new Book();
					//반복문에서 클래스 생성자를 사용하면 다른 번지(새로운 객체)의 book이 계속 생성됨
					System.out.println("책 제목>");
					book.bName = sc.nextLine();
					System.out.println("책 종류>");
					book.bKind = sc.nextLine();
					System.out.println("책 가격>");
					book.bPrice = sc.nextLine();
					System.out.println("책 도서번호>");
					book.bNumber = sc.nextLine();
					System.out.println("책 출판사>");
					book.bPublisher = sc.nextLine();
					//bookAry2의 각 위치마다 생성한 객체를 저장
					bookAry2[i] = book;
				}
			}else if(selectNo.equals("3")) {
				//모든 책 정보를 확인
				for(int i=0;i<bookAry2.length;i++) {
					System.out.println((i+1)+"번째 책 정보====");
					bookAry2[i].getInfo();
					System.out.println();
				}
			}else if(selectNo.equals("4")) {
				System.out.println("프로그램 종료");
				break;
			}else {
				System.out.println("없는 번호 입력!!");
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
