package com.yedam.javatest;

public class SimplePayment implements Payment{
	double simplePaymentRatio;
	
	SimplePayment(double simplePaymentRatio){
		this.simplePaymentRatio = simplePaymentRatio;
	}
	
	@Override
	public int online(int price) {
		return price-(int)(price*(ONLINE_PAYMENT_RATIO+this.simplePaymentRatio));
	}

	@Override
	public int offline(int price) {
		return price-(int)(price*(OFFLINE_PAYMENT_RATIO+this.simplePaymentRatio));
	}

	@Override
	public void showInfo() {
		System.out.println("*** 간편결제 시 할인정보");
		System.out.println("온라인 결제시 총 할인울 : "+(ONLINE_PAYMENT_RATIO+this.simplePaymentRatio));
		System.out.println("오프라인 결제시 총 할인울 : "+(OFFLINE_PAYMENT_RATIO+this.simplePaymentRatio));
	}
}
