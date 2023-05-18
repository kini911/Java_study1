package com.yedam.oop;

public class Book {
	//Book이라는 클래스는 아래의 정보를 가진다.
	//책이름, 책종류, 가격, 출판사, 도서번호 
	//필드
	String bName;
	String bKind;
	String bPrice;
	String bPublisher;
	String bNumber;
	//생성자는 2개
	//기본 생성자
	//모든 데이터를 받아오는 생성자
	Book(){
		
	}
	Book(String bName, String bKind, String bPrice, String bPublisher,	String bNumber){
		this.bName = bName;
		this.bKind = bKind;
		this.bPrice = bPrice;
		this.bPublisher = bPublisher;
		this.bNumber = bNumber;
	}
	//메소드 
	//모든 정보를 출력할 수 있는 getInfo()
	void getInfo() {
		System.out.println("책 이름 : "+ bName);
		System.out.println("# 내용");
		System.out.println("1) 종류 : "+ bKind);
		System.out.println("2) 가격 : "+ bPrice);
		System.out.println("3) 출판사 : "+ bPublisher);
		System.out.println("4) 도서번호 : "+ bNumber);
	}
	//객체 생성할때, 생성자를 통한 필드 초기화
	//다음과 같은 출력물 나오도록 구현
	//객체.getInfo() -> 아래 내용이 나오게
	//책 이름 : 혼자 공부하는 자바
	//#내용
	//1)종류 : 학습서
	//2)가격 : 24000원
	//3)출판사 : 한빛 미디어
	//4)도서번호 :0001
	
	//책 이름 : 자바스크립트
	//#내용
	//1)종류 : 학습서
	//2)가격 : 15000원
	//3)출판사 : 어포스트
	//4)도서번호 :0002
		
}
