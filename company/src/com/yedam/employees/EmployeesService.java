package com.yedam.employees;

import java.sql.Date;
import java.util.List;
import java.util.Scanner;

public class EmployeesService {
	//실행(데이터 입력 실행) <-> (중재역할하는 클래스페이지) 데이터를 가공해줌(데이터 입력,데이터 출력) <-> DB(DAO)
	Scanner sc = new Scanner(System.in);
	//전체조회
	public void getEmployeesList() {
		List<Employees> list = EmployeesDAO.getInstance().getEmployeesList();
		//									싱글톤이 가진 객체.EmployeesList메소드
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i).toString());
		}
	}
	
	public void getEmployee() {
		System.out.println("사번 입력>");
		int empId = Integer.parseInt(sc.nextLine());
		Employees emp = EmployeesDAO.getInstance().getEmployee(empId);
		
		if(emp != null) {	//데이터가 조회 되었을 경우
			System.out.println("emplyeeID : "+emp.getEmployeeId());
			System.out.println("lastName : "+emp.getLastName());
			System.out.println("email : "+emp.getEmail());
			System.out.println("hireDate : "+emp.getHireDate());
			System.out.println("jobId : "+ emp.getJobId());
		}else {	//데이터 조회가 안된 경우
			System.out.println("존재하지 않는 사번 입니다.");
		}
	}
	
	public void insertEmp() {
		Employees emp = new Employees();
		
		System.out.println("===사원등록===");
		
		System.out.println("사번>");
		emp.setEmployeeId(Integer.parseInt(sc.nextLine()));
		System.out.println("이름>");
		emp.setLastName(sc.nextLine());
		System.out.println("이메일>");
		emp.setEmail(sc.nextLine());
		System.out.println("입사일>");
		emp.setHireDate(Date.valueOf(sc.nextLine()));
		System.out.println("직책>");
		emp.setJobId(sc.nextLine());
		
		int result = EmployeesDAO.getInstance().insertEmp(emp);
		
		if(result>0) {
			System.out.println("사원 입력 완료");
		}else {
			System.out.println("사원 입력 실패");
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
