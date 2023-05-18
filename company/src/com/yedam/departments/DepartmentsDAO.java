package com.yedam.departments;

import java.util.ArrayList;
import java.util.List;

import com.yedam.common.DAO;

public class DepartmentsDAO extends DAO{
	//싱글톤 - 스스로 객체화
	private static DepartmentsDAO deptDao = null;
	//외부에서 객체 생성하지 못하게 프라이빗 생성자 만들어줌
	private DepartmentsDAO() {
		
	}
	
	public static DepartmentsDAO getInstance() {
		//널인지 아닌지 파악해서 객체 생성해주는 if문
		if( deptDao == null) {
			deptDao = new DepartmentsDAO();
		}
		return deptDao;
	}
	
	public List<Departments> getDepartmentsList(){
		List<Departments> list = new ArrayList<>();
		Departments dept = null;
		//DB랑 연동해서 사용하기 때문에 예외를 잡아줄수 있는 try catch문을 꼭 넣어야함
		try {
			conn();
			String sql = "SELECT * FROM departments";
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				dept = new Departments();
				
				dept.setDeptId(rs.getInt("department_id"));
				dept.setDepartmentName(rs.getString("department_name"));
				dept.setLocationId(rs.getInt("location_id"));
				//rs가 가져온 값들을 list에 넣어줘야함
				list.add(dept);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		return list;
	}
	
	//단건 조회
	public Departments getDepartment(int deptId) {
		//DB에 departments 테이블의 프라이머리키를 가져옴 왜냐면 프라이머리키는 널값을 가지지않고 중복이 없기 때문
		Departments dept = null;
		try {
			conn();	
			String sql = "SELECT * FROM departments WHERE department_id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, deptId);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				dept=new Departments();
				dept.setDeptId(rs.getInt("department_id"));
				dept.setDepartmentName(rs.getString("department_name"));
				dept.setLocationId(rs.getInt("location_id"));
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		return dept;
	}
	
	public int insertDept(Departments dept) {
		int result = 0;
		try {
			conn();
			String sql = "insert into departments(department_id, department_name, location_id) values(?,?,?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, dept.getDeptId());
			pstmt.setString(2, dept.getDepartmentName());
			pstmt.setInt(3, dept.getLocationId());
			
			result = pstmt.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		return result;
	}
	
	
	
	
	
}
