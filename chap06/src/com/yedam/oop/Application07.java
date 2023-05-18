package com.yedam.oop;

import java.util.Scanner;

import com.yedam.access.Access;

//import : 다른 폴더에 있는 클래스를 사용할 때 쓰는 구문
public class Application07 {
	//import 단축키 : ctrl + shift + o
	
	//필드 선언
	int num =1;
	//메소드 선언
	void info() {
		System.out.println("info출력");
	}
	
	public static void main(String[] args) {
		//import 활용
		Scanner sc = new Scanner(System.in);
		
		//자기 자신을 객체로 만든 예제 -> 절대로 하지말것!
		//정적 필드와 메소드는 static붙여서 사용할것
		Application07 app = new Application07();
		int a = app.num + 1;
		app.info();
		
		//클래스에 정의된 정적 멤버 사용
		//정적 필드와 메소드는 다른 자바 파일에서도 다 출력 가능
		//클래스명.필드명 | 클래스명.메소드명
		//정적 필드
		System.out.println(StaticCal.PI);
		
		//정적 메소드
		System.out.println(StaticCal.minus(10,5));
		System.out.println(StaticCal.plus(10,5));
		
		Person p1 = new Person("11111-111111","김또치");
		
		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);
		
//		p1.ssn = "222222-222222";
		//인스턴스 필드ssn의 final을 지우라고 오류뜸
		//final필드에 데이터가 저장된 순간 데이터값을 바꿀 수 없음!
		
		//final -> 상수(불변)
		//static -> 공유
		//static final -> 변하지 않는 값을 공유!
		//어디서든 수정불가능한 데이터를 가져와 쓸 수 있음
		System.out.println("지구의 반지름 : "+StaticCal.EARTH_RADIUS);
		System.out.println("지구의 표면적 : "
		+StaticCal.PI*StaticCal.EARTH_RADIUS*StaticCal.EARTH_RADIUS);
		
		Access ac = new Access();
//		//import문을 사용해서 다른 패키지의 클래스 사용
//		ac.free = "public";			//공용이라 어디서든 사용 가능
//		ac.parent = "protected";	//다른 패키지라 사용불가능, 하지만 상속하면 사용가능
//		ac.basic = "default";		//다른 패키지라 사용불가능
//		ac.privacy = "private";		//속해있는 클래스내부에서만 사용 가능
//		
		
		
	}	
}
