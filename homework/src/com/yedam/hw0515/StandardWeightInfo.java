package com.yedam.hw0515;

public class StandardWeightInfo extends Human{
	
	@Override
	public void getInformation() {
		System.out.println(name+"님의 신장 "+height+", 몸무게 "+weight+", 표준체중 "+StandardWeightInfo.getStandardWeight()+" 입니다.");
	}
	public static double getStandardWeight() {
		return (height-100)*0.9;
		
	}
}
