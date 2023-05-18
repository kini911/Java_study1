package com.yedam.reference;

public class Reference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//참조 타입 : 배열
		int[] array = {1,2,3,4,5,6};
		int[] array2 = {1,2,3,4,5,6};
		int[] array3 = null;
		
		System.out.println(array);
		//array변수가 들어가있는 메모리 주소를 표시함. 그 주소 안에는 1,2,3,4,5,6이 들어가 있음
		System.out.println(array2);
		//array와 array2는 같은 값이지만 출력값은 서로 다름.
		System.out.println(array == array2);
		//두 배열의 값은 같지만 메모리주소가 서로 다르기 때문에 거짓이라고 출력
		//참조타입(객체)의 null은 참조할 객체가 없다고 생각해야함 
		System.out.println(array[0]);
//		System.out.println(array3[0]);
		//null값이라서 오류가 뜸. 자바는 객체지향이기 때문에 nullpointerexception -> 참조할 객체가 없다고 오류가 뜸
		System.out.println(array3);
		System.out.println(array3 == null);
		//array3의 값은 null이기 때문에 true가 출력됨
		if(array3 == null) {
			//array3이 null인 경우
		}else {
			//array3에 객체가 있는경우
		}
		//NullPointException을 예방할수 있음->사용가능!
		
		String name1 = "신용권";
		String name2 = "신용권";
		String name3 = new String ("신용권");
		String name4 = new String ("신용권");
		System.out.println(name1 == name2);
		System.out.println(name1 == name3);
		System.out.println(name1 == name4);
		System.out.println(name3 == name4);
		//== -> 객체의 주소 비교
		System.out.println(name3.equals(name4));
		//.equals() -> 변수의 문자열을 비교
		
	}

}
