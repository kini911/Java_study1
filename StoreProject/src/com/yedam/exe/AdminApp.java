package com.yedam.exe;

import java.util.Scanner;

import com.yedam.product.ProductService;
import com.yedam.reviewlist.ReviewListService;
import com.yedam.storemember.MemberService;

public class AdminApp {
	
	MemberService ms = new MemberService();
	ProductService ps = new ProductService();
	ReviewListService rls = new ReviewListService();
	
	Scanner sc = new Scanner(System.in);
	
	public AdminApp() {
		run();
	}

	private void run() {
		boolean flag = true;
		while(flag) {
			System.out.println("=================================================================================");
			System.out.println("1.회원정보 관리 | 2. 판매물품 관리 | 3. 리뷰 관리 | 4. 로그아웃");
			int selNo = Integer.parseInt(sc.nextLine());
			switch(selNo) {
			case 1:
				mngMember();
				break;
			case 2:
				mngProduct();
				break;
			case 3:
				mngReview();
				break;
			case 4:
				if (MemberService.memberInfo != null) {
					MemberService.memberInfo = null;
				}
				flag = false;
				System.out.println("로그아웃 완료");
				break;
			}
		}
	}

	private void mngReview() {
		boolean flag = true;
		while(flag) {
			System.out.println("=================================================================================");
			System.out.println("1. 전체/제품별 리뷰검색 | 2. 리뷰/평점 삭제 | 3. 뒤로가기");
			int selNo = Integer.parseInt(sc.nextLine());
			switch(selNo) {
			case 1:
				rls.showBuyesProduct();
				break;
			case 2:
				rls.deleteReviewScore();
				break;
			case 3:
				flag = false;
				break;
			}
		}
		
	}

	//판매물품 관리
	private void mngProduct() {
		boolean flag = true;
		while(flag) {
			System.out.println("=================================================================================");
			System.out.println("1. 판매물건 조회 | 2. 판매물건 등록 | 3. 판매물건 수정 | 4.판매물건 삭제 | 5. 뒤로가기");
			int selNo = Integer.parseInt(sc.nextLine());
			switch(selNo) {
			case 1:
				ps.sellProductList();
				break;
			case 2:
				ps.regitProduct();
				break;
			case 3:
				ps.updatePro();
				break;
			case 4:
				ps.deletePro();
				break;
			case 5:
				flag = false;
				break;
			}
		}
	}

	private void mngMember() {
		boolean flag = true;
		while(flag) {
			System.out.println("=================================================================================");
			System.out.println("1. 회원 조회 | 2. 회원정보 수정 | 3. 회원 삭제 | 4. 뒤로가기");
			int selNo = Integer.parseInt(sc.nextLine());
			switch(selNo) {
			case 1:
				chMemberList();
				break;
			case 2:
				updateMemberInfo();
				break;
			case 3:
				ms.deleteMember();
				break;
			case 4:
				flag = false;
				break;
			}
		}
		
	}

	private void updateMemberInfo() {
		boolean flag = true;
		while(flag) {
			System.out.println("=================================================================================");
			System.out.println("1. 회원비밀번호 수정 | 2. 회원연락처 수정 | 3. 회원주소 수정 | 4. 뒤로가기");
			int selNo = Integer.parseInt(sc.nextLine());
			switch(selNo) {
			case 1:
				ms.updateMemberPw();
				break;
			case 2:
				ms.updateMemberPhone();
				break;
			case 3:
				ms.updateMemberAddr();
				break;
			case 4:
				flag = false;
				break;
			}
		}
		
	}

	private void chMemberList() {
		boolean flag = true;
		while(flag) {
			System.out.println("=================================================================================");
			System.out.println("1. 전체회원 조회 | 2. 구매자회원 조회 | 3. 판매자회원 조회 | 4. 뒤로가기");
			int selNo = Integer.parseInt(sc.nextLine());
			switch(selNo) {
			case 1:
				ms.getMemberList(selNo);
				break;
			case 2:
				ms.getMemberList(selNo);
				break;
			case 3:
				ms.getMemberList(selNo);
				break;
			case 4:
				flag = false;
				break;
			}
		}
	}
}
