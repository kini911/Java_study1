package com.yedam.test;

import java.util.Scanner;

public class Application {
	
	
	
	
	
	//생성자
	public Application(){
		run();
	}

	private void run() {
		//Dice에 대한 기능을 넣어줌
		//주사위 배열
				int[] dice = null;
				//주사위 크기를 결정하는 변수
				int diceNo=0;
				Scanner sc = new Scanner(System.in);
				//while을 제어 할 수 있는 변수
				boolean run = true;
				
				//메뉴선택변수
				int selectNo = 0;
				while(selectNo !=5) {
					System.out.println("===1.주사위 크기 2.주사위 굴리기 3.결과보기 4.가장 많이 나온 수 5.종료===");
					System.out.println("메뉴>");
					
					selectNo = Integer.parseInt(sc.nextLine());
					
					switch(selectNo) {
					case 1:
						System.out.println("주사위 크기>");
						diceNo = Integer.parseInt(sc.nextLine());
						if(diceNo<5 ||diceNo >10) {
							System.out.println("주사위의 범위를 벗어 났습니다.");
							System.out.println("5~10 사이의 숫자를 입력하세요.");
							//2번 주사위 굴리기 할때
							diceNo = 0;
						}
						break;
					case 2:
						if(diceNo==0) {
							System.out.println("주사위값이 제대로 입력되지않음\n다시 입력하세요");
						}else {
							//랜덤값 -> 주사위를 굴려서 나오는 값
							dice = new int[diceNo];
							int count = 0;
							while(true) {
								//주사위를 굴린 횟수
								count++;
//								랜덤값 ->주사위를 굴려서 나오는 값
								int randomDice = (int)((Math.random()*diceNo)+1);
								//랜덤값을 활용하여 dice배열의 인덱스를 구한 뒤 1씩 증가
								dice[randomDice-1]++;
								if(randomDice==5) {
									System.out.println("5가 나올 때까지 "+count+"번 굴렸습니다.");
									break;
								}
							}
						}
						break;
					case 3:
						for(int i=0;i<dice.length;i++) {
							System.out.println((i+1)+"은"+ dice[i]+"번 나왔습니다.");
						}
						break;
					case 4:
						int max = dice[0];
						int idx = 0;
						for(int i=0;i<dice.length;i++) {
							if(max<dice[i]) {
								max = dice[i];
								idx = i+1;
							}
						}
						System.out.println("가장 많이 나온 수는"+idx+"입니다.");
						
						break;
					case 5:
						break;
					}
				}
	}
	
}
