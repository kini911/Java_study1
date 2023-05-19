package com.yedam.store;

import java.util.ArrayList;
import java.util.List;

import com.yedam.common.DAO;
import com.yedam.store.Store;

public class StoreDAO extends DAO{
	
	private static StoreDAO storeDao = null;
	
	private StoreDAO() {
		
	}
	
	public static StoreDAO getInstance() {
		if(storeDao == null) {
			storeDao = new StoreDAO();
		}
		return storeDao;
	}
	
	//전체 가게 조회
	public List<Store> getStoreList(){
		List<Store>list = new ArrayList();
		Store store = null;
		try {
			conn();
			String sql = "SELECT * FROM store";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				store = new Store();
				store.setStoreId(rs.getInt("store_id"));
				store.setStoreName(rs.getString("store_name"));
				store.setStoreTel(rs.getString("store_tel"));
				store.setStoreAddr(rs.getString("store_addr"));
				store.setStoreSales(rs.getString("store_sales"));
				
				list.add(store);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		return list;
	}
	
	
	
	//가게 등록
	public int insertStore(Store store) {
		int result = 0;
		try {
			conn();
			String sql = "INSERT INTO store values(?,?,?,?,?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, store.getStoreId());
			pstmt.setString(2, store.getStoreName());
			pstmt.setString(3, store.getStoreTel());
			pstmt.setString(4, store.getStoreAddr());
			pstmt.setString(5, store.getStoreSales());
			
			result = pstmt.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		return result;
	}
	
	//가게 ID중복확인
	public int idCheck(int id) {
		int storeId = 0;
		try {
			conn();
			String sql = "SELECT * FROM store WHERE store_id =?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, id);
			
			rs = pstmt.executeQuery();
			if(rs.next()) {
				Store store = new Store();
				store.setStoreId(rs.getInt("store_id"));
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		return storeId;
	}
	
	//지역구별 매출 합계
	public List<Store> getAnalyze(){
		List<Store>list = new ArrayList<>();
		Store store = null;
		try {
			conn();
			String sql = "SELECT store_addr, sum(store_sales) total FROM store GROUP BY store_addr";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				store = new Store();
				store.setStoreAddr(rs.getString("store_addr"));
				store.setSum(rs.getDouble("total"));
				
				list.add(store);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		return list;
	}
	
	//매출 수정
	public int updateSales(Store store) {
		int result = 0;
		try {
			conn();
			String sql = "UPDATE store SET store_sales =? WHERE store_id=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, store.getStoreSales());
			pstmt.setInt(2, store.getStoreId());
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		return result;
	}
	
	
}
