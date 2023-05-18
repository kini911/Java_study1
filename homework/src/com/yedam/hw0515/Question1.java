package com.yedam.hw0515;

public class Question1 {
	public static void main(String[] args) {
		System.out.println("---Question 1---");
		EmpDept d1 = new EmpDept();
		d1.name = "이지나";
		d1.salary = 3000;
		d1.deptName = "교육부";
		
		d1.getInformation();
		d1.print();
		
		System.out.println("---Question 2---");
		Human human1 = new StandardWeightInfo();
		
		human1.name = "홍길동";
		human1.weight = 45;
		Human.height = 168;
		human1.getInformation();
		
		human1 = new ObesityInfo();
		human1.name = "박둘이";
		human1.weight = 90;
		Human.height = 168;
		human1.getInformation();
		
		System.out.println("---Question 3---");
		Movie m1 = new Movie("추격자", 7,5);
		m1.setTotalScore(14);
		m1.getGrade(4);
		m1.getInformation();
		
		Performance p1 = new Performance("지킬앤하이드", 9,10);
		p1.setTotalScore(46);
		p1.getGrade(5);
		p1.getInformation();
	}
}
