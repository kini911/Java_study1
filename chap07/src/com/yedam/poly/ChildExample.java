package com.yedam.poly;

public class ChildExample {
	public static void main(String[] args) {
		//부모-자식간의 자동 타입변환
		//1)부모 변수명 = new 자식생성자()
		//2)자식 변수명 = new 자식생성자()
//			부모 변수명2 = 변수명;
		//Child(자식)의 생성자로 객체를 생성하고
		//이 객체를 Parent(부모)의 객체에 담아준다.
		
		//타입변환 + 오버라이딩 => 다형성
		//부모 클래스에 있는 내용을 사용하되, 
		//만약 자식 클래스에 부모 메소드가 재정의(오버라이딩)이 되어있다면,
		//부모 클래스에 있는 내용을 사용하지않고!! 자식 클래스의 메소드를 사용한다
		//위에 내용을 활용을 하여서 하나의 타입(부모)으로 된 객체를 여러개를 생성할 수 있다
		//하나의 부모에 여러 자식이 존내-> 다양한 객체를 생성 => 다형성
		
		Parent p1 = new Child();
		//child클래스 생성자를 이용하여 parent타입으로 지정
		p1.method1();
		p1.method2();	//->Child클래스에 오버라이딩 되어있기때문에 Parent의 메소드2가 아닌 Child의 메소드2를 사용함
		p1.field = "parent";	
		//기본적으로 Parent타입이기 때문에 Parent타입의 메소드들은 문제 없이 가져올수 있음
//		p1.field2 = "child";
//		p1.method3();
		//Child1의 필드값과 메소드를 가질수 없음 -> 타입이 Parent클래스를 활용한 객체이기 때문에!!!
		System.out.println("");
		
		p1 = new Child02();	//Child02생성자를 활용한 다른 형태의 p1객체가 됨
		//Parent클래스의 메소드를 사용가능함
		p1.method1();	//Child02가 가진 메소드1을 실행함!(오버라이딩 되어있기때문)
		p1.method2();	//Child02는 메소드2를 오버라이딩하지 않았기 때문에 Parent클래스의 메소드2를 풀력함
		p1.field = "parent";
		
		
	}
}
