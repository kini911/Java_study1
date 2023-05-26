package com.yedam.storemember;

import java.util.List;
import java.util.Scanner;

import com.yedam.exe.AdminApp;
import com.yedam.exe.BuyerApp;
import com.yedam.exe.SellerApp;


public class MemberService {
	
	public static Member memberInfo = null;
	Scanner sc = new Scanner(System.in);
	
	//회원가입
	public void insertMember() {
		Member mem = new Member();
		System.out.println("===회원가입===");
		String id = null;
		while(true) {
			System.out.println("아이디 입력>");
			id = sc.nextLine();
			String memberId = MemberDAO.getInstance().idCheck(id);
			if(memberId != null) {
				System.out.println("존재하는 ID입니다..");
			}else if(memberId ==null) {
				System.out.println("등록가능한 ID입니다!!");
				break;
			}
		}
		mem.setMemberId(id);
		System.out.println("암호 입력>");
		mem.setMemberPw(sc.nextLine());
		System.out.println("이름 입력>");
		mem.setMemberName(sc.nextLine());
		System.out.println("전화번호 입력>");
		mem.setMemberPhone(sc.nextLine());
		System.out.println("주소 입력>");
		mem.setMemberAddr(sc.nextLine());
		System.out.println("판매자로 등록하시겠습니까? Y/N");
		String ans = sc.nextLine();
		if(ans.equals("Y")) {
			mem.setMemberAuth("S");
		}else if(ans.equals("N")) {
			mem.setMemberAuth("B");
		}
		
		int result = MemberDAO.getInstance().insertMember(mem);
		
		if(result>0) {
			System.out.println("회원가입 완료");
		}else {
			System.out.println("회원가입 실패");
		}
		
	}
	
	//로그인
	public void login() {
		System.out.println("= 로 그 인 =");
		System.out.println("ID>");
		String id = sc.nextLine();
		
		System.out.println("PW>");
		String pw = sc.nextLine();
		
		Member member = MemberDAO.getInstance().login(id);
		
		if(member !=null) {
			if(member.getMemberPw().equals(pw)) {
				System.out.println("로그인 성공!");
				memberInfo = member;
				if(member.getMemberAuth().equals("B")) {
					new BuyerApp();
				}else if(member.getMemberAuth().equals("S")) {
					new SellerApp();
				}else if(member.getMemberAuth().equals("A")) {
					new AdminApp();
				}
			}else {
				System.out.println("비밀번호 불일치");
			}
		}else {
			System.out.println("아이디 불일치");
		}
	}
	
	// 회원정보관리
	public void memInfo() {
		boolean flag = true;
		while (flag) {
			System.out.println("=================================================================================");
			System.out.println("1. 개인정보 조회 | 2. 비밀번호 수정 | 3. 연락처 수정 | 4. 주소 수정 | 5. 탈퇴 | 6. 뒤로 가기");
			System.out.println("메뉴 선택>");
			int selNo = Integer.parseInt(sc.nextLine());
			if (selNo == 1) {
				checkMember();
				break;
			} else if (selNo == 2) {
				updateMemberPw();
				break;
			} else if (selNo == 3) {
				updateMemberPhone();
				break;
			} else if (selNo == 4) {
				updateMemberAddr();
				break;
			} else if (selNo == 5) {
				deleteMember();
				break;
			}else if(selNo == 6) {
				flag = false;
			}
		}
	}
	
	//비밀번호 변경
	public void updateMemberPw() {
		String pw = null;
		String id = null;
		if(MemberService.memberInfo.getMemberAuth().equals("A")) {
			System.out.println("비밀번호를 변경할 회원ID를 입력하세요>");
			id = sc.nextLine(); 
			System.out.println("변경할 비밀번호를 입력하세요>");
			pw = sc.nextLine();
			int member = MemberDAO.getInstance().updateMemberPw(id, pw);
			if(member>0) {
				System.out.println("성공적으로 변경하였습니다.");
			}else if(member==0){
				System.out.println("변경값을 입력하지 못했습니다..");
			}
		}else if(memberInfo.getMemberAuth().equals("S") || memberInfo.getMemberAuth().equals("B")) {
			System.out.println("변경할 비밀번호를 입력하세요>");
			pw = sc.nextLine();
			int member = MemberDAO.getInstance().updateMemberPw(memberInfo.getMemberId(), pw);
			if(member>0) {
				System.out.println("성공적으로 변경하였습니다.");
			}else if(member==0){
				System.out.println("변경값을 입력하지 못했습니다..");
			}
		}
	}
	
