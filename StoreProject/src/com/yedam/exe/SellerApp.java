package com.yedam.exe;

import java.util.Scanner;

import com.yedam.product.ProductService;
import com.yedam.reviewlist.ReviewListService;
import com.yedam.storemember.MemberService;

public class SellerApp {

	Scanner sc = new Scanner(System.in);
	ProductService ps = new ProductService();
	MemberService ms = new MemberService();
	ReviewListService rls = new ReviewListService();

	public SellerApp() {
		run();
	}

	private void run() {
		boolean flag = true;
		while (flag) {
			System.out.println("=================================================================================");
			System.out.println("1. 판매 물품 조회 | 2. 회원 정보 관리 | 3. 구매 내역 관리 | 4. 판매중인 제품 관리 | 5. 로그아웃");
			System.out.println();
			int selNo = Integer.parseInt(sc.nextLine());
			if (selNo == 1) {
				ps.sellProductList();
				break;
			} else if (selNo == 2) {
				ms.memInfo();
				break;
			} else if (selNo == 3) {
				rls.buyListInfo();
				break;
			} else if (selNo == 4) {
				productMngMenu();
				break;
			} else if (selNo == 5) {
				if (MemberService.memberInfo != null) {
					MemberService.memberInfo = null;
				}
				System.out.println("로그아웃 성공");
				flag = false;
				break;
			}
		}
	}
	
	private void productMngMenu() {
		boolean flag = true;
		while(flag) {
			System.out.println("=================================================================================");
			System.out.println("1. 판매등록 물품 조회 | 2. 판매물품 등록 | 3. 판매등록 물품 수정 | 4. 판매등록 물품 삭제 | 5. 뒤로가기");
			System.out.println("메뉴 선택>");
			int selNo = Integer.parseInt(sc.nextLine());
			switch(selNo) {
			case 1:
				ps.sellerProInfo();
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



}
