package com.yedam.variable;

public class OpaeratorCasting {

	public static void main(String[] args) {
		byte value1 = 10;
		int value2 = 100;
		long value3 = 1000;
		
		long result = value1+value2+value3;
		System.out.println(result);
		
		//실수와 정수 타입 변환
		int iValue1 = 10;
		int iValue2 = iValue1/4;
		System.out.println(iValue2);
		
		double dValue = iValue1/4.0;	//정수 나누기 실수하면 실수로 표현가능
		System.out.println(dValue);
		
		int x =1;
		int y = 2;
		
		double result2 = (double)x/y;	//실수와 정수의 연산이라 실수로 출력 가능
		System.out.println(result2);
		
		//문자열 + 연산
		int value = 10+2+8;
		
		String str1 = 10+2+"8";
		System.out.println("str1 : " + str1);
		
		String str2 = "10" + 2 + 8;
		System.out.println("str2 : " + str2);
		
		String str3 = "10" + (2 + 8);
		System.out.println("str3 : " + str3);
		
		//String <-> 기본 타입(정수, 실수, 논리) 변환
		int valueStr = Integer.parseInt(str3);
		short shortValue = Short.parseShort(str3);
		double doubleValue = Double.parseDouble(str3);
		System.out.println(doubleValue);
		System.out.println(shortValue);
		System.out.println(valueStr);
//		boolean bValue = Boolean.parseBoolean(str3);
		
		//기본타입 -> String 변환
		//int -> String
		String str4 = String.valueOf(valueStr);
		//double -> String
		String str5 = String.valueOf(doubleValue);
		System.out.println(str4);
		
		
		
		
		
		
	}
}
