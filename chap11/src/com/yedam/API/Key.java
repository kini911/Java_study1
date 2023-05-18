package com.yedam.API;

public class Key {
	public int key;
	
	public Key(int key) {
		this.key = key;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Key) {
			Key compare =(Key)obj;
			if(this.key==compare.key) {
				return true;
			}
		}
		return false;
	}
//	hashMap.put(new Key(1), "홍길동");
//				key = 1
//	String value = hashMap.get(new Key(1));
//							   key =1
//	hashCode()를 오버라이딩하면 같은값을 동일 주소로 인식함!!!!!
	
	@Override
	public int hashCode() {
		return key;
	}
	//그전에는 같은 값이 들어가더라도 다른 주소지(해시코드)였지만 해시코드()를 통해
	//해시코드가 같으면 동등객체로 만들어줌
}
