package com.yedam.API;

public class Member {
	//필드
	public String id;
	
	public Member(String id) {
		this.id = id;
	}
	
	//메소드
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member member = (Member)obj;
			if(id.equals(member.id)) {
				return true;				
			}
		}
		return false;
	}

	@Override
	public int hashCode() {
		return id.hashCode();
		//id는 String임 -> hashCode()를 활용해서 id의 해시코드값을 가져옴
		//같은 주소 => 같은 해시코드값을 가져옴
	}
	//문자열의 해시코드
	
}
