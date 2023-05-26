package com.yedam.exe;

import java.util.Scanner;

import com.yedam.product.ProductService;
import com.yedam.storemember.Member;
import com.yedam.storemember.MemberDAO;
import com.yedam.storemember.MemberService;

public class StoreApp {
	
	Scanner sc = new Scanner(System.in);
	ProductService ps = new ProductService();
	MemberService ms = new MemberService();
	public StoreApp() {
		menu();
	}
	
	private void menu() {
		boolean flag = true;
		while(flag) {	
			if(MemberService.memberInfo==null) {
				System.out.println("1. 회원가입 | 2. 로그인 | 3. 종료");
				int menu = Integer.parseInt(sc.nextLine());
				if(menu==1) {
					ms.insertMember();
				}else if(menu==2) {
					//로그인 기능
					ms.login();
				}else if(menu==3) {
					System.out.println("프로그램 종료");
					flag = false;
					break;
				}else {
					System.out.println("잘못된 번호입니다.");
				}
			}else if(MemberService.memberInfo != null) {
				if(MemberService.memberInfo.getMemberAuth().equals("B")) {
					new BuyerApp();
				}else if(MemberService.memberInfo.getMemberAuth().equals("S")){
					new SellerApp();
				}else if(MemberService.memberInfo.getMemberAuth().equals("A")) {
					new AdminApp();
				}
			}
		}
	}
	
	
//	private void menu() {
//		boolean flag = true;
//		while(flag) {
//		System.out.println("1.회원 가입 | 2. 로그인 | 3. 종료");
//		System.out.println("메뉴 선택>");
//		String selNo = sc.nextLine();
//			switch(selNo) {
//			case "1":
//				ms.insertMember();
//				break;
//			case "2":
//				ms.login();
//				
//				break;
//			case "3":
//				flag = false;
//				break;
//			}
//		}
//		
//	}

	
}
