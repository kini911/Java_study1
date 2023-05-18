package com.yedam.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
	public static void main(String[] args) {
		List<String>list1 = new ArrayList<>();
		List<String>list2 = new LinkedList<>();
		
		long startTime;
		long endTime;
		
		startTime = System.nanoTime();
		for(int i=0;i<100000;i++) {
			list1.add(0,String.valueOf(i));
			//맨앞쪽에 데이터 한개씩 넣는다 -> 데이터가 뒤로 밀려서 만들어짐
		}
		endTime = System.nanoTime();
		
		System.out.println("ArrayList걸린 시간 : "+(endTime - startTime)+"ns");
		
		startTime = System.nanoTime();
		for(int i=0;i<100000;i++) {
			list2.add(0,String.valueOf(i));
			//맨앞쪽에 데이터 한개씩 넣는다 -> 데이터가 뒤로 밀려서 만들어짐
		}
		endTime = System.nanoTime();
		
		System.out.println("LinkedList걸린 시간 : "+(endTime - startTime)+"ns");
		//LinkedList가 만드는 시간이 더 짧음
	}
}
