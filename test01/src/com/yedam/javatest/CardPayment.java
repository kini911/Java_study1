package com.yedam.javatest;

public class CardPayment implements Payment{
	double cardRatio;
	
	CardPayment(double cardRatio){
		this.cardRatio = cardRatio;
	}
	
	@Override
	public int online(int price) {
		return price-(int)(price*(ONLINE_PAYMENT_RATIO+this.cardRatio));
	}

	@Override
	public int offline(int price) {
		return price-(int)(price*(OFFLINE_PAYMENT_RATIO+this.cardRatio));
	}

	@Override
	public void showInfo() {
		System.out.println("*** 카드로 결제 시 할인정보");
		System.out.println("온라인 결제시 총 할인울 : "+(ONLINE_PAYMENT_RATIO+this.cardRatio));
		System.out.println("오프라인 결제시 총 할인울 : "+(OFFLINE_PAYMENT_RATIO+this.cardRatio));
	}

}
