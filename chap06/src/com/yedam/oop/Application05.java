package com.yedam.oop;

import java.util.Scanner;

public class Application05 {
	public static void main(String[] args) {
		// 학생의 정보를 관리하는 프로그램
		// 학생의 정보를 보관할 배열 작성
		Student[] stAry = null;
		// 학생의 정보를 몇명 보관할건지 정하는 변수
		int stNum = 0;
		// 데이터 입력받는 스캐너
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("==================================================");
			System.out.println("1.학생 수 | 2. 정보 입력 | 3. 정보 확인 | 4. 분석 | 5.종료");
			System.out.println("==================================================");

			String selNum = sc.nextLine();
			if (selNum.equals("1")) {
				// 1.학생수
				System.out.println("학생 수 입력>");
				stNum = Integer.parseInt(sc.nextLine());
			} else if (selNum.equals("2")) {
				// 2.정보 입력
				stAry = new Student[stNum];
				for (int i = 0; i < stAry.length; i++) {
					Student stu = new Student(); // 객체를 만들지 않고 stAry[i] = new Student(); 로 바로 배열에 생성할수 있음
					System.out.println("학생의 이름?");
					stu.name = sc.nextLine(); // 주석의 방식으로 배열에 바로 데이터를 넣으려면 변수 자리에 배열의 인덱스값을 입력하면됨
					System.out.println("학생의 학년?");
					stu.grade = Integer.parseInt(sc.nextLine());
					System.out.println("국어점수?");
					stu.korean = Integer.parseInt(sc.nextLine());
					System.out.println("영어점수?");
					stu.english = Integer.parseInt(sc.nextLine());
					System.out.println("수학점수");
					stu.math = Integer.parseInt(sc.nextLine());
					stAry[i] = stu;
				}
			} else if (selNum.equals("3")) {
				// 3.정보 확인
				for (int i = 0; i < stAry.length; i++) {
					System.out.println("--" + (i + 1) + "번 학생 정보확인--");
					stAry[i].getInfo();
				}
			} else if (selNum.equals("4")) {
				// 4.분석 - 전체 학생의 점수의 총합(국+영+수)
				// -총점의 평균(총합/3)
				// -개인별 가장 점수가 높은 과목 / 낮은 과목
				int sum = 0;
				for (int i = 0; i < stAry.length; i++) {
					sum += stAry[i].math + stAry[i].english + stAry[i].korean;

					//교수님 풀이방법
//					int max = stAry[i].korean;
//					int min = stAry[i].korean;
//					if (stAry[i].english < stAry[i].math) {
//						if (max < stAry[i].math) {
//							max = stAry[i].math;
//						}
//					} else {
//						if (max < stAry[i].english) {
//							max = stAry[i].english;
//						}
//					}
//					if (stAry[i].english >stAry[i].math) {
//						if (min > stAry[i].math) {
//							min = stAry[i].math;
//						}
//					}else {
//						if(min > stAry[i].english) {
//							min = stAry[i].english;
//						}
//					}
				}
				System.out.println("전체학생의 점수 합계 : " + sum);
				System.out.println("전체학생의 총점의 평균 : " + (double) (sum / stAry.length));
				for (int i = 0; i < stAry.length; i++) {
					System.out.print(stAry[i].name + "학생은 ");
					if (stAry[i].korean > stAry[i].english && stAry[i].korean > stAry[i].math) {
						System.out.println(stAry[i].korean + " : 국어점수가 가장 높다");
					} else if (stAry[i].english > stAry[i].korean && stAry[i].english > stAry[i].math) {
						System.out.println(stAry[i].english + " : 영어점수가 가장 높다");
					} else if (stAry[i].math > stAry[i].korean && stAry[i].math > stAry[i].english) {
						System.out.println(stAry[i].math + " : 수학점수가 가장 높다");
					} else {
						System.out.println("두과목 이상의 점수가 같다");
					}
				}
				for (int i = 0; i < stAry.length; i++) {
					System.out.print(stAry[i].name + "학생은 ");
					if (stAry[i].korean < stAry[i].english && stAry[i].korean < stAry[i].math) {
						System.out.println(stAry[i].korean + " : 국어점수가 가장 낮다");
					} else if (stAry[i].english < stAry[i].korean && stAry[i].english < stAry[i].math) {
						System.out.println(stAry[i].english + " : 영어점수가 가장 낮다");
					} else if (stAry[i].math < stAry[i].korean && stAry[i].math < stAry[i].english) {
						System.out.println(stAry[i].math + " : 수학점수가 가장 낮다");
					} else {
						System.out.println("두과목 이상의 점수가 같다");
					}
				}
			} else if (selNum.equals("5")) {
				System.out.println("프로그램 종료");
				break;
			} else {
				System.out.println("잘못된 번호 입력");
			}

		}
		// 5.종료

	}
}
