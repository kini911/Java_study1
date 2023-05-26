package com.yedam.product;

import java.util.ArrayList;
import java.util.List;

import com.yedam.common.DAO;

public class ProductDAO extends DAO{
	
	private static ProductDAO pDAO = null;
	
	private ProductDAO() {
		
	}
	
	public static ProductDAO getInstance() {
		if(pDAO == null) {
			pDAO = new ProductDAO();
		}
		return pDAO;
	}
	
	//판매물품 리스트 조회(낮은가격순으로 조회)
	public List<Product> getProductList(){
		List<Product>list = new ArrayList<>();
		Product product = null;
		try {
			conn();
			String sql ="SELECT *\r\n"
					+ "FROM product\r\n"
					+ "ORDER BY 4";
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				product = new Product();
				product.setProId(rs.getInt("pro_id"));
				product.setMemberId(rs.getString("member_id"));
				product.setProName(rs.getString("pro_name"));
				product.setProPrice(rs.getInt("pro_price"));
				product.setProExplain(rs.getString("pro_explain"));
				list.add(product);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		return list;
	}
	
	//판매물품 리스트 조회(평점 순으로 조회)
	public List<Product> getProductScoreList(){
		List<Product>list = new ArrayList<>();
		Product product = null;
		try {
			conn();
			String sql ="SELECT p.pro_id, p.pro_name, p.pro_price,p.member_id, p.pro_explain, AVG(r.member_score) avg\r\n"
					+ "FROM product p, review_list r\r\n"
					+ "WHERE p.pro_id = r.pro_id(+)\r\n"
					+ "GROUP BY p.pro_id, p.pro_name, p.pro_price,p.member_id, p.pro_explain\r\n"
					+ "ORDER BY 6 desc NULLS LAST";
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				product = new Product();
				product.setProId(rs.getInt("pro_id"));
				product.setProName(rs.getString("pro_name"));
				product.setProPrice(rs.getInt("pro_price"));
				product.setMemberId(rs.getString("member_id"));
				product.setProExplain(rs.getString("pro_explain"));
				product.setReviewAvg(rs.getDouble("avg"));
				list.add(product);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		return list;
	}
	
	//이름으로 검색
	public List<Product> getProductNameList(String proName){
		List<Product>list = new ArrayList<>();
		Product product = null;
		try {
			conn();
			String sql ="SELECT *\r\n"
					+ "FROM product\r\n"
					+ "WHERE pro_name like ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "%"+proName+"%");
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				product = new Product();
				product.setProId(rs.getInt("pro_id"));
				product.setProName(rs.getString("pro_name"));
				product.setProPrice(rs.getInt("pro_price"));
				product.setMemberId(rs.getString("member_id"));
				product.setProExplain(rs.getString("pro_explain"));
				list.add(product);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		return list;
	}
	
	//가격범위로 검색
	public List<Product> getProductPriceList(int min, int max){
		List<Product>list = new ArrayList<>();
		Product product = null;
		try {
			conn();
			String sql ="SELECT *\r\n"
					+ "FROM product\r\n"
					+ "WHERE pro_price BETWEEN ? AND ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, min);
			pstmt.setInt(2, max);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				product = new Product();
				product.setProId(rs.getInt("pro_id"));
				product.setProName(rs.getString("pro_name"));
				product.setProPrice(rs.getInt("pro_price"));
				product.setMemberId(rs.getString("member_id"));
				product.setProExplain(rs.getString("pro_explain"));
				list.add(product);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		return list;
	}
	
	//판매물건ID로 물건정보 가져오기
	public Product proInfo(int proId) {
		Product pro = null;
		try {
			conn();
			String sql = "SELECT * FROM product WHERE pro_id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, proId);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				pro = new Product();
				pro.setProId(rs.getInt("pro_id"));
				pro.setMemberId(rs.getString("member_id"));
				pro.setProName(rs.getString("pro_name"));
				pro.setProPrice(rs.getInt("pro_price"));
				pro.setProExplain(rs.getString("pro_explain"));
				
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		return pro;
	}
	
	//판매자가 등록한 물건 삭제
	public int deletePro(int proId) {
		int result =0;
		try {
			conn();
			String sql ="DELETE FROM product WHERE pro_id =?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, proId);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				System.out.println("판매등록물품 삭제 완료");
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		return result;
	}
	
	//판매자가 등록한 물건 이름 수정
	public int updateProName(int proId, String proName) {
		int result = 0;
		try {
			conn();
			String sql = "UPDATE product SET pro_name = ? WHERE pro_id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, proName);
			pstmt.setInt(2, proId);
			rs = pstmt.executeQuery();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		return result;
	}
	
	//판매자가 등록한 물건 가격 수정
	public int updateProPrice(int proId, int proPrice) {
		int result =0;
		try {
			conn();
			String sql = "UPDATE product SET pro_price = ? WHERE pro_id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, proPrice);
			pstmt.setInt(2, proId);
			rs = pstmt.executeQuery();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		return result;
	}
	
	//판매자가 등록한 물건 설명 수정
	public int updateProExplain(int proId, String proExplain) {
		int result = 0;
		try {
			conn();
			String sql = "UPDATE product SET pro_explain = ? WHERE pro_id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, proExplain);
			pstmt.setInt(2, proId);
			rs = pstmt.executeQuery();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		return result;
	}
	
	//판매자 ID로 물건정보 가져오기
	public List<Product> sellerProInfo(String memId) {
		List<Product>list = new ArrayList<>();
		Product pro = null;
		try {
			conn();
			String sql = "SELECT * FROM product WHERE member_id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, memId);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				pro = new Product();
				pro.setProId(rs.getInt("pro_id"));
				pro.setMemberId(rs.getString("member_id"));
				pro.setProName(rs.getString("pro_name"));
				pro.setProPrice(rs.getInt("pro_price"));
				pro.setProExplain(rs.getString("pro_explain"));
				list.add(pro);
				
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		return list;
	}
	
	//판매 물품 등록
	public int regitProduct(Product pro) {
		int result = 0;
		try {
			conn();
			String sql = "INSERT INTO product VALUES (product_id_seq.NEXTVAL,?,?,?,?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, pro.getMemberId());
			pstmt.setString(2, pro.getProName());
			pstmt.setInt(3, pro.getProPrice());
			pstmt.setString(4, pro.getProExplain());
			
			result = pstmt.executeUpdate();
			if(result >0) {
				System.out.println("판매 등록 완료");
			}else if (result == 0) {
				System.out.println("판매 등록 실패..");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		return result;
	}
}
