package com.yedam.hw0515;

public class ObesityInfo extends StandardWeightInfo{
	public void getInformation() {
		String BMI;
		if(ObesityInfo.getObesity()<=18.5) {
			BMI = "저체중";
		}else if(ObesityInfo.getObesity()<=22.9) {
			BMI = "정상";
		}else if(ObesityInfo.getObesity()<=24.9) {
			BMI = "과체중";
		}else {
			BMI = "비만";
		}
		System.out.println
		(name+"님의 신장 "+height+", 몸무게 "+weight+", "+BMI+" 입니다.");
	}
	public static double getObesity() {
		double obesity = (weight-StandardWeightInfo.getStandardWeight())/StandardWeightInfo.getStandardWeight()*100;
		return obesity;
	}
	
}
