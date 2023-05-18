package com.yedam.javatest;

public class Test {
	public static void main(String[] args) {
		TossCard tCard = new TossCard("5432-4567-9534-3657", 20251203, 253, "신빛용");
		
		tCard.showCardInfo();
		
		DGBCard dCard = new DGBCard("5432-4567-9534-3657", 20251203, 253, "신빛용");
		dCard.showCardInfo();
		
		System.out.println("========문제3==========");
		int price = 10000;
		
		Payment card = new CardPayment(0.08);
		card.showInfo();
		System.out.println("온라인 결제 금액 : "+card.online(price));
		System.out.println("오프라인 결제 금액 : "+card.offline(price));
		
		Payment simple = new SimplePayment(0.05);
		simple.showInfo();
		System.out.println("온라인 결제 금액 : "+simple.online(price));
		System.out.println("오프라인 결제 금액 : "+simple.offline(price));
		
		
		
		
	}
}
