package com.yedam.hw0516;

import java.util.Scanner;

public class Question {
	public static void main(String[] args) {
		System.out.println("==1번 문제 =============");
		RPGgame rpg = new RPGgame();
		rpg.leftUpButton();
		rpg.rightUpButton();
		rpg.changeMode();
		rpg.rightUpButton();
		rpg.rightDownButton();
		rpg.leftDownButton();
		rpg.changeMode();
		rpg.rightDownButton();
		System.out.println("===================");
		ArcadeGame arcade = new ArcadeGame();
		arcade.leftUpButton();
		arcade.rightUpButton();
		arcade.leftDownButton();
		arcade.changeMode();
		arcade.rightUpButton();
		arcade.leftUpButton();
		arcade.rightDownButton();
		
		System.out.println("==2번 문제 ============");
		PortableNotebook pNotebook = new PortableNotebook("한글2020","크롬","영화", "안드로이드앱");
		pNotebook.writeDocumentaion();
		pNotebook.watchVideo();
		pNotebook.changeMode();
		pNotebook.useApp();
		pNotebook.searchInternet();
		
		System.out.println("==3번 문제 ============");
		Scanner sc = new Scanner(System.in);
		boolean run = true;
//		System.out.println((int)(Math.random()*2)+1);
		int ranNum = (int)(Math.random()*2)+1;
		if(ranNum==1) {
			RPGgame ranGame = new RPGgame();
			while(run) {
				System.out.println("============================================================================================");
				System.out.println("<< 1.LeftUP | 2.LeftDown | 3.RightUp | 4.RightDown | 5.ModeChange | 0.GameChange | 9.EXIT >>");
				System.out.println("============================================================================================");
				
				System.out.println("choice>");
				int selNo = Integer.parseInt(sc.nextLine());
				if(selNo==1) {
					ranGame.leftUpButton();
				}else if(selNo==2) {
					ranGame.leftDownButton();
				}else if(selNo==3) {
					ranGame.rightUpButton();
				}else if(selNo==4) {
					ranGame.rightDownButton();
				}else if(selNo==5) {
					ranGame.changeMode();
				}else if(selNo==0) {
//					ArcadeGame ranGame = new ArcadeGame();
				}else if(selNo==9) {
					System.out.println("EXIT");
					run = false;
				}
			}
		}else {
			ArcadeGame ranGame = new ArcadeGame();
			while(run) {
				System.out.println("============================================================================================");
				System.out.println("<< 1.LeftUP | 2.LeftDown | 3.RightUp | 4.RightDown | 5.ModeChange | 0.GameChange | 9.EXIT >>");
				System.out.println("============================================================================================");
				
				System.out.println("choice>");
				int selNo = Integer.parseInt(sc.nextLine());
				
				if(selNo==1) {
					ranGame.leftUpButton();
				}else if(selNo==2) {
					ranGame.leftDownButton();
				}else if(selNo==3) {
					ranGame.rightUpButton();
				}else if(selNo==4) {
					ranGame.rightDownButton();
				}else if(selNo==5) {
					ranGame.changeMode();
				}else if(selNo==0) {
//					RPGgame ranGame = new RPGgame();
				}else if(selNo==9) {
					System.out.println("EXIT");
					run = false;
				}
			}
		}
	}
}