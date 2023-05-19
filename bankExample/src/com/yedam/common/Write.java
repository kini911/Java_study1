package com.yedam.common;

public class Write {
//	=================================명령 프롬프트!!!!!!!!!!!!!!!!!
//			C:\Users\admin>sqlplus "/ as sysdba"
//
//			SQL*Plus: Release 21.0.0.0.0 - Production on 금 5월 19 17:08:48 2023
//			Version 21.3.0.0.0
//
//			Copyright (c) 1982, 2021, Oracle.  All rights reserved.
//
//
//			다음에 접속됨:
//			Oracle Database 21c Express Edition Release 21.0.0.0.0 - Production
//			Version 21.3.0.0.0
//
//			SQL> create user c##bank identified by 1234;
//
//			사용자가 생성되었습니다.
//
//			SQL> grant create session, resource to c##bank;
//
//			권한이 부여되었습니다.
//
//			SQL> grant resource to c##bank;
//
//			권한이 부여되었습니다.
//
//			SQL> conn c##bank/1234;
//			연결되었습니다.
//			SQL>
//
//			==========================sql디벨로퍼!!!!!!!!!!!!!!!!!!!!!
//
//			--//회원 TABLE ->기본정보(고객과 은행원을 등록할 수 있는 TABLE) 
//			--//회원 ID, PW, 이름, 권한
//			CREATE TABLE member(
//			member_id varchar2(20) primary key,
//			member_pw varchar2(20),
//			member_name varchar2(12),
//			member_auth char);
//
//
//			--//계좌 TABLE -> 계좌 정보 조회, 입출금
//			--//계좌 번호, 회원 ID, 예금액, 개설 날짜
//			CREATE TABLE account(
//			account_id number primary key,
//			account_balance number,
//			account_credate date default sysdate,
//			member_id varchar2(20),
//			CONSTRAINT fk_account_member_id FOREIGN KEY(member_id) REFERENCES member(member_id));
	
	
	
//			==================DB에서 테이블 만든것들!!!!!!!!!!!!!!!!!
//			--
//			--//회원 TABLE ->기본정보(고객과 은행원을 등록할 수 있는 TABLE) 
//			--//회원 ID, PW, 이름, 권한
//			CREATE TABLE member(
//			member_id varchar2(20) primary key,
//			member_pw varchar2(20),
//			member_name varchar2(12),
//			member_auth char);
//		
//		
//			--//계좌 TABLE -> 계좌 정보 조회, 입출금
//			--//계좌 번호, 회원 ID, 예금액, 개설 날짜
//			CREATE TABLE account(
//			account_id number primary key,
//			account_balance number,
//			account_credate date default sysdate,
//			member_id varchar2(20),
//			CONSTRAINT fk_account_member_id FOREIGN KEY(member_id) REFERENCES member(member_id));
//		
//			desc member;
//		
//			desc account;
}
