package com.yedam.hw0515;

public class EmpDept extends Employee{
	String deptName;

	public String getDeptName() {
		return deptName;
	}
	
	@Override
	public void getInformation() {
		System.out.println("이름 : "+name+"  연봉 : "+salary+"  부서 : "+deptName);
	}
	@Override
	public void print() {
		System.out.println("수퍼클래스\n서브클래스");
	}
}
