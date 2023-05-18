package com.yedam.homework;

import java.util.Scanner;

public class hw0511 {
	public static void main(String[] args) {
		// 문제2) 다음은 키보드로부터 상품 수와 상품 가격을 입력받아서
		Scanner sc = new Scanner(System.in);
		// 최고 가격을 가지는 제품과 해당 제품을 제외한 제품들의 총 합을 구하는 프로그램을 작성하세요.
		Appliances apAry[] = null;
		int apNum = 0;
		while(true) {
			System.out.println("====================================================");
			System.out.println("1.상품 수 | 2.상품 및 가격입력 | 3.제품별 가격 | 4.분석 | 5.종료");
			System.out.println("====================================================");
			// 1) 메뉴는 다음과 같이 구성하세요.
			// 1.상품 수 | 2.상품 및 가격입력 | 3.제품별 가격 | 4.분석 | 5.종료
		
			String selNum = sc.nextLine();
			if(selNum.equals("1")) {
				System.out.println("상품 수 입력>");
				apNum = Integer.parseInt(sc.nextLine());
			}else if(selNum.equals("2")) {
				// 2) 입력한 상품 수만큼 상품명과 해당 가격을 입력받을 수 있도록 구현하세요.
				apAry =new Appliances[apNum];
				for(int i=0;i<apAry.length;i++) {
					apAry[i] = new Appliances();
					System.out.println("상품명 입력>");
					apAry[i].pName = sc.nextLine();
					System.out.println("상품 가격 입력>");
					apAry[i].pPrice = Integer.parseInt(sc.nextLine());
				}
			}else if(selNum.equals("3")) {
				// 3) 제품별 가격을 출력하세요.
				//	출력예시, "상품명 : 가격"
				for(int i =0;i<apAry.length;i++) {
					System.out.println("--"+(i+1)+"번째 제품 가격--");
					apAry[i].getInfo();
					System.out.println("");
				}
			}else if(selNum.equals("4")) {
				// 4) 분석기능은 최고 가격을 가지는 제품과 해당 제품을 제외한 제품들의 총합을 구합니다.
				int sum = 0;
				int max = 0;
				for(int i =0;i<apAry.length;i++) {
					sum += apAry[i].pPrice;
					
					if(max < apAry[i].pPrice) {
						max = apAry[i].pPrice;
					}
				}
				System.out.println("최고가 제품가격 : "+max);
				System.out.println("최고가격을 뺀 제품가격 총합 : "+(sum-max));
				
			}else if(selNum.equals("5")) {
				// 5) 종료 시에는 프로그램을 종료한다고 메세지를 출력하도록 구현하세요.
				System.out.println("프로그램을 종료합니다.");
				break;
			}else {
				System.out.println("잘못된 번호 입력");
			}
		}
	}
}
