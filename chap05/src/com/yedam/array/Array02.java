package com.yedam.array;

import java.util.Scanner;

public class Array02 {
	public static void main(String[] args) {
		// 배열의 길이 활용
//		int[] intAry = new int[10];
//		
//		System.out.println("intAry의 길이 : " + intAry.length);
//		
//		for(int i =0;i<10;i++) {
//			System.out.println(intAry[i]);	
//		}
//		for(int i =0;i<intAry.length;i++) {
//			System.out.println(intAry[i]);	
//		}

		Scanner sc = new Scanner(System.in);

//		// 배열
//		int[] ary;
//		// 배열의 크기
//		int no;
//
//		System.out.println("배열의 크기>");
//		no = Integer.parseInt(sc.nextLine());
//
//		ary = new int[no];
//
//		System.out.println(ary.length);
//
//		// 데이터 입력
//		for (int i = 0; i < ary.length; i++) {
//			System.out.println("입력>");
//			int data = Integer.parseInt(sc.nextLine());
//			ary[i] = data;
//		}
//		// 배열의 데이터 출력
//		for (int i = 0; i < ary.length; i++) {
//			System.out.println(ary[i]);
//		}
		
		//국영수의 데이터를 담는 배열
		int[] point = new int[3];
		//[0]:국어, [1]:영어, [2]:수학
		System.out.println("국어 점수>");
		point[0] = Integer.parseInt(sc.nextLine());
		
		System.out.println("영어 점수>");
		point[1] = Integer.parseInt(sc.nextLine());
		
		System.out.println("수학 점수>");
		point[2] = Integer.parseInt(sc.nextLine());
		
		//1)점수의 총합계
		int sum = 0;
		for(int i=0;i<point.length;i++) {
			sum += point[i];
		}
		
		System.out.println("총 합계 : "+sum);
		//2)평균
		double avg = (double)sum/point.length;
		System.out.println("평균 : "+ avg);
		
		//입력받은 데이터의 갯수의 총합, 평균, 최대, 최소
		//배열 선언
		int[] intAry2;
		
		System.out.println("데이터 갯수>");
		//배열의 크기
		int num = Integer.parseInt(sc.nextLine());
		
		intAry2 = new int[num];
		
		for(int i = 0; i<intAry2.length;i++) {
			// index = 0, 첫번째 칸
			//0번째 데이터 넣으세요 -> ?
			//1번째라고 인식할수 있게 수정해놓은것
			System.out.println((i+1)+"번째>");
			
			intAry2[i] = Integer.parseInt(sc.nextLine());
		}
		sum = 0;
		avg = 0;
		int max = intAry2[0];
		int min = intAry2[0];
		for(int i =0;i<intAry2.length;i++) {
			System.out.println(intAry2[i]);
			sum += intAry2[i];	//sum = sum + intAry2{i] (합계구하는 수식)
			
			//최대값
			if(max < intAry2[i]) {
				max = intAry2[i];
			}
			
			//최소값
			if(min >intAry2[i]) {
				min = intAry2[i];
			}
			
		}
		
		System.out.println("총 합계 : "+sum);
		System.out.println("최대값 : "+max+"\n최소값 : "+min);
		System.out.println("평균 : "+(double)sum/intAry2.length);
		
		//교재201p 6번 예제
		boolean run = true;
		int studentNum = 0;
		int [] scores = null;
		
		while(run) {
			System.out.println("--------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("--------------------------------------------");
			System.out.println("선택>");
			int selectNo = Integer.parseInt(sc.nextLine());
			
			if(selectNo == 1) {
				System.out.println("학생수>");
				studentNum = Integer.parseInt(sc.nextLine());
			}else if(selectNo == 2) {
				scores = new int[studentNum];
				for(int i = 0;i<scores.length;i++) {
					System.out.println("scores["+i+"]>");
					scores[i] = Integer.parseInt(sc.nextLine());
				}
			}else if(selectNo == 3) {
				for(int i=0;i<scores.length;i++) {
					System.out.println("scores["+i+"]>"+scores[i]);					
				}
			}else if(selectNo == 4) {
				int sMax = 0;
				int sSum = 0;
				for(int i =0;i<scores.length;i++) {
					sSum += scores[i];
					if(sMax < scores[i]) {
						sMax = scores[i];
					}
				}
				System.out.println("최고 점수 : "+sMax+"\n평균점수 : "+(double)sSum/scores.length);
			}else if(selectNo == 5) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
		//answer배열에 담긴 데이터를 읽고 각 숫자마다 개수만큼 '*'를 찍는다.
		int[] answer = {1,4,4,3,1,4,4,2,1,3,2};
		int[] counter = new int[4];
		for(int i =0;i<answer.length;i++) {
//			if(answer[i] ==1) {
//				counter[0]++;
//			}else if(answer[i] ==2) {
//				counter[1]++;
//			}else if(answer[i] ==3) {
//				counter[2]++;
//			}else if(answer[i] ==4) {
//				counter[3]++;
//			}
			counter[answer[i]-1] = counter[answer[i]-1]+1;
			
		}
		for(int i =0;i<counter.length;i++) {
//			if(counter[i]==4) {
//				System.out.println("****");
//			}else if(counter[i]==3) {
//				System.out.println("***");
//			}else if(counter[i]==2) {
//				System.out.println("**");
//			}else if(counter[i]==1) {
//				System.out.println("*");
//			}
			//이중for문
			for(int j=0;j<counter[i];j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
		
	}
}
