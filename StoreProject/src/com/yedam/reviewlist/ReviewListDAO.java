package com.yedam.reviewlist;

import java.util.ArrayList;
import java.util.List;

import com.yedam.common.DAO;
import com.yedam.product.Product;

public class ReviewListDAO extends DAO{
	
	private static ReviewListDAO rlDao = null;
	
	private ReviewListDAO(){
		
	}
	
	public static ReviewListDAO getInstance() {
		if(rlDao == null) {
			rlDao = new ReviewListDAO();
		}
		return rlDao;
	}
	
	//제품 구매
	public int buyProduct(int proId, String memId) {
		int result = 0;
		try {
			conn();
			String sql = "INSERT INTO review_list VALUES(review_list_seq.NEXTVAL,?,?,?,?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, proId);
			pstmt.setString(2, memId);
			pstmt.setInt(3, 0);
			pstmt.setString(4, null);
			
			result =pstmt.executeUpdate();
			if(result>0) {
				System.out.println("구매성공");
			}else if(result==0){
				System.out.println("구매 실패");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		return result;
	}
	
	//전체 구매 내역 확인
	public List<ReviewList> showBuyedProduct(){
		List<ReviewList>list = new ArrayList<>();
		ReviewList pro = null;
		try {
			conn();
			String sql = "SELECT r.review_num, p.pro_name, p.pro_price,p.member_id seller, r.member_id, r.member_score, r.pro_review\r\n"
					+ "FROM review_list r, product p\r\n"
					+ "WHERE r.pro_id = p.pro_id ORDER BY 1";
			pstmt = conn.prepareStatement(sql);
			
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				pro = new ReviewList();
				pro.setReviewNum(rs.getInt("review_num"));
				pro.setProName(rs.getString("pro_name"));
				pro.setProPrice(rs.getInt("pro_price"));
				pro.setSellerId(rs.getString("seller"));
				pro.setMemberId(rs.getString("member_id"));
				pro.setMemberScore(rs.getInt("member_score"));
				pro.setProReview(rs.getString("pro_review"));
				
				list.add(pro);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		return list;
	}
	
	//개인 구매 내역 확인
	public List<ReviewList> showBuyedProduct(String memId){
		List<ReviewList>list = new ArrayList<>();
		ReviewList pro = null;
		try {
			conn();
			String sql = "SELECT r.review_num, p.pro_name, p.pro_price,p.member_id seller, r.member_id, r.member_score, r.pro_review\r\n"
					+ "FROM review_list r, product p\r\n"
					+ "WHERE r.pro_id = p.pro_id AND\r\n"
					+ "r.member_id = ? ORDER BY 1";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, memId);
			
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				pro = new ReviewList();
				pro.setReviewNum(rs.getInt("review_num"));
				pro.setProName(rs.getString("pro_name"));
				pro.setProPrice(rs.getInt("pro_price"));
				pro.setSellerId(rs.getString("seller"));
				pro.setMemberId(rs.getString("member_id"));
				pro.setMemberScore(rs.getInt("member_score"));
				pro.setProReview(rs.getString("pro_review"));
				
				list.add(pro);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		return list;
	}
	
	//제품ID로 구매 내역 확인
		public List<ReviewList> showBuyedProduct(int proId){
			List<ReviewList>list = new ArrayList<>();
			ReviewList pro = null;
			try {
				conn();
				String sql = "SELECT r.review_num, p.pro_id, p.pro_name, p.pro_price, p.member_id seller, r.member_id, r.member_score, r.pro_review\r\n"
						+ "FROM review_list r, product p\r\n"
						+ "WHERE r.pro_id = p.pro_id AND p.pro_id = ?\r\n"
						+ "ORDER BY 1";
				pstmt = conn.prepareStatement(sql);
				pstmt.setInt(1, proId);
				
				rs = pstmt.executeQuery();
				
				while(rs.next()) {
					pro = new ReviewList();
					pro.setReviewNum(rs.getInt("review_num"));
					pro.setProId(rs.getInt("pro_id"));
					pro.setProName(rs.getString("pro_name"));
					pro.setProPrice(rs.getInt("pro_price"));
					pro.setSellerId(rs.getString("seller"));
					pro.setMemberId(rs.getString("member_id"));
					pro.setMemberScore(rs.getInt("member_score"));
					pro.setProReview(rs.getString("pro_review"));
					
					list.add(pro);
				}
			}catch(Exception e) {
				e.printStackTrace();
			}finally {
				disconn();
			}
			return list;
		}
	
	//제품ID로 리뷰정보 확인
	public List<ReviewList> showProReview(int proId){
		List<ReviewList>list = new ArrayList<>();
		ReviewList review = null;
		try {
			conn();
			String sql = "SELECT r.review_num, p.pro_name, r.member_id, r.member_score, r.pro_review \r\n"
					+ "FROM review_list r, product p\r\n"
					+ "WHERE r.pro_id = ? AND r.pro_id = p.pro_id";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, proId);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				review = new ReviewList();
				review.setReviewNum(rs.getInt("review_num"));
				review.setProName(rs.getString("pro_name"));
				review.setMemberId(rs.getString("member_id"));
				review.setMemberScore(rs.getInt("member_score"));
				review.setProReview(rs.getString("pro_review"));
				
				list.add(review);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		return list;
	}
	
	//리뷰 삭제
	public int deleteReview(int reNum) {
		int result =0;
		try {
			conn();
			String sql = "UPDATE review_list SET pro_review = null WHERE review_num = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, reNum);
			
			result = pstmt.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		return result;
	}
	
	//평점 삭제
	public int deleteProScore(int reNum) {
		int result =0;
		try {
			conn();
			String sql = "UPDATE review_list SET member_score = 0 WHERE review_num = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, reNum);
			
			result = pstmt.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		return result;
	}
	
	//구매 취소
	public int cancelBuy(int reviewId) {
		int result = 0;
		try {
			conn();
			String sql = "DELETE FROM review_list WHERE review_num = ?";
			pstmt= conn.prepareStatement(sql);
			pstmt.setInt(1, reviewId);
			
			result = pstmt.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		return result;
	}
	
	//구매번호로 구매내역 확인
	public ReviewList checkReviewNum(int reviewNum) {
		ReviewList rl = null;
		try {
			conn();
			String sql = "SELECT * FROM review_list WHERE review_num = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, reviewNum);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				rl = new ReviewList();
				rl.setReviewNum(rs.getInt("review_num"));
				rl.setProId(rs.getInt("pro_id"));
				rl.setMemberId(rs.getString("member_id"));
				rl.setMemberScore(rs.getInt("member_score"));
				rl.setProReview(rs.getString("pro_review"));
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		return rl;
	}
	
	
	//평점 남기기
	public int proScore(int proScore, int reviewId) {
		int result = 0;
		try {
			conn();
			String sql = "UPDATE review_list SET member_score = ? WHERE review_num = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, proScore);
			pstmt.setInt(2, reviewId);
			
			result = pstmt.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		return result;
	}
	
	//리뷰 남기기
	public int proReview(String proReview, int reviewId) {
		int result = 0;
		try {
			conn();
			String sql = "UPDATE review_list SET pro_review = ? WHERE review_num = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, proReview);
			pstmt.setInt(2, reviewId);
			
			result = pstmt.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		return result;
	}
}
