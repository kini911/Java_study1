package com.yedam.exe;

import java.util.Scanner;

import com.yedam.departments.DepartmentService;
import com.yedam.employees.EmployeesService;

public class Application {
	
	//run메소드 안에서 메뉴 선택 용도
	int selectNo = 0;
	Scanner sc = new Scanner(System.in);
	
	//생성자
	public Application() {
		run();
	}
	
	//메소드
	private void run() {
		
		while(selectNo != 3) {
			menu();
			
			switch(selectNo) {
			case 1:
				employees();
				//employees
				break;
			case 2:
				departments();
				break;
			case 3:
				System.out.println("프로그램 종료");
				break;
			}
		}
	}
	
	private void departments() {
		//department 정보
		int departmentMenu = 0;
		DepartmentService ds = new DepartmentService();
		while(departmentMenu !=4) {
			System.out.println("==================================");
			System.out.println("1. 모든부서조회 2. 부서조회 3. 등록 4. 종료");
			System.out.println("==================================");
			System.out.println("입력>");
			departmentMenu = Integer.parseInt(sc.nextLine());
			switch(departmentMenu) {
			case 1:
				ds.getDepartmentsList();
				break;
			case 2:
				ds.getDepartment();
				break;
			case 3:
				ds.insertDept();
				break;
			case 4:
				System.out.println("부서 조회 종료!");
				break;
			}
		}
	}

	private void employees() {
		//employees CRUD 진행하는 메소드
		int employeesMenu = 0;
		EmployeesService es = new EmployeesService();
		while(employeesMenu !=4) {
			System.out.println("==================================");
			System.out.println("1. 모든사원조회 2. 사원조회 3. 등록 4. 종료");
			System.out.println("==================================");
			System.out.println("입력>");
			employeesMenu = Integer.parseInt(sc.nextLine());
			switch (employeesMenu) {
			case 1:
				es.getEmployeesList();
				break;
			case 2:
				es.getEmployee();
				break;
			case 3:
				es.insertEmp();
				break;
			case 4:
				System.out.println("사원 조회 종료~");
				break;
			}
		}
	}

	private void menu() {
		System.out.println("=======회사 정보 프로그램=======");
		System.out.println("=1.사원     2.부서     3. 종료=");
		System.out.println("===========================");
		System.out.println("입력>");
		selectNo = Integer.parseInt(sc.nextLine());
	}
	
}
