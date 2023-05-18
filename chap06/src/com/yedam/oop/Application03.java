package com.yedam.oop;

public class Application03 {
	public static void main(String[] args) {
		Computer compute = new Computer();
		
		//1)배열을 활용
		//데이터를 입력받은 값을 변수에 담아서 보내기
		int[] values1 = {1,2,3};
		int result1 = compute.sum1(values1);	//배열의 주소값을 Computer클래스 메소드에 넘겨줌
		System.out.println(result1);
		//데이터 없는 빈배열 만들어 보내기
		result1 = compute.sum1(new int[10]);
		System.out.println(result1);
		//배열 즉석에서 만들어 보내기
		result1 = compute.sum1(new int[] {1,2,3,4});
		System.out.println(result1);
		
		//2)목록을 넘겨주는 방식
		//메소드에서 배열선언을 해주지 않았지만 클래스로 값을 바로 넘겨주면서 메소드에서 데이터를 배열화시키고 연산후 값을 보냄
		int result2 = compute.sum2(1,2,3);
		System.out.println(result2);
		
		int result3 = compute.sum2(1,2,3,4,5);
		System.out.println(result3);
		
		Calculator cal = new Calculator();
//		double sum = cal.plus(7, 10);
//		double avg = cal.avg(7, 10);
		//클래스의 메소드 안에서 필요한 일을 다 행하면 밖에서 편하게 쓸수 있다
		cal.excute();
		
		double result4 = cal.areaRectangle(10.5);
		System.out.println(result4);
		double result5 = cal.areaRectangle(20.4, 10.2);
		System.out.println(result5);
		
		System.out.println("==책 종류==");
//		Book honJava = new Book();
		Book honJava = new Book("혼자 공부하는 자바","학습서","24000원","한빛 미디어","0001");
		honJava.getInfo();
		
		Book javaScript = new Book("자바스크립트", "학습서","15000원","어포스트","0002");
		javaScript.getInfo();
	}
}
