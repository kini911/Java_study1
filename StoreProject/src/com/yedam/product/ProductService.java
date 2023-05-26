package com.yedam.product;

import java.util.List;
import java.util.Scanner;

import com.yedam.reviewlist.ReviewListService;
import com.yedam.storemember.MemberService;

public class ProductService {
	
	public static Product productInfo = null;
	
	ReviewListService rls = new ReviewListService();
	Scanner sc = new Scanner(System.in);

	// 판매 물품 조회
	public void sellProductList() {
		boolean flag = true;
		String auth = MemberService.memberInfo.getMemberAuth();
		while (flag) {
			if(auth.equals("S")||auth.equals("B")) {
				System.out.println("=================================================================================");
				System.out.println("1. 판매가 낮은 순 | 2. 평점 평균 순 | 3. 이름으로 검색 | 4. 가격범위로 검색 | 5. 제품 평점/리뷰 확인 | 6. 구매하기 | 7. 뒤로 가기");
				System.out.println("메뉴 선택>");
				String selNo = sc.nextLine();
				switch (selNo) {
				case "1":
					getProductList();
					break;
				case "2":
					getProductScoreList();
					break;
				case "3":
					getProductNameList();
					break;
				case "4":
					getProductPriceList(0, 0);
					break;
				case "5":
					System.out.println("평점/리뷰를 확인할 제품 ID를 입력하세요>");
					int proId = Integer.parseInt(sc.nextLine());
					getProById(proId);
					rls.showProReview(proId);
					break;
				case "6":
					rls.buyProduct();
					break;
				case "7":
					flag = false;
					break;
				}
			}else if(auth.equals("A")) {
				System.out.println("=================================================================================");
				System.out.println("1. 판매가 낮은 순 | 2. 평점 평균 순 | 3. 이름으로 검색 | 4. 가격범위로 검색 | 5. 뒤로 가기");
				System.out.println("메뉴 선택>");
				String selNo = sc.nextLine();
				switch (selNo) {
				case "1":
					getProductList();
					break;
				case "2":
					getProductScoreList();
					break;
				case "3":
					getProductNameList();
					break;
				case "4":
					getProductPriceList(0, 0);
					break;
				case "5":
					flag = false;
					break;
				}
			}
		}
	}
	
	//낮은 가격순
	public void getProductList() {
		System.out.println("=== 가격 오름차순 목록 ===");
		List<Product>list = ProductDAO.getInstance().getProductList();
		
		for(int i =0;i<list.size();i++) {
			System.out.println("=================================");
			System.out.println("제품 ID : "+list.get(i).getProId()+
					", 제품이름 : "+list.get(i).getProName()+
					", 판매자 : "+list.get(i).getMemberId()+
					", 가격 : "+list.get(i).getProPrice()+"원");
		}
	}
	
	//평점 평균순
	public void getProductScoreList() {
		System.out.println("=== 평점 평균 내림차순 목록 ===");
		List<Product>list = ProductDAO.getInstance().getProductScoreList();
		for(int i =0;i<list.size();i++) {
			System.out.println("=================================");
			System.out.println("제품 ID : "+list.get(i).getProId()+
					", 제품이름 : "+list.get(i).getProName()+
					", 판매자 : "+list.get(i).getMemberId()+
					", 가격 : "+list.get(i).getProPrice()+
					"원, 평점 평균 : "+list.get(i).getReviewAvg());
		}
		
	}
	
	//이름으로 검색
	public void getProductNameList() {
		System.out.println("제품 이름을 검색하세요>");
		String proName = sc.nextLine();
		System.out.println("=== "+proName+"이 이름에 들어간 제품 ===");
		List<Product>list = ProductDAO.getInstance().getProductNameList(proName);
		
		for(int i =0;i<list.size();i++) {
			System.out.println("=================================");
			System.out.println("제품 ID : "+list.get(i).getProId()+
					", 제품이름 : "+list.get(i).getProName()+
					", 판매자 : "+list.get(i).getMemberId()+
					", 가격 : "+list.get(i).getProPrice()+"원");
		}
	}
	
