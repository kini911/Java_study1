package com.yedam.array;

import java.util.Scanner;

public class homework0510 {
	public static void main(String[] args) {
		
		//주어진 배열을 이용하여 다음 내용을 구현하세요.
		int[] arr1 = { 10, 20, 30, 50, 3, 60, -3 };
		
		//문제1. 주어진 배열 중에서 값이 60인 곳의 인덱스를 출력해보자.
		for(int i=0;i<arr1.length;i++) {
			if(arr1[i]==60) {
				System.out.println("문제1)배열에서 값이 60인 곳의 인덱스 : ["+i+"]");
			}
		}
		
		//문제2. 주어진 배열의 인덱스가 3인 곳은 출력하지 말고, 나머지만 출력해보자.
		System.out.println("문제2)");
		for(int i=0;i<arr1.length;i++) {
			if(i!=3) {
				System.out.println("배열의 인덱스가 3이 아닌 데이터 : "+arr1[i]);
			}
		}
		
		//문제3. 주어진 배열 안의 변경하고 싶은 값의 인덱스 번호를 입력받아, 그 값을 1000으로 변경해보자.
  		//   입력) 인덱스: 3 ->   {10, 20, 30, 1000, 3, 60, -3}
		Scanner sc = new Scanner(System.in);
		System.out.println("문제3)변경하고 싶은 값의 인덱스 번호를 입력하세요>");
		int num = Integer.parseInt(sc.nextLine());		
		for(int i=0;i<arr1.length;i++) {
			if(num == i) {
				arr1[i] = 1000;
			}
		}
		for(int i=0;i<arr1.length;i++) {
			System.out.print(""+arr1[i]+"  ");			
		}
		//문제4. 별도의 배열을 선언하여 양의 정수 10개를 입력받아 배열에 저장하고, 배열에 있는 정수 중에서 3의 배수만 출력해보자.
		int arr2[] = {1, 5, 7, 11, 15, 68, 69, 72, 99, 100};
		System.out.println();
		System.out.print("문제4)배열에서 3의 배수인 데이터 : ");
		for(int i =0;i<arr2.length;i++) {
			if(arr2[i]%3==0) {
				System.out.print(arr2[i]+" ");
			}
		}
		System.out.println("\n추가문제");
		//추가문제
		//X대학 M교수님은 프로그래밍 수업을 맡고 있다. 교실엔 학생이 30명이 있는데, 학생 명부엔 각 학생별로 1번부터 30번까지 출석번호가 붙어 있다.
		//교수님이 내준 특별과제를 28명이 제출했는데, 그 중에서 제출 안 한 학생 2명의 출석번호를 구하는 프로그램을 작성하시오.
		//참고 : 백준 https://www.acmicpc.net/problem/5597
		int[] stuNum = {9,30,6,12,10,20,21,11,7,5,28,4,18,29,17,19,27,13,16,26,14,23,22,15,3,1,24,25};
		int[] confirm = new int[30];
		for(int i =0; i<stuNum.length;i++) {
			confirm[stuNum[i]-1]++;
		}
		for(int i=0;i<stuNum.length;i++) {
			if(confirm[i]!=0) {
				System.out.println("제출"+(i+1));
			}else if(confirm[i]==0) {
				System.out.println("미제출"+(i+1));
			}
		}
		
		
		
		
		
		
//		for(int i=0;i<stuNum.length;i++) {
//			System.out.println("과제 제출한 학생의 번호>");
//			int put = Integer.parseInt(sc.nextLine());
//			stuNum[i] = put;
//		}
//		System.out.print("과제 제출한 학생들 :");
//		for(int i=0;i<stuNum.length;i++) {
//			System.out.print(stuNum[i]+" ");			
//		}
//		for(int i=0;i<stuNum.length;i++) {
////			if(stuNum[i])
//		}
//		int[] students = new int[30];
//		for(int i=0;i<students.length;i++) {
//			students[i]=i+1;
//		}
//		
//		for(int i=0;i<studentId.length;i++) {
//			if(studentId[i]==2 | studentId[i]==8) {
//				System.out.println("미제출자 학번 : "+studentId[i]);
//			}else
//			System.out.println(studentId[i]);
//			
//		}
	}

}
