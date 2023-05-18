package com.yedam.API;

import java.util.HashMap;

public class ObjectExample {
	public static void main(String[] args) {
		Member member = new Member("123");
		Member member2 = new Member("123");
		
		if(member.equals(member2)) {
			System.out.println("동등한 객체");
		}else {
			System.out.println("다른 객체");
		}
		
		HashMap<Key, String>hashMap = new HashMap<>();
		
		hashMap.put(new Key(1), "홍길동");
		
		String value = hashMap.get(new Key(1));
		
		System.out.println(value);
		//new Key(1)로 같은 객체를 만들어도 새로운 주소를 생성하기때문에 value값이 없음 ->null값이 나옴
		
		HashMap<Member, String>hashMap01 = new HashMap<>();
		
		hashMap01.put(new Member("123"), "길동");
		
		System.out.println(hashMap01.get(new Member("123")));
		//해쉬맵에서 알아서 주소값을 비교해줌
		
		
		Object obj = new Object();
		Object obj2 = new Object();
		
		System.out.println(obj);
		System.out.println(obj.toString());
		//객체의 정보(주소) 표시 ->toString은 생략가능
		
		SmartPhone sp = new SmartPhone("apple",100,"iPhone");
		
		System.out.println(sp.toString());
				
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
