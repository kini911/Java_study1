package com.yedam.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		
		set.add("Java");
		set.add("JDBC");
		set.add("Servelt/JSP");
		set.add("Java");
		set.add("iBatis");
		
		
		//size
		int size = set.size();
		System.out.println("총 객체 수 : "+size);
		//데이터 하나가 중복이라서 객체수는 4개가 나옴
		
		//iterator(반복자)를 활용한 HashSet 객체 출력
		Iterator<String> iterator = set.iterator();
		
		while(iterator.hasNext()) {
			//hasNext() -> 가져올 객체가 있으면 true를 리턴하고 없으면 false를 리턴
			String element = iterator.next();
			System.out.println("\t"+element);
		}
		
		set.remove("Java");
		set.remove("JDBC");
		
		System.out.println("========향상된 for문========");
		
		for(String temp : set) {
			System.out.println("\t"+temp);
		}
		//다 비움
		set.clear();
		
		System.out.println("총 객체 수 : "+set.size());
		
		if(set.isEmpty()) {
			System.out.println("객체가 하나도 없습니다.");
		}
		
		Set<Member>mSet = new HashSet<>();
		
		mSet.add(new Member("고길동",20));
		mSet.add(new Member("고길동",20));
		
		System.out.println("총 객체 수 : "+mSet.size());
		
		
		
		
		
		
	}
}
