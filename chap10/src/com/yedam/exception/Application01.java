package com.yedam.exception;

public class Application01 {
	public static void main(String[] args) {
//		try {
//			//예외가 발생할만한 코드
//		}catch(예외종류(nullpoint, numberforamt...)) {
//			//예외, 문제가 발생했을때 처리하는 코드
//		}finally {
//			//try또는 catch문 실행하고 나서 무조건!!!!
//			//실행하는 코드!!
//			//필수는 아니고 선택
//		}
		try {
			//분모가 0일때 발생하는 오류
			double avg = 1/0;
			System.out.println(avg);
		}catch(ArithmeticException e) {
			//예외 발생시 예외를 잡아주는것
			System.out.println("숫자는 0으로 나누기 못함");
			//예외 발생시 안내하는 문구
			e.printStackTrace();
			//예외가 발생한 발자취를 찾아냄(오류 내용을 보여줌)
		}
		try {
			String str= "자바";
			int a = Integer.parseInt(str);
		}catch(NumberFormatException n){
			//예외가 발생한 타입에 맞게 넣어줘야함
			System.out.println("문자열을 정수로 바꿔야함");
			n.printStackTrace();
			//오류내용을 보여줌
		}
		//try-catch문은 많이 쓰는게 안좋음
		//중괄호를 사용하며 중괄호 안에서 선언된 변수는 밖에서 사용안되기 때문에
		//다중 catch문을 사용해야함
		//다중 catch블록 작성시 상위 예외 클래스가 하위 예외클래스보다 아래에 위치해야함
		//Exception -> 모든 예외의 대모(모든 예외를 받아줄수 있다)
		//마지막catch에는 예상치 못한 모든예외를 받아줄 Exception을 사용(어떤예외인지 모르기 때문에 명확하게 처리방법을 알려줄 수없음) 
		try {
			//다중catch문에서는 처음 발생한 예외만 잡고 try문의 코드는 진행안되며 찾은 예외만 가지고 catch문 실행함
//			double avg = 1/0;
			double avg = 1/1;
			System.out.println(avg);
			
//			String str= "자바";
			String str= "123";
			int a = Integer.parseInt(str);
			
			//ClassNotFound
			Class clazz = Class.forName("java.lang.String");
		}catch(ArithmeticException e) {
			System.out.println("숫자는 0으로 나누기 못함");
			e.printStackTrace();
		}catch(NumberFormatException n){
			System.out.println("문자열을 정수로 바꿔야함");
			n.printStackTrace();
		}catch(Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}finally {
			System.out.println("finally 항상 실행");
			//예외가 발생하지 않아도 finally는 항상 실행됨
		}
		
		try {
			findClass();
		}catch(ClassNotFoundException e){
			System.out.println("클래스가 존재하지 않습니다.");
		}
		
//		findClass();
		
		try {
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		//보통 이렇게 만들고 오류 찾아서 바로바로 수정
		
		
		
		
	}
	
	public static void findClass() throws ClassNotFoundException {
		//throws->메소드에서 예외 발생하면 catch문에 같은 예외가 있는 경우 catch문의 예외로 던져줌
		Class clazz = Class.forName("java.lang.String2");
	}
	
}
