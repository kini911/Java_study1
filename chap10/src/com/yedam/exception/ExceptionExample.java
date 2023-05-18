package com.yedam.exception;

public class ExceptionExample {
	public static void main(String[] args) {
		//nullpointException\
//		String data = null;
//		System.out.println(data.length());
		
		//ArrayIndexOutOfBoundsException
		int[] intAry = new int[3];
		
		intAry[0] = 1;
		intAry[1] =10;
		intAry[2] = 100;
//		intAry[3] = 1000;
		
//		System.out.println(intAry.toString());
		
		for(int i=0;i<intAry.length;i++) {
			System.out.println(intAry[i]);
		}
		
		//NumberFormatException
		//바꿀 수 없는 숫자인데 바꾸려고 할 때 발생하는 exception
		String str = "123";
		int val = Integer.parseInt(str);
		System.out.println(val);
		
		//예외
//		String str2 = "자바";
//		val = Integer.parseInt(str2);
//		System.out.println(val);
		
//		String str3 = "";
//		val = Integer.parseInt(str3);
//		System.out.println(val);
		
		//ClassCastException
		//자동타입변환이 된 객체를 강제타입변환할 때 발생
		
		Example exam = new Exam();
		Exam exam02 = (Exam)exam;
		
		//예외
		Example exam03 = new Example();
//		Exam exam04 = (Exam) exam03;
		
		if(exam03 instanceof Exam) {
			Exam exam04 = (Exam)exam03;
		}
		
		//ClasssNotFoundException -> Class파일(Java)을 찾지 못할 때
		//실행메소드 -> main을 찾지 못할 때
		//Java파일을 찾아야하는데 못 찾는 경우
		
		//ArithmeticException	-> 분모가 0일때
		
		//IOException -> 입출력 오류
		//file reading / write 할때 제대로 동작하지 않는 경우
		
		//FileNotFoundException
		//java -> file reading -> 경로를 찾지 못해서 나는 오류
		
		//OutofMemoryError -> 메모리 부족할때나는 오류
		//memory leak(메모리 누수,샌다,부족)
		
		
		
		
		
	}
}
