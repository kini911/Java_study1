package com.yedam.exe;

import java.util.Scanner;

import com.yedam.member.MemberService;

public class MemberApp {
	
	Scanner sc= new Scanner(System.in);
	boolean run =true;
	MemberService ms = new MemberService();
	
	
	public MemberApp() {
		start();
	}

	private void start() {
		
		while(run) {
			//로그인 되어 있을때	-> MemberService.memberInfor != null
			//로그인이 안되어 있을때 -> MemberService.memberInfor == null
			if(MemberService.memberInfo != null) {	//로그인이 되어있으면 memberInfo가 널값이 아님
				//로그인 후 메뉴
				loginMenu();
			}else if(MemberService.memberInfo == null) {
				logoutMenu();
			}
		}
	}

	private void logoutMenu() {
		System.out.println("1.로그인 | 2.회원가입 | 3.종료");
		System.out.println("입력>");
		String menu = sc.nextLine();
		if(menu.equals("1")) {
			ms.login();
		}else if(menu.equals("2")){
			ms.insertMember();
		}else if(menu.equals("3")) {
			run = false;
			System.out.println("프로그램 종료");
		}else {
			System.out.println("없는 메뉴 선택!!");
		}
		
	}

	private void loginMenu() {
		//A : admin / N : normal
		if(MemberService.memberInfo.getMemberGrade().equals("A")) {
			//관리자 메뉴
			System.out.println("1. 모든 회원 정보 조회 | 2. 회원 정보 수정 | 3. 회원 삭제 | 4. 로그아웃 | 5. 종료");
			String menu = sc.nextLine();
			switch(menu) {
			case "1":
				ms.getMemberList();
				break;
			case "2":
				ms.updatePhone();
				break;
			case "3":
				ms.deleteMember();
				break;
			case "4":
				ms.logout();
				break;
			case "5":
				run = false;
				System.out.println("프로그램 종료");
				break;
			}
			
			
		}else if(MemberService.memberInfo.getMemberGrade().equals("N")){
			//일반 사용자 메뉴
			System.out.println("1. 내 정보 조회 | 2. 로그 아웃 | 3. 종료");
			String menu = sc.nextLine();
			if(menu.equals("1")) {
				//id는 변함이 없음
				//memberDAO에서 만든 login(id)를 활용해서 데이터를 재조회
				ms.confirmInfo();
			}else if (menu.equals("2")) {
				ms.logout();
			}else if (menu.equals("3")) {
				run = false;
			}else {
				System.out.println("없는 메뉴 입력");
			}
		}
//		System.out.println("1. 로그아웃 | 2. 종료");
//		String menu = sc.nextLine();
//		
//		switch(menu) {
//		case "1":
//			MemberService.memberInfo = null;
//			System.out.println("로그아웃 완료");
//			break;
//		case "2":
//			run = false;
//			System.out.println("프로그램 종료");
//			break;
//		}
		
//		System.out.println(MemberService.memberInfo.getMemberId());
//		System.out.println("로그인 성공!!");
//		String temp = sc.nextLine();
	}
	
}
