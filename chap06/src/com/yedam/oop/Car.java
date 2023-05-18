package com.yedam.oop;

public class Car {
	//필드 : 객체를 만들었을 때 정보를 담아주는 역할
	//-필드선언-
	String name;	//자동차 이름
	int price;	//자동차 가격
	String company = "벤틀리";	//자동차 제조사
	
	//생성자
	//객체를 처음 만들때 호출되어 객체의 초기화 담당
	//ex) new + 생성자;	-> 객체가 만들어짐
	//new -> 비어있는 메모리를 찾아서 heap영역에 주소부여
	//생성자 -> 객체를 생성할때 우선적으로 해야할 행동을 정의해놓는 공간
	//	   -> 객체를 만들 때 내가 하고 싶은 행위를 정의
	//	   -> 클래스 이름과 동일 / 다양한 방법으로 객체를 생성하기 위해서 생성자를 오버로딩
	
	Car(){
		//기본 생성자(생성자 이름은 무조건 클래스의 이름과 같아야함!)
		//생성자는 메소드 성격도 가지고 있음(함수의 성격) -> 매개변수의 성격을 띄고 있음
		//생성자를 활용해서 외부에서 데이터 받아와서 필드에 데이터 넣을 수 있음(세번째 방식)
	}
	//생성자 타입의 순서 바꾸기
	Car(String name, int price){
		
	}
	Car(int price, String name){
		
	}
	//생성자 타입 다르게 하기
	Car(String name){
		this(name, 10000, "현대");//this()는 매개변수가 3개이고 String in String이기 때문에 같은 형식의 생성자를 따라감
//		this.name = name;
		System.out.println("자동차 이름만 입력");
	}
	Car(int price){
		
	}
	//생성자 타입의 갯수 다르게 하기
	Car(String name, int price, String company){
		this.name = name;
		this.price = price;
		this.company = company;
		System.out.println("모든 필드 초기화");
	}
	//변수와 함수는 같은이름으로 생성불가능
	//하지만 자바에서는 생성자를 오버로딩 할 수 있음(오버로딩:매개변수를 다르게 해서 여러개 선언할 수 있음)
	//매개변수 갯수,타입,타입의 순서(중요!!!)에 따라서 서로 다른 생성자로 구분할 수 있음
	//생성자의 이름은 같지만 매개변수의 갯수와 타입이 다른걸 활용해서 오버로딩 한것!
	
	//메소드 : 객체에서의 기능을 담당(객체가 사용할 수 있는 기능)
	//메소드 선언부 -> signature
	//반환값이 없는 메소드 -> void 활용
	void run() {
		System.out.println("자동차가 달립니다.");
	}
	
	//문자열을 반환(리턴)하는 메소드
	String info() {
		System.out.println();
		String data = company + " : "+name+" : "+price;
		return data;
	}
	
}
