package com.yedam.exe;

import java.util.Scanner;

import com.yedam.store.StoreService;

public class StoreApp {
	
	Scanner sc = new Scanner(System.in);
	boolean run = true;
	StoreService ss = new StoreService();
	
	public StoreApp() {
		start();
	}

	private void start() {
		
		while(run) {
			System.out.println("1. 모든 가게 정보 조회 | 2. 지역구별 매출 합계 조회 | 3. 가게 정보 입력 | 4. 매출 수정 | 5. 종료");
			System.out.println("입력>");
			String selNo = sc.nextLine();
			if(selNo.equals("1")) {
				ss.getStoreList();
			}else if(selNo.equals("2")) {
				ss.getAnalyze();
			}else if(selNo.equals("3")) {
				ss.insertStore();
			}else if(selNo.equals("4")) {
				
			}else if(selNo.equals("5")) {
				run =false;
				System.out.println("프로그램 종료");
			}else {
				System.out.println("메뉴를 다시 선택해주세요");
			}
		}
		
	}
	
	
	
	
}
