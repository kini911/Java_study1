package com.yedam.loop;

import java.util.Scanner;

public class ForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// for문
		for (int i = 1; i <= 100; i++) {
			System.out.println(i);
		}

		int result = 0;

		for (int i = 1; i <= 100; i++) {
			result = result + i;
		}

		System.out.println("1~100사이의 합 : " + result);

		// 1~100사이의 짝, 홀수 구하기.
		// 2로 나누어 떨어지는 수 : 짝수( 숫자%2 == 0)
		// 위의 경우가 아니라면 홀수!!!
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				System.out.println(i + "는 짝수");
			} else if (!(i % 2 == 0)) {
				System.out.println(i + "는 홀수");
			}
		}

		// 입력한 숫자에 대한 구구단 출력
		Scanner sc = new Scanner(System.in);

		// 2 -> 2*1=2, 2*2=4, 2*3=6......
		System.out.println("구구단 입력>");

		int gugu = Integer.parseInt(sc.nextLine());
		for (int i = 1; i <= 9; i++) {
			System.out.println(gugu + "*" + i + "=" + (gugu * i));
		}

		// 예제)입력한 값에 대한 총합, 평균, 최대값, 최소값 구하기.
		// 몇번 반복할것인지에 대한 값을 입력받는다
		// 예시) 5번 -> 2,50,20,10,5

		System.out.println("횟수 입력>");

		// 풀이)
		// 반복횟수 입력
		int count = Integer.parseInt(sc.nextLine());
		// 변수 입력
		int total = 0;
		int avg = 0;
		int max = 0;
		int min = 0;
		// 반복문
		for (int i = 0; i < count; i++) {
			System.out.println("데이터입력>");
			int data = Integer.parseInt(sc.nextLine());
			// 총합계 -> 데이터를 입력 받는대로 누적 합계
			total += data; // total = total + 입력한 데이터
			System.out.println("입력값의 총합 : " + total);
			if (i == 0) {
				max = data;
				min = data;
			} else {
				// 최대값 -> 최대값, 입력값을 비교해서 더 큰 데이터가 최대값
				if (max < data) {
					max = data;
				}
				// 최소값 -> 최소값, 입력값을 비교해서 더 작은 데이터가 최소값
				if (min > data) {
					min = data;
				}
			}

		}
		// 평균 -> 총 합계 / 반복문 횟수
		// total / count
		System.out.printf("평균 : %5.2f\n", (double) total / count);
		System.out.println("최대값 : " + max + "\n최소값 : " + min);
		System.out.println("----");
		// 임의의 랜덤 값(1~100) 하나 추출
		// 5번의 기회안에 해당 랜덤값을 맞추는 프로그램 구현
		// 5번의기회(데이터를 입력->랜덤값 매칭)->데이터 입력(Scanner)
//									 ->입력 vs 랜덤 비교
//									 ->if문 사용
//									 ->입력 > 랜덤 = up
//									 ->입력 < 랜덤 = down
		// 예시) 랜덤 값 : 50
		// 사용자입력 ->30
		// 컴퓨터 -> up
		// 사용자입력 ->40
		// 컴퓨터 -> up
		// 사용자입력 ->60
		// 컴퓨터 -> down

		// 1)맞춘 경우
		// 정답
		// 2)기회안에 못 맞춘 경우
		// 실패
		// 반복문 강제 종료 -> break;

		int randomNo = (int) (Math.random() * 100) + 1;
		for (int i = 1; i < 6; i++) {
			System.out.println("<<숫자를 맞춰보세요!>>\n" + i + "번째입력>");
			int data = Integer.parseInt(sc.nextLine());
			if (data == randomNo) {
				System.out.println("와우 정답입니다~\n정답은 : " + randomNo);
				break;
			} else if (data > randomNo) {
				System.out.println("입력값이 더 큽니다.\n다시 맞춰보세요");
			} else {
				System.out.println("입력값이 더 작습니다.\n다시 맞춰보세요");
			}
			if (i == 5) {
				System.out.println("횟수를 소진했습니다. 정답은 " + randomNo);
				break;
			}
		}

		// 정답
		int randomNo1 = (int) (Math.random() * 100) + 1;
		for (int i = 1; i <= 5; i++) {
			// 데이터 입력
			int userData = Integer.parseInt(sc.nextLine());
			// 정답
			if (userData == randomNo1) {
				System.out.println("정답입니다, " + i + "번만에 맞췄습니다.");
				break;
			} // 입력>랜덤
			else if (userData > randomNo1) {
				System.out.println("down");
			} // 입력<랜덤
			else if (userData < randomNo1) {
				System.out.println("up");
			}
			if (i == 5) {
				System.out.println("모든 기회 소진되었습니다. 정답 : " + randomNo1);
			}
		}

	}

}
