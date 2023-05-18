package com.yedam.javatest;

public class DGBCard extends Card{
	final String company = "대구은행";
	String cardStaff; 
	
	
	DGBCard(String cardNo, int validDate, int cvc, String cardStaff) {
		super(cardNo, validDate, cvc);
		this.cardStaff = cardStaff;
	}
	
	@Override
	public void  showCardInfo() {
//		System.out.println("카드 정보 ( Card NO : "+cardNo+", 유효기간 : "+validDate+", CVC : "+cvc+" )");
		//둘다 같은 card.showCardInfo()이기때문에 부모클래스의 메소드를 가져오는게 코딩 줄수를 줄인다
		super.showCardInfo();
		System.out.println("담당직원 - "+cardStaff+", "+company);
	}
	
}
