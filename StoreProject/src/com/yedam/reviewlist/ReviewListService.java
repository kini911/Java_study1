package com.yedam.reviewlist;

import java.util.List;
import java.util.Scanner;

import com.yedam.product.Product;
import com.yedam.product.ProductDAO;
import com.yedam.storemember.Member;
import com.yedam.storemember.MemberService;

public class ReviewListService {
	
	public static ReviewList reviewListInfo = null;

	Scanner sc = new Scanner(System.in);
	
	//구매내역 관리
	public void buyListInfo() {
		boolean flag = true;
		while(flag) {
			System.out.println("=================================================================================");
			System.out.println("1. 구매 내역 | 2. 구매 취소 | 3. 평점/리뷰 남기기 | 4. 뒤로 가기");
			System.out.println("메뉴 선택>");
			int selNo = Integer.parseInt(sc.nextLine());
			switch(selNo){
			case 1:
				showBuyesProduct();
				break;
			case 2:
				cancelBuy();
				break;
			case 3:
				ScoreAndReview();
				break;
			case 4:
				flag = false;
				break;
			}
		}
	}
	
	//제품 구매
	public void buyProduct() {
		System.out.println("구입할 제품ID를 입력하세요");
		Product pro = ProductDAO.getInstance().proInfo(Integer.parseInt(sc.nextLine()));
		int porId = pro.getProId();
		String memId = null;
		if(MemberService.memberInfo != null) {
			memId = MemberService.memberInfo.getMemberId();
		}
		int result = ReviewListDAO.getInstance().buyProduct(porId, memId);
		
		if(result>0) {
			System.out.println("감사합니다!!");
		}else if(result==0) {
			System.out.println("제품ID를 다시한번 확인 부탁드립니다.");
		}
		
	}
	
	
	//구매 내역 확인
	public void showBuyesProduct() {
		String auth = MemberService.memberInfo.getMemberAuth();
		String memId = MemberService.memberInfo.getMemberId();
		List<ReviewList>list = null;
		if(auth.equals("S")||auth.equals("B")) {
			list = ReviewListDAO.getInstance().showBuyedProduct(memId);			
		}else if(auth.equals("A")) {
			System.out.println("전체조회 하시겠습니까? Y/N");
			String ans = sc.nextLine();
			if(ans.equals("Y")) {
				list = ReviewListDAO.getInstance().showBuyedProduct();				
			}else if(ans.equals("N")) {
				System.out.println("리뷰를 검색하려는 제품의 ID를 입력하세요>");
				int proId = Integer.parseInt(sc.nextLine());
				list = ReviewListDAO.getInstance().showBuyedProduct(proId);
			}
		}
		for(int i=0;i<list.size();i++) {
			System.out.println("구매번호 : "+list.get(i).getReviewNum()+"/ 제품이름 : "+list.get(i).getProName()+"/ 제품가격 : "+list.get(i).getProPrice()+
					"/ 판매자ID : "+list.get(i).getSellerId()+"/ 구매자ID : "+list.get(i).getMemberId()+"/ 구매자 평점 : "+list.get(i).getMemberScore()+"/ 구매자 리뷰 : "+list.get(i).getProReview());
			System.out.println("=============================");
		}
	}
	
	//구매내역 삭제(구매취소)
	public void cancelBuy() {
		System.out.println("구매 취소할 구매번호를 입력하세요>");
		int reviewId = Integer.parseInt(sc.nextLine());
		int result = ReviewListDAO.getInstance().cancelBuy(reviewId);
		
		if(result>0) {
			System.out.println("구매취소(구매내역삭제) 완료");
		}else {
			System.out.println("구매취소(구매내역삭제) 실패");
		}
	}
	
	// 평점/리뷰 남기기
	public void ScoreAndReview() {
		boolean flag= true;
		while(flag){
			System.out.println("1. 평점 남기기 | 2. 리뷰 남기기 | 3. 뒤로 가기");
			int selNo = Integer.parseInt(sc.nextLine());
			if(selNo == 1) {
				proScore();
			}else if(selNo ==2){
				proReview();
			}else if(selNo == 3) {
				flag = false;
				break;
			}
		}
		
	}

	private void proScore() {
		int proScore = 0;
		int reviewNum = 0;
		System.out.println("평점을 남길 구매번호를 입력하세요");
		reviewNum = Integer.parseInt(sc.nextLine());
		ReviewList rl = ReviewListDAO.getInstance().checkReviewNum(reviewNum);
		if(rl ==null){
			System.out.println("구매내역이 없습니다.");
		}else if(rl.getReviewNum()==reviewNum) {
			if(rl.getMemberId().equals(MemberService.memberInfo.getMemberId())) {
				boolean flag = true;
				while(flag) {
					System.out.println("평점을 남겨주세요(1점~100점)");
					proScore = Integer.parseInt(sc.nextLine());
					if(1<=proScore && proScore<=100) {
						ReviewListDAO.getInstance().proScore(proScore, reviewNum);
						System.out.println("점수 입력 완료");
						flag = false;
						break;
					}else {
						System.out.println("점수를 1~100사이로 입력해주세요.");
					}			
				}
			}else {
				System.out.println("구매번호를 다시 확인해주세요");
			}
		}
	}
	
	private void proReview() {
		String proReview = null;
		int reviewNum = 0;
		System.out.println("리뷰을 남길 구매번호를 입력하세요");
		reviewNum = Integer.parseInt(sc.nextLine());
		ReviewList rl = ReviewListDAO.getInstance().checkReviewNum(reviewNum);
		if(rl ==null){
			System.out.println("구매내역이 없습니다.");
		}else if(rl.getReviewNum()==reviewNum) {
			if(rl.getMemberId().equals(MemberService.memberInfo.getMemberId())) {
				System.out.println("제품의 리뷰를 남겨주세요");
				proReview = sc.nextLine();
				ReviewListDAO.getInstance().proReview(proReview, reviewNum);
				System.out.println("리뷰 등록 완료");
			}else {
				System.out.println("구매번호를 다시 확인해주세요");
			}
		}
	}
	
	// 평점/리뷰 조회
	public void showProReview(int proId) {
		List<ReviewList>list = ReviewListDAO.getInstance().showProReview(proId);
		
		for(int i =0;i<list.size();i++) {
			System.out.println("=================================");
			System.out.println("리뷰번호 : "+list.get(i).getReviewNum()+
					", 구매자 ID : "+list.get(i).getMemberId()+
					", 구매자 평점 : "+list.get(i).getMemberScore()+
					", 구매자 리뷰 : "+list.get(i).getProReview());
		}
	}

	public void deleteReviewScore() {
		boolean flag = true;
		while(flag) {
			System.out.println("1. 리뷰 삭제 | 2. 평점 삭제 | 3. 뒤로 가기");
			int selNo = Integer.parseInt(sc.nextLine());
			if(selNo==1) {
				System.out.println("삭제하려는 리뷰번호를 입력하세요>");
				int reNum = Integer.parseInt(sc.nextLine());
				ReviewListDAO.getInstance().deleteReview(reNum);
				break;
			}else if(selNo==2) {
				System.out.println("삭제하려는 리뷰번호를 입력하세요>");
				int reNum = Integer.parseInt(sc.nextLine());
				ReviewListDAO.getInstance().deleteProScore(reNum);
				break;
			}else if(selNo == 3) {
				flag = false;
				break;
			}
		}
	}

}
