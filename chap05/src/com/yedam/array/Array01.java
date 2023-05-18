package com.yedam.array;

public class Array01 {
	public static void main(String[] args) {
		//값 목록을 활용해서 배열 만들기
		//총 6개의 데이터를 담을수 있는 배열 만들기
		//각 데이터를 배열의 공간에 입력하기
		//배열 생성과 동시에 데이터 입력
		int[] intAry = {1,2,3,4,5,6};
		
		//배열 생성만 하는 방법 -> 데이터는 입력되지않음
		int[] intAry2 = new int[6];
//		배열에 데이터 입력하는 법
//		intAry2[0] = 1;
//		intAry2[1] = 2;
//		intAry2[2] = 3;
//		intAry2[3] = 4;
//		intAry2[4] = 5;
//		intAry2[5] = 6;
		
		//문자열을 입력할 수 있는 배열 생성
		String[] strAry = new String[10];
		
		System.out.println("intAry2의 첫번째 값 : "+intAry2[0]);
		System.out.println("strAry의 첫번째 값 : "+strAry[0]);
		
		System.out.println("intAry의 세번째 값 : "+ intAry[2]);
		
		//반복문과 배열
		//반복문 i, 배열의 index를 매칭해서 활용
		//strAry -> 10개의 데이터를 담을 수 있는 배열
		
		int[] score = {83, 90, 87};
		int sum=0;
		for(int i = 0;i<score.length;i++) {
			//i = 0, 1, 2
			System.out.println(score[i]);
			sum += score[i];	//배열의 누적합계 구하기
		}
		
		System.out.println("score의 합계 : "+sum);
		
		//new 연산자를 활용한 배열 생성
		int[] point;
//		point = {1,2,3}; <- 이렇게 배열입력은 안됨. 밑에 방식으로 new연산자를 활용해야함
		point = new int[]{1,2,3};
		
		//데이터 입력x
		
		int[] arr1 = new int[3];
		
		for(int i =0; i<3; i++) {
			System.out.println("arr1["+i+"] : "+arr1[i]);
		}
		//값이 입력 안되었기 때문에 default값인 0이 출력됨
		arr1[0] = 10;
		arr1[1] = 20;
		arr1[2] = 30;
		
		for(int i=0;i<3;i++) {
			System.out.println("arr1["+i+"] : "+arr1[i]);
		}
		
		//참조 객체 String배열
		String[] arr2 = new String[3];
		for(int i =0; i<3; i++) {
			System.out.println("arr2["+i+"] : "+arr2[i]);
		}
		//값이 입력 안되었기 때문에 default값인 null이 출력됨
		arr2[0] = "3월";
		arr2[1] = "11월";
		arr2[2] = "1월";
		
		for(int i =0; i<3; i++) {
			System.out.println("arr2["+i+"] : "+arr2[i]);
		}
		
		
	}
}
