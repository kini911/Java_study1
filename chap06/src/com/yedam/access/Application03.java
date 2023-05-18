package com.yedam.access;

public class Application03 {
	public static void main(String[] args) {
						//하나의 객체를 외부로 전달
		//중요한 기능이면서 자주 쓰는 기능 -> singleton 활용
		Singleton s1 = Singleton.getInstance();
		
		Singleton s2 = Singleton.getInstance();	
		
		System.out.println(s1==s2);
		
		s1.age = 100;
		s1.name = "고길동";
		
		System.out.println(s2.age);
		System.out.println(s2.name);
		
		Member member = new Member();
		
		member.instance();
		//member클래스에서 메소드안에 싱글톤을 생성해놓으면 멤버클래스의 인스턴스 메소드를 이용해서 싱글톤 작동 가능 
//		System.out.println((int)((Math.random()*6)+1));
	}
}
