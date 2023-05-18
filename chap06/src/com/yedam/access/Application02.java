package com.yedam.access;

public class Application02 {
	public static void main(String[] args) {
		//인스턴스(객체) 생성
		Student std = new Student();
		//인스턴스 필드 -> 데이터 입력 및 저장
		std.setStdName("김또치");
		std.setMajor("컴퓨터공학과");
		std.setStdGrade("2학년");
		std.setProgramming(-5);
		std.setDatabase(50);
		std.setOs(-50);
		//인스턴스 필드 -> 데이터 얻기 및 읽기
		System.out.println("이름 : "+std.getStdName());
		System.out.println("전공 : "+std.getMajor());
		System.out.println("학년 : "+std.getStdGrade());
		System.out.println("프로그래밍 : "+std.getProgramming());
		System.out.println("데이터베이스 : "+std.getDatabase());
		System.out.println("운영체제 : "+std.getOs());
		
		Member mem1 = new Member();
		
		mem1.setuId("yedam");
		mem1.setuPw("123");
		mem1.setuName("도우너");
		mem1.setuAge(15);
		
		System.out.println("이름 : "+mem1.getuName());
		System.out.println("나이 : "+mem1.getuAge());
		System.out.println("아이디 : "+mem1.getuId());
		System.out.println("비밀번호 : "+mem1.getuPw());
	}
}
