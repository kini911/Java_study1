package com.yedam.API;

public class ClassExample {
	public static void main(String[] args) throws Exception {
		//Class정보 얻기
		
		Class clazz = Member.class;
		System.out.println("Class 정보 : "+clazz);
		
		//Class 경로 입력해서 정보 얻기
		clazz = Class.forName("com.yedam.API.Member");
		System.out.println(clazz);
		
		//객체를 통한 정보 얻기
		Member member = new Member("또오치");
		clazz = member.getClass();
		System.out.println(clazz);
		
		System.out.println(clazz.getName());
		System.out.println(clazz.getSimpleName());
		System.out.println(clazz.getPackageName());
		System.out.println(clazz.getPackage().getName());
		
		//절 대 경 로
		String photoPath = clazz.getResource("dog.jpg").getPath();
		System.out.println(photoPath);
		//개발자가 작성하는 곳 -> src
		//작성한게 실행하는 곳 -> bin(class파일이 실행되는 곳)
		
		
		
		
		
		
		
		
		
		
		
	}
}
