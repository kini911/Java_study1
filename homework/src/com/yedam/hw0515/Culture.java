package com.yedam.hw0515;

public abstract class Culture {
	String movieName;
	int directors;
	int actors;
	int audience;
	int totalScore;
	int score;
	String grade;
	
	Culture(String movieName, int directors, int actors){
		this.movieName = movieName;
		this.directors = directors;
		this.actors = actors;
	}
	
	public void setTotalScore(int score) {
		this.totalScore += score;
		this.audience++;
	}
	public String getGrade(int score) {
//		this.score = score;
		String grade=null;
		if(score==1) {
			grade = "☆";
		}else if(score==2) {
			grade = "☆☆";
		}else if(score==3) {
			grade = "☆☆☆";
		}else if(score==4) {
			grade = "☆☆☆☆";
		}else if(score==5) {
			grade = "☆☆☆☆☆";
		}
		System.out.println(grade);
		this.grade = grade;
		return this.grade;
	}
	public abstract void getInformation();
}
