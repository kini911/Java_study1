package com.yedam.storemember;

import java.util.ArrayList;
import java.util.List;

import com.yedam.common.DAO;
import com.yedam.product.Product;


public class MemberDAO extends DAO{
	
	private static MemberDAO mDao = null;
	
	private MemberDAO() {
		
	}
	
	public static MemberDAO getInstance() {
		if(mDao == null) {
			mDao = new MemberDAO();
		}
		return mDao;
	}
	
	//회원 가입
	public int insertMember(Member mem) {
		int result = 0;
		try {
			conn();
			String sql = "INSERT INTO member VALUES(?,?,?,?,?,?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, mem.getMemberId());
			pstmt.setString(2, mem.getMemberPw());
			pstmt.setString(3, mem.getMemberName());;
			pstmt.setString(4, mem.getMemberPhone());
			pstmt.setString(5, mem.getMemberAddr());
			pstmt.setString(6, mem.getMemberAuth());
			
			result = pstmt.executeUpdate();
			if(result >0) {
				System.out.println("입력완료");
			}else if (result == 0) {
				System.out.println("입력실패..");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		return result;
	}
	
	//회원 아이디 중복체크
	public String idCheck(String id) {
		String memberId = null;
		try {
			conn();
			String sql = "SELECT * FROM member WHERE member_id =?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			
			rs = pstmt.executeQuery();
			if(rs.next()) {
				Member member = new Member();
				member.setMemberId(rs.getString("member_id"));
				memberId = member.getMemberId();
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		return memberId;
	}
	
	//로그인
	public Member login(String id) {
		Member member =null;
		try {
			conn();
			String sql = "SELECT * FROM member WHERE member_id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			
			rs= pstmt.executeQuery();
			if(rs.next()) {
				member = new Member();
				member.setMemberId(id);
				member.setMemberName(rs.getString("member_name"));
				member.setMemberPw(rs.getString("member_pw"));
				member.setMemberPhone(rs.getString("member_phone"));
				member.setMemberAddr(rs.getString("member_addr"));
				member.setMemberAuth(rs.getString("member_auth"));
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		return member;
	}
	
	
	//멤버 정보 조회
	public Member checkMember(String memberId) {
		Member mem = null;
		try {
			conn();
			String sql = "SELECT * FROM member WHERE member_id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, memberId);
			rs= pstmt.executeQuery();
			
			if(rs.next()) {
				mem = new Member();
				mem.setMemberId(rs.getString("member_id"));
				mem.setMemberPw(rs.getString("member_pw"));
				mem.setMemberName(rs.getString("member_name"));
				mem.setMemberPhone(rs.getString("member_phone"));
				mem.setMemberAddr(rs.getString("member_addr"));
				mem.setMemberAuth(rs.getString("member_auth"));				
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		return mem;
	}
	
	//멤버 비밀번호 변경(관리자
	public int updateMemberPw(String id, String pw) {
		int result = 0;
		try {
			conn();
			String sql = "UPDATE member\r\n"
					+ "SET member_pw = ?\r\n"
					+ "WHERE Member_id = ?"; 
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, pw);
			pstmt.setString(2, id);
			
			result = pstmt.executeUpdate();
			
			if(result>0) {
				System.out.println("비밀번호 변경 완료");
			}else if(result==0) {
				System.out.println("비밀번호 변경 실패..");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		return result;
	}
	
	
	
	
	//멤버 연락처 수정
	public int updateMemberPhone(String id, String phone) {
		int result = 0;
		try {
			conn();
			String sql = "UPDATE member\r\n"
					+ "SET member_phone = ?\r\n"
					+ "WHERE Member_id = ?"; 
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, phone);
			pstmt.setString(2, id);
			
			result = pstmt.executeUpdate();
			
			if(result>0) {
				System.out.println("연락처 변경 완료");
			}else if(result==0) {
				System.out.println("연락처 변경 실패..");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		return result;
	}
	
	//멤버 주소 수정
	public int updateMemberAddr(String id, String addr) {
		int result = 0;
		try {
			conn();
			String sql = "UPDATE member\r\n"
					+ "SET member_addr = ?\r\n"
					+ "WHERE Member_id = ?"; 
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, addr);
			pstmt.setString(2, id);
			
			result = pstmt.executeUpdate();
			
			if(result>0) {
				System.out.println("주소 변경 완료");
			}else if(result==0) {
				System.out.println("주소 변경 실패..");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		return result;
	}
	
	//멤버 삭제 / 탈퇴
	public int deleteMember(String memId) {
		int result = 0;
		try {
			conn();
			String sql = "DELETE FROM member WHERE member_id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, memId);
			
			result = pstmt.executeUpdate();
			
			if(result >0) {
				System.out.println("성공적으로 삭제하였습니다.");
			}else if(result==0){
				System.out.println("회원을 삭제하지 못했습니다..");
			}	
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		return result;
	}
	
	
	//전체 회원 조회
	public List<Member> getMemberList(){
		List<Member>list = new ArrayList<>();
		Member member = null;
		try {
			conn();
			String sql ="SELECT *\r\n"
					+ "FROM member\r\n"
					+ "ORDER BY 1";
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				member = new Member();
				member.setMemberId(rs.getString("member_id"));
				member.setMemberPw(rs.getString("member_pw"));
				member.setMemberName(rs.getString("member_name"));
				member.setMemberPhone(rs.getString("member_phone"));
				member.setMemberAddr(rs.getString("member_addr"));
				member.setMemberAuth(rs.getString("member_auth"));
				list.add(member);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		return list;
	}
	
	//구매자회원 조회
	public List<Member> getBuyerList(){
		List<Member>list = new ArrayList<>();
		Member member = null;
		try {
			conn();
			String sql ="SELECT *\r\n"
					+ "FROM member\r\n"
					+ "WHERE member_auth = 'B'"
					+ "ORDER BY 1";
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				member = new Member();
				member.setMemberId(rs.getString("member_id"));
				member.setMemberPw(rs.getString("member_pw"));
				member.setMemberName(rs.getString("member_name"));
				member.setMemberPhone(rs.getString("member_phone"));
				member.setMemberAddr(rs.getString("member_addr"));
				member.setMemberAuth(rs.getString("member_auth"));
				list.add(member);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		return list;
	}

	public List<Member> getSellerList() {
		List<Member>list = new ArrayList<>();
		Member member = null;
		try {
			conn();
			String sql ="SELECT *\r\n"
					+ "FROM member\r\n"
					+ "WHERE member_auth = 'S'"
					+ "ORDER BY 1";
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				member = new Member();
				member.setMemberId(rs.getString("member_id"));
				member.setMemberPw(rs.getString("member_pw"));
				member.setMemberName(rs.getString("member_name"));
				member.setMemberPhone(rs.getString("member_phone"));
				member.setMemberAddr(rs.getString("member_addr"));
				member.setMemberAuth(rs.getString("member_auth"));
				list.add(member);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		return list;
	}
	
	
	
	
}
