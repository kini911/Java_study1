package com.yedam.API;

public class BoxingExample {
	public static void main(String[] args) {
		//Boxing : 기본타입을 객체로 포장하는것
		Integer obj1 = new Integer(100);
		Integer obj2 = new Integer("100");
		//가로줄의 의미 : 사용은 할수 있지만 되도록 권장하지는 않는다는 듯
		Integer obj3 = Integer.valueOf(100);
		Integer obj4 = Integer.valueOf("400");
		
		//Unboxing
		int value1 = obj1.intValue();
		int value2 = obj2.intValue();
		int value3 = obj3.intValue();
		int value4 = obj4.intValue();
		
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		System.out.println(value4);
		
		//자동 박싱
		Integer obj5 = 200;
		System.out.println(obj5.intValue());
		
		//대입 시 자동 언박싱
		int value5 = obj5;
		System.out.println(value5);
		
		//연산 시 자동 언박싱
		int value6 = obj5+400;
		System.out.println(value6);
		
		//포장 값 비교(비교할 때 범위가 있음)
		Integer obj6 = 200;
		Integer obj7 = 200;
		
		System.out.println(obj6 == obj7);
		System.out.println(obj6.intValue() == obj7.intValue());
		//포장을 풀고 비교해야 범위값 밖을 비교할 수 있음
		
		double value7 = Double.parseDouble("3.14");
		System.out.println(value7);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
