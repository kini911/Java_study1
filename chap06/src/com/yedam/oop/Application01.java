package com.yedam.oop;

public class Application01 {
	//실행 클래스
	public static void main(String[] args) {
		//만들어 놓은 Car Class를 객체로 만듬
		Car myCar = new Car();
	  //타입 변수   =객체생성 생성자;	<- 대입 연산자(=)를 사용했기 때문에 오른쪽에서 객체를 먼저 생성하고 변수에 집어넣음
		//객체를 heap에 생성하고  myCar라는 변수에 대입
		//Car()라는 생성자를 활용했기때문에 Car라는 타입(Car클래스안에 정의해놓은 내용->필드,메소드)에 적용
		//Car클래스 안에 만들어 놓은 필드와 메소드를 사용 -> Car타입
		//dot,, . ->dot를 사용하면 클래스 외부에서 클래스의 필드와 메소드를 사용할 수 있음
		System.out.println(myCar.company);
		System.out.println(myCar.price);
		System.out.println(myCar.name);
		//객체에 데이터 넣지않았을때는 필드의 기본값이 나옴(클래스 내부에서 필드에 데이터 입력하면 필드설정값이 기본값으로 나옴)
		//-클래스 외부에서 객체를 생성하고 필드를 호출하여 데이터 입력하는 방식(첫번째 방식)
		//변수.클래스필드 ->변수라고 생각하고 변수에 데이터 입력한 다음 다시 출력시키면 값이 나옴
		myCar.company = "현대";
		myCar.price = 1234;
		myCar.name = "소나타";
		System.out.println("==객체 필드 데이터 입력==");
		System.out.println(myCar.company);
		System.out.println(myCar.price);
		System.out.println(myCar.name);
		
		//클래스 내부에서 데이터 입력하는 방식(두번째 방식)
		//Car클래스에서 company필드에 "벤틀리"라고 데이터 입력
		//Car클래스를 활용해서 다른 객체 만듬
		Car yourCar = new Car();
		System.out.println("-myCar와 yourCar 비교-");
		System.out.println(myCar.company);
		System.out.println(yourCar.company);
		
		System.out.println("==Korean Class를 활용한 객체 생성==");
		//Korean 클래스에는 기본생성자가 아니라 생성자 선언을 해놓았기 때문에 설정된 생성자의 매개변수를 따라 입력해야 한다
		Korean k1 = new Korean("김정현","911202-1111111");
		System.out.println(k1.name);
		System.out.println(k1.nation);
		System.out.println(k1.ssn);
		
		System.out.println("==생성자 오버로딩을 활용한 객체 생성==");
		
		//매개변수가 하나인 생성자 활용
		Car oneCar = new Car("소나타");
		System.out.println("oneCar의 필드 name : "+oneCar.name);
		
		oneCar.run();
		System.out.println(oneCar.info());
//		Car threeCar = new Car("그랜저", 3000, "현대");
//		System.out.println("ThreeCar의 필드 : "+threeCar.name);
//		System.out.println("ThreeCar의 필드 : "+threeCar.price);
//		System.out.println("ThreeCar의 필드 : "+threeCar.company);
		
		
		
		
		
		
	}
}
