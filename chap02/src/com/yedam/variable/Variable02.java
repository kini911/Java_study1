package com.yedam.variable;

public class Variable02 {
	public static void main(String[] args) {
		
		//2진수
		int var1 = 0b1011;
		int var2 = 0206; //8진수
		int var3 = 365;  //10진수
		int var4 = 0xB3; //16진수
		
		System.out.println("var1 : " + var1);
		System.out.println("var2 : " + var2);
		System.out.println("var3 : " + var3);
		System.out.println("var4 : " + var4);
		
		//정수타입의 범위
		//byte -> -128 ~ 127
		byte bVar1 = 127;
		
		//Long
		//자바는 int를 기본으로 숫자를 인식 -> int범위 안이면 오케이 BUT int의 범위 이상이라면 숫자뒤에 대문자L을 입력해야 long으로 가능
		long lvar1 = 2000000;
		long lvar2 = 200000000000L;
		
		//Char
		char c1 = 'A';
		char c2 = 65;
		char c3 = '\u0041';
		
		char c4 = '가';
		char c5 = 44032;
		char c6 = '\uac00';
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		System.out.println(c5);
		System.out.println(c6);
		
		//이스케이프 문자
		//문자열 String
		
		String name = "홍길동";
		String job = "프로그래머";
		
		//\t : tap만큼 띄워라
		//\n : enter
		//\\ : 특수한 문자 사용(\)
		//\" : 특수한 문자 사용(")
		
		System.out.println(name + "\t" + job);
		System.out.println("행단위 출력\n");
		System.out.println("우리는 \"개발자\"입니다");
		System.out.println("봄/여름\\가을\\겨울");
		
		//실수
		//float, double
		
		//float
		float fVar1 = 3.14f;	//f를 넣어 float타입인걸 확실히 표시해야함
		double dVar1 = 3.14;	//double은 기본타입이기때문에 괜춘
		float fVar2 = 0.1234567891234f;
		double dVar2 = 0.1234567891234;
		
		System.out.println("fVar2 : " + fVar2);	//부동소수점 때문에 근사치값을 뽑아줌
		System.out.println("dVar2 : " + dVar2);
		
		float fVar3 = 3e-3f;
		double dVar3 = 3e6;
		
		System.out.println("fVar3 : " + fVar3);
		System.out.println("dVar3 : " + dVar3);
		
		//논리타입(Boolean)
		boolean stop = true;
		if(stop) {
			System.out.println("멈춥니다.");
		} else {
			System.out.println("달립니다.");
		}
		
		
		
	}
}
