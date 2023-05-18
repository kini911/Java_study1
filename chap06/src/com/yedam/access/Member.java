package com.yedam.access;

public class Member {
	//어떠한 사이트에 회원 정보를 저장
	
	//필드
	//아이디, 비밀번호, 이름, 나이
	private String uId;
	private String uPw;
	private String uName;
	private int uAge;
	
	//생성자는 기본 생성자
	//생성자
	
	//메소드
	//getter와 setter활용해서 정보를 읽고 저장
	public String getuId() {
		return uId;
	}
	public void setuId(String uId) {
		this.uId = uId;
	}
	public String getuPw() {
		return uPw;
	}
	public void setuPw(String uPw) {
		this.uPw = uPw;
	}
	public String getuName() {
		return uName;
	}
	public void setuName(String uName) {
		this.uName = uName;
	}
	//2)나이 정보를 얻어 갈 때에는 +1해서 얻어간다.
	public int getuAge() {
		return uAge+1;
	}
	//1)나이를 입력 받았을때 0보다 작은 숫자가 들어오면 0으로 바꿔준다.
	public void setuAge(int uAge) {
		this.uAge = (uAge < 0)? 0 :uAge;
	}
	public void instance() {
		Singleton singleton = Singleton.getInstance();
		
		System.out.println("Member객체의 instance메소드");
		System.out.println(singleton.age);
		System.out.println(singleton.name);
	}
	
}