	//가격 범위로 검색
	public void getProductPriceList(int min, int max) {
		System.out.println("제품 최소가격을 지정하세요>");
		min = Integer.parseInt(sc.nextLine());
		System.out.println("제품 최대가격을 지정하세요>");
		max = Integer.parseInt(sc.nextLine());
		System.out.println("=== 가격 범위안 제품 목록 ===");
		List<Product>list = ProductDAO.getInstance().getProductPriceList(min, max);
		
		for(int i =0;i<list.size();i++) {
			System.out.println("=================================");
			System.out.println("제품 ID : "+list.get(i).getProId()+
					", 제품이름 : "+list.get(i).getProName()+
					", 판매자 : "+list.get(i).getMemberId()+
					", 가격 : "+list.get(i).getProPrice()+"원");
		}
	}

	//판매물건ID로 물건 검색
	public void getProById(int proId) {
		Product pro = ProductDAO.getInstance().proInfo(proId);
		System.out.println("==제품정보==");
		System.out.println("제품 ID : "+pro.getProId()+
				", 제품이름 : "+pro.getProName()+
				", 판매자 : "+pro.getMemberId()+
				", 가격 : "+pro.getProPrice()+"원"+
				", 제품 설명 : "+pro.getProExplain());
	}
	
	//판매 물품 등록
	public void regitProduct() {
		String auth = MemberService.memberInfo.getMemberAuth();
		if(auth.equals("S")||auth.equals("B")) {
			System.out.println("== 판매하려는 물건의 정보를 입력하세요 ==");
			System.out.println("제품 이름>");
			String proId = sc.nextLine();
			System.out.println("제품 가격>");
			int proPrice = Integer.parseInt(sc.nextLine());
			System.out.println("제품 설명>");
			String proExplain = sc.nextLine();
			Product pro = new Product();
			
			String memberId = MemberService.memberInfo.getMemberId();
//		String memId = null;
//		if(MemberService.memberInfo != null) {
//			memId = MemberService.memberInfo.getMemberId();
//		}
			pro.setMemberId(memberId);
			pro.setProName(proId);
			pro.setProPrice(proPrice);
			pro.setProExplain(proExplain);
			
			int result = ProductDAO.getInstance().regitProduct(pro);			
		}else if(auth.equals("A")) {
			Product pro = new Product();
			System.out.println("== 판매하려는 물건의 정보를 입력하세요 ==");
			System.out.println("판매자 ID>");
			pro.setMemberId(sc.nextLine());
			System.out.println("제품 이름>");
			pro.setProName(sc.nextLine());
			System.out.println("제품 가격>");
			pro.setProPrice(Integer.parseInt(sc.nextLine()));
			System.out.println("제품 설명>");
			pro.setProExplain(sc.nextLine());
			
			int result = ProductDAO.getInstance().regitProduct(pro);	
		}
	}
	
	//판매자가 등록한 물품 조회
	public void sellerProInfo() {
		String memberId = MemberService.memberInfo.getMemberId();
		List<Product>list = ProductDAO.getInstance().sellerProInfo(memberId);
		
		for(int i =0;i<list.size();i++) {
			System.out.println("=================================");
			System.out.println("제품 ID : "+list.get(i).getProId()+
					", 제품이름 : "+list.get(i).getProName()+
					", 판매자 : "+list.get(i).getMemberId()+
					", 가격 : "+list.get(i).getProPrice()+"원"+
					", 제품 설명 : "+list.get(i).getProExplain());
		}
	}
	
	public void updatePro() {
		boolean flag = true;
		while(flag) {
			System.out.println("=================================================================================");
			System.out.println("1.제품이름 수정 | 2. 제품가격 수정 | 3. 제품설명 수정 | 4. 뒤로가기");
			System.out.println("메뉴 선택>");
			int selNo = Integer.parseInt(sc.nextLine());
			switch(selNo) {
			case 1:
				updateProName();;
				break;
			case 2:
				updateProPrice();;
				break;
			case 3:
				updateProExplain();;
				break;
			case 4:
				flag = false;
				break;
			}
		}
	}
	
