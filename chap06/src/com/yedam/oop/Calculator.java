package com.yedam.oop;

public class Calculator {
	//덧셈기능메소드
	int plus(int x, int y) {
		int result = x+ y;
		return result;
	}
	
	//평균기능메소드
	double avg(int x, int y){
		double sum = plus(x,y);
		double result =sum/2;
		return result;
	}
	
	void excute() {
		double result = avg(7,10);
		print("실행결과"+ result);
	}
	
	void print(String message) {
		System.out.println(message);
	}
	
	//정사각형넓이(한변의 제곱) 구하는 메소드
	double areaRectangle(double width) {
		return width *width;
	}
	//직사각형넓이(밑,윗변 곱) 구하는 메소드
	double areaRectangle(double width, double height) {
		return width * height;
	}
}