package com.yedam.storemember;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Member {
	
//	MEMBER_ID    NOT NULL VARCHAR2(20)  
//	MEMBER_PW    NOT NULL VARCHAR2(20)  
//	MEMBER_NAME  NOT NULL VARCHAR2(20)  
//	MEMBER_PHONE NOT NULL VARCHAR2(20)  
//	MEMBER_ADDR  NOT NULL VARCHAR2(100) 
//	MEMBER_AUTH           CHAR(1)      
	
	private String memberId;
	private String memberPw;
	private String memberName;
	private String memberPhone;
	private String memberAddr;
	private String memberAuth;
	
}