	//연락처 변경
	public void updateMemberPhone() {
		String phone = null;
		String id = null;
		if(MemberService.memberInfo.getMemberAuth().equals("A")) {
			System.out.println("연락처를 변경할 회원ID를 입력하세요>");
			id = sc.nextLine(); 
			System.out.println("변경할 연락처를 입력하세요>");
			phone = sc.nextLine();
			int member = MemberDAO.getInstance().updateMemberPhone(id, phone);
			if(member>0) {
				System.out.println("성공적으로 변경하였습니다.");
			}else if(member==0){
				System.out.println("변경값을 입력하지 못했습니다..");
			}
		}else if(memberInfo.getMemberAuth().equals("S") || memberInfo.getMemberAuth().equals("B")) {
			System.out.println("변경할 연락처를 입력하세요>");
			phone = sc.nextLine();
			int member = MemberDAO.getInstance().updateMemberPhone(memberInfo.getMemberId(), phone);
			if(member>0) {
				System.out.println("성공적으로 변경하였습니다.");
			}else if(member==0){
				System.out.println("변경값을 입력하지 못했습니다..");
			}
		}
	}
	
	//주소 변경
	public void updateMemberAddr() {
		String addr = null;
		String id = null;
		if(MemberService.memberInfo.getMemberAuth().equals("A")) {
			System.out.println("주소를 변경할 회원ID를 입력하세요>");
			id = sc.nextLine(); 
			System.out.println("변경할 주소를 입력하세요>");
			addr = sc.nextLine();
			int member = MemberDAO.getInstance().updateMemberAddr(id, addr);
			if(member>0) {
				System.out.println("성공적으로 변경하였습니다.");
			}else if(member==0){
				System.out.println("변경값을 입력하지 못했습니다..");
			}
		}else if(memberInfo.getMemberAuth().equals("S") || memberInfo.getMemberAuth().equals("B")) {
			System.out.println("변경할 주소를 입력하세요>");
			addr = sc.nextLine();
			int member = MemberDAO.getInstance().updateMemberAddr(memberInfo.getMemberId(), addr);
			if(member>0) {
				System.out.println("성공적으로 변경하였습니다.");
			}else if(member==0){
				System.out.println("변경값을 입력하지 못했습니다..");
			}
		}
	}
	
	//회원 삭제 / 탈퇴
	public void deleteMember() {
		String id = null;
		String pw = null;
		String auth = MemberService.memberInfo.getMemberAuth();
		if(auth.equals("A")) {
			System.out.println("삭제할 회원ID를 입력하세요>");
			id = sc.nextLine();
			MemberDAO.getInstance().deleteMember(id);
					
		}else if(auth.equals("S") || auth.equals("B")) {
			System.out.println("비밀번호를 입력하세요>");
			pw = sc.nextLine();
			if(memberInfo.getMemberPw().equals(pw)) {
				int result = MemberDAO.getInstance().deleteMember(memberInfo.getMemberId());
				if(memberInfo!=null) {
					memberInfo = null;
					System.out.println("성공적으로 탈퇴하였습니다.");
				}else {
					System.out.println("탈퇴에 실패 했습니다..");
					
				}
			}
		}
	}
	
	//멤버 정보 조회
	public void checkMember() {
		String memberId = memberInfo.getMemberId();
		Member member = MemberDAO.getInstance().checkMember(memberId);
		System.out.println("********************************");
		System.out.println("아이디 : "+member.getMemberId());
		System.out.println("비밀번호 : "+member.getMemberPw());
		System.out.println("회원이름 : "+member.getMemberName());
		System.out.println("회원 연락처 : "+member.getMemberPhone());
		System.out.println("회원 주소 : "+member.getMemberAddr());
		if(member.getMemberAuth().equals("B")) {
			System.out.println("회원 등급 : 구매자");
		}else if(member.getMemberAuth().equals("S")) {
			System.out.println("회원 등급 : 판매자");
		}
	}
	
	//전체 회원 조회
	public void getMemberList(int selNo) {
		List<Member>list = null;
		if(selNo == 1) {
			System.out.println("전체 회원목록");
			list = MemberDAO.getInstance().getMemberList();
			
		}else if(selNo==2) {
			System.out.println("구매자회원 목록");
			list = MemberDAO.getInstance().getBuyerList();
			
		}else if(selNo ==3) {
			System.out.println("판매자회원 목록");
			list = MemberDAO.getInstance().getSellerList();
		}
		for(int i = 0; i<list.size();i++) {
			String auth = null;
			if(list.get(i).getMemberAuth().equals("B")) {
				auth = "구매자";
			}else if(list.get(i).getMemberAuth().equals("S")) {
				auth = "판매자";
			}else if(list.get(i).getMemberAuth().equals("A")) {
				auth = "관리자";
			}
			System.out.println("==================================");
			System.out.println("회원 ID : "+list.get(i).getMemberId()+
							" | 회원 PW : "+list.get(i).getMemberPw()+
							" | 회원 이름 : "+list.get(i).getMemberName()+
							" | 회원 연락처 : "+list.get(i).getMemberPhone()+
							" | 회원 주소 : "+list.get(i).getMemberAddr()+
							" | 회원 등급 : "+auth);
		}
	}
	
	
	
}
