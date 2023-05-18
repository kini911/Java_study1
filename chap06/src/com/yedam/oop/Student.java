package com.yedam.oop;

public class Student {
	//학생의 정보를 관리하는 객체
	//이름, 학년, 국어, 영어, 수학 점수
	String name;
	int grade;
	int korean;
	int english;
	int math;
	//기본 생성자만 가짐
	
	//메소드
	//모든 정보를 출력 getInfo()
	void getInfo() {
		System.out.println("학생 이름 : "+ name);
		System.out.println("1) "+grade+"학년");
		System.out.println("2) 국어 점수 : "+ korean);
		System.out.println("2) 영어 점수 : "+ english);
		System.out.println("2) 수학 점수 : "+ math);
	}
}
