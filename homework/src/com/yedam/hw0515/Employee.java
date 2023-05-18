package com.yedam.hw0515;

public class Employee {
	String name;
	int salary;
	

	public String getName() {
		return name;
	}


	public int getSalary() {
		return salary;
	}


	public void getInformation() {
		System.out.println("이름 : "+name);
		System.out.println("연봉 : "+salary);
	}
	public void print() {
		System.out.println("수퍼클래스");
	}
}
