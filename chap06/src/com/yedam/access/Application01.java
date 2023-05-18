package com.yedam.access;

public class Application01 {
	public static void main(String[] args) {
		Access ac = new Access();
		ac.free = "public";
		ac.parent = "protected";
		ac.basic = "default";
//		ac.privacy = "private";
		ac.instead();
		//Access클래스에서 private걸어놓은 메소드를 사용할 수있음
	}
}
