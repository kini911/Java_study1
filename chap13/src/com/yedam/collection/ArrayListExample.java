package com.yedam.collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
	public static void main(String[] args) {
		//String 문자열 담을수 있는 list 콜렉션 만들기
		List<String> list = new ArrayList<String>();
		
		//list 데이터 추가
		list.add("Java");
		list.add("JDBC");
		list.add("Servelt/Jsp");
		//인덱스 2데이터 추가
		list.add(2,"DataBase");
		list.add("iBatis");
		
		//size() -> 배열.length()과 같은 말임
		for(int i=0;i<list.size();i++) {
			String str = list.get(i);
			System.out.println(i+" : "+str);
		}
		//향상된 for문도 가능
		for(String data : list) {
			System.out.println(data);
		}
		System.out.println("==============");
		
		//삭제
		//idx가 1인 객체 삭제
		list.remove(1);	
		for(int i=0;i<list.size();i++) {
			String str = list.get(i);
			System.out.println(i+" : "+str);
		}
		//list.remove()하면 해당 인덱스의 객체를 지우고 지워진만큼 리스트의 객체들의 인덱스 당겨옴
		System.out.println("===============");
		
		//객체를 바로 삭제
		list.remove("Java");
		for(int i=0;i<list.size();i++) {
			String str = list.get(i);
			System.out.println(i+" : "+str);
		}
		System.out.println("================");
		
		//전체 삭제
		list.clear();
		System.out.println(list.isEmpty());
		System.out.println(list.size());
		
		
		
		
		
		
		
		
	}
}
