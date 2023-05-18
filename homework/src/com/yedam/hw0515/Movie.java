package com.yedam.hw0515;

public class Movie extends Culture{
	String genre;
	
	
	Movie(String movieName, int directors, int actors) {
		super(movieName, directors, actors);
		// TODO Auto-generated constructor stub
	}
	Movie(String movieName, int directors, int actors, String genre) {
		super(movieName, directors, actors);
		this.genre = genre;
		
	}

	public void getInformation() {

		System.out.println("영화제목 : "+movieName);
		System.out.println("감독 : "+directors);
		System.out.println("배우 : "+actors);
		System.out.println("총점 : "+totalScore);
		System.out.println("평점 : "+grade);
	}
}
