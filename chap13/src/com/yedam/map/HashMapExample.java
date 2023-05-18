package com.yedam.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {
	public static void main(String[] args) {
		// key : String(문자열), value: Integer(정수)
//		key와 value->Map.entry(null, null)
		Map<String, Integer> map = new HashMap<String, Integer>();

		// Map.entry 저장
		map.put("고길동", 85);
		map.put("김또치", 90);
		map.put("고희동", 80);
		map.put("김또치", 30);
		// 같은 키값이면 덮어쓰기됨

		// entry 갯수 확인
		System.out.println("총 entry 수 : " + map.size());

		// key를 활용한 객체 찾기
		System.out.println(map.get("김또치"));
		// "김또치"key를 활용해서 처음에는 90을 넣고 뒤에 30을 넣음 -> 90의 데이터는 30으로 덮어쓰기됨-> 출력값은 30이 됨
		System.out.println();

		// 반복자(iterator)
		Set<String> keySet = map.keySet();
		// 열쇠가 String으로 설정되어있기때문에 Set<String>해야함

		// Set을 활용한 반복문
		Iterator<String> keyIterator = keySet.iterator();
		while (keyIterator.hasNext()) {
			// 열쇠로 데이터 가져오는
			String key = keyIterator.next();
			Integer value = map.get(key);
			System.out.println("key : " + key + " value : " + value);

		}
		System.out.println();
		// Map.entry -> Set(반복자)
		// EntrySet <K,V> 다 가져오는 Entry출력
		//
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		// 모든 엔트리값을 가져옴(키와 밸류 다 가져옴)

		Iterator<Map.Entry<String, Integer>> entryIter = entrySet.iterator();

		while (entryIter.hasNext()) {
			Map.Entry<String, Integer> entry = entryIter.next();
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println("key : " + key + " value : " + value);
		}
		System.out.println();

		// 향상된 for문
		for (Map.Entry<String, Integer> mEntry : entrySet) {
			String key = mEntry.getKey();
			Integer value = mEntry.getValue();
			System.out.println("key : " + key + " value : " + value);
		}
		System.out.println();
		
		//Entry삭제
		map.remove("고길동");
		System.out.println("총 Entry수 : "+map.size());
		
		//Entry 전체 삭제
		map.clear();
		System.out.println("총 Entry수 : "+map.size());
		
		
		
		
		
		
		
	}
}
