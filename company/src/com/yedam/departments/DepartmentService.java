package com.yedam.departments;

import java.util.List;
import java.util.Scanner;

public class DepartmentService {
	Scanner sc = new Scanner(System.in);
	//전체조회
	public void getDepartmentsList() {
		List<Departments> list = DepartmentsDAO.getInstance().getDepartmentsList();
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i).toString());
		}
	}
	
	//단건조회
	public void getDepartment() {
		System.out.println("부서번호 입력>");
		int deptId = Integer.parseInt(sc.nextLine());
		Departments dept = DepartmentsDAO.getInstance().getDepartment(deptId);
		
		if(dept != null) {
			System.out.println("부서번호 : "+dept.getDeptId());
			System.out.println("부서이름 : "+dept.getDepartmentName());
			System.out.println("위치번호 : "+dept.getLocationId());
		}else {
			System.out.println("존재하지않는 부서 번호 입니다.");
		}
	}
	
	//데이터등록
	public void insertDept() {
		Departments dept = new Departments();
		
		System.out.println("===부서 등록===");
		System.out.println("부서번호>");
		dept.setDeptId(Integer.parseInt(sc.nextLine()));
		System.out.println("부서이름>");
		dept.setDepartmentName(sc.nextLine());
		System.out.println("위치번호>");
		dept.setLocationId(Integer.parseInt(sc.nextLine()));
		
		int result = DepartmentsDAO.getInstance().insertDept(dept);
		
		if(result>0) {
			System.out.println("부서 입력 완료");
		}else {
			System.out.println("부서 입력 실패");
		}
	}
	
}
