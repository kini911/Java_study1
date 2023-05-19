package com.yedam.store;

import java.util.List;
import java.util.Scanner;

import com.yedam.store.Store;

public class StoreService {
	
	public static Store storeInfo = null;
	
	Scanner sc = new Scanner(System.in);
	
	//전체 가게 조회
	public void getStoreList() {
		List<Store>list = StoreDAO.getInstance().getStoreList();
		System.out.println("전체 가게 정보 조회");
		for(int i=0;i<list.size();i++) {
			System.out.println("가게ID : "+list.get(i).getStoreId());
			System.out.println("상호명 : "+list.get(i).getStoreName());
			System.out.println("가게 전화번호 : "+list.get(i).getStoreTel());
			System.out.println("가게 주소 : "+list.get(i).getStoreAddr());
			System.out.println("가게 매출 : "+list.get(i).getStoreSales());
			System.out.println("==============================================");
		}
	}
	
	//가게 등록
	public void insertStore() {
		System.out.println("===가게 등록===");
		int id = 0;
		while(true) {
			System.out.println("가게ID>");
			id = Integer.parseInt(sc.nextLine());
			int storeId = StoreDAO.getInstance().idCheck(id);
			if(storeId >=1) {
				System.out.println("존재하는 ID입니다.");
			}else if(storeId == 0) {
				System.out.println("등록가능한 ID입니다.");
				break;
			}
		}
		System.out.println("상호명>");
		String name = sc.nextLine();
		System.out.println("전화번호>");
		String tel = sc.nextLine();
		System.out.println("가게주소>");
		String addr = sc.nextLine();
		System.out.println("가게매출>");
		String sales = sc.nextLine();
		
		Store store = new Store();
		store.setStoreId(id);
		store.setStoreName(name);
		store.setStoreTel(tel);
		store.setStoreAddr(addr);
		store.setStoreSales(sales);
		
		int result = StoreDAO.getInstance().insertStore(store);
		
		if(result>0) {
			System.out.println("가게가 등록 되었습니다.");
		}else {
			System.out.println("가게 등록에 실패했습니다.");
		}
	}
	
	public void getAnalyze() {
		List<Store>list = StoreDAO.getInstance().getAnalyze();
		for(int i =0; i<list.size();i++) {
			System.out.println("가게주소 : "+list.get(i).getStoreAddr());
			System.out.println("구별 매출 합계 : "+list.get(i).getSum());
		}
	}
}
