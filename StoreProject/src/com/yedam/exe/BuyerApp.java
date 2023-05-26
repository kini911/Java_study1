package com.yedam.exe;

import java.util.Scanner;

import com.yedam.product.ProductService;
import com.yedam.reviewlist.ReviewListService;
import com.yedam.storemember.MemberService;

public class BuyerApp {

	Scanner sc = new Scanner(System.in);
	ProductService ps = new ProductService();
	MemberService ms = new MemberService();
	ReviewListService rls = new ReviewListService();

	public BuyerApp() {
		boolean flag = true;
		while (flag) {
			System.out.println("=================================================================================");
			System.out.println("1. 판매 물품 조회 | 2. 회원 정보 관리 | 3. 구매 내역 관리 | 4. 로그아웃");
			int selNo = Integer.parseInt(sc.nextLine());
			if (selNo == 1) {
				ps.sellProductList();
				break;
			} else if (selNo == 2) {
				ms.memInfo();
				break;
			} else if (selNo == 3) {
				rls.buyListInfo();
			} else if (selNo == 4) {
				if (MemberService.memberInfo != null) {
					MemberService.memberInfo = null;
				}
				System.out.println("로그아웃 성공");
				flag = false;
				break;
			}
		}
	}
	

}