	//판매자가 등록한 물품 삭제
	public void deletePro() {
		String auth = MemberService.memberInfo.getMemberAuth();
		if(auth.equals("S")||auth.equals("B")) {
			System.out.println("판매취소하고싶은 제품의 ID를 입력하세요>");
			int proId = Integer.parseInt(sc.nextLine());
			Product pro = ProductDAO.getInstance().proInfo(proId);
			String memberId = MemberService.memberInfo.getMemberId();
			if(pro.getMemberId().equals(memberId)) {
				ProductDAO.getInstance().deletePro(proId);			
			}else {
				System.out.println("제품의 판매자가 아닙니다. 제품의 판매자만 판매취소 할수 있습니다.");
			}
		}else if(auth.equals("A")) {
			System.out.println("판매취소하고싶은 제품의 ID를 입력하세요>");
			int proId = Integer.parseInt(sc.nextLine());
			ProductDAO.getInstance().deletePro(proId);
		}
	}
	
	//판매자가 등록한 물품 이름수정
	public void updateProName() {
		String auth = MemberService.memberInfo.getMemberAuth();
		if(auth.equals("S")||auth.equals("B")) {
			System.out.println("이름을 수정할 제품의 ID를 입력하세요>");
			int proId = Integer.parseInt(sc.nextLine());
			System.out.println("수정할 이름을 입력하세요");
			String proName = sc.nextLine();
			Product pro = ProductDAO.getInstance().proInfo(proId);
			String memberId = MemberService.memberInfo.getMemberId();
			if(pro.getMemberId().equals(memberId)) {
				ProductDAO.getInstance().updateProName(proId, proName);			
			}else {
				System.out.println("제품의 판매자가 아닙니다. 제품의 판매자만 정보를 수정할 수 있습니다.");
			}
		}else if(auth.equals("A")) {
			System.out.println("이름을 수정할 제품의 ID를 입력하세요>");
			int proId = Integer.parseInt(sc.nextLine());
			System.out.println("수정할 이름을 입력하세요");
			String proName = sc.nextLine();
			Product pro = ProductDAO.getInstance().proInfo(proId);
			ProductDAO.getInstance().updateProName(proId, proName);	
		}
	}
	
	//판매자가 등록한 물품 가격 수정
	public void updateProPrice() {
		System.out.println("가격을 수정할 제품의 ID를 입력하세요>");
		int proId = Integer.parseInt(sc.nextLine());
		System.out.println("수정할 가격을 입력하세요");
		int proPrice = Integer.parseInt(sc.nextLine());
		Product pro = ProductDAO.getInstance().proInfo(proId);
		String memberId = MemberService.memberInfo.getMemberId();
		if(pro.getMemberId().equals(memberId)) {
			ProductDAO.getInstance().updateProPrice(proId, proPrice);			
		}else {
			System.out.println("제품의 판매자가 아닙니다. 제품의 판매자만 정보를 수정할 수 있습니다.");
		}
	}
	
	//판매자가 등록한 물품 설명 수정
	public void updateProExplain() {
		System.out.println("제품설명을 수정할 제품의 ID를 입력하세요>");
		int proId = Integer.parseInt(sc.nextLine());
		System.out.println("수정할 설명을 입력하세요");
		String proExplain = sc.nextLine();
		Product pro = ProductDAO.getInstance().proInfo(proId);
		String memberId = MemberService.memberInfo.getMemberId();
		if(pro.getMemberId().equals(memberId)) {
			ProductDAO.getInstance().updateProExplain(proId, proExplain);			
		}else {
			System.out.println("제품의 판매자가 아닙니다. 제품의 판매자만 정보를 수정할 수 있습니다.");
		}
	}
	
}	
