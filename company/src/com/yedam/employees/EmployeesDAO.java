package com.yedam.employees;

import java.util.ArrayList;
import java.util.List;

import com.yedam.common.DAO;

public class EmployeesDAO extends DAO {
	// 싱글통 활용해서 DB에 접속
	private static EmployeesDAO empDao = null;

	private EmployeesDAO() {

	}

	public static EmployeesDAO getInstance() {
		if (empDao == null) {
			empDao = new EmployeesDAO();
		}
		return empDao; // empDao -> 객체임
	}

	// 전체 조회
	public List<Employees> getEmployeesList() {
		// 리스트를 활용해서 Employees의 정보를 담아줌 -> 조회한 인원수 만큼 데이터 입력가능
		List<Employees> list = new ArrayList<>();
		Employees emp = null;
		try {
			conn();
			String sql = "SELECT * FROM employees";
			//			  SELECT *이기 때문에 테이블의 칼럼이름이 출력되는데 만약 조회할때 별칭을 추가한다면 아래 while문에서 get..(안에 별칭을 입력해야함)
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			//조회된 결과가 rs에 들어감
			while(rs.next()) {
				emp = new Employees();
				//						ex) "employee_id"-> 테이블의 칼럼이름이 아니라 조회된 결과임!!(바꾼 별칭이 들어간다)
				emp.setEmployeeId(rs.getInt("employee_id"));
				//employee_id 칼럼에 있는 숫자를 rs에 넣는다
				emp.setLastName(rs.getString("last_name"));
				emp.setEmail(rs.getString("email"));
				emp.setJobId(rs.getString("job_id"));
				emp.setHireDate(rs.getDate("hire_date"));
				list.add(emp);
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			disconn();
		}
		return list;
	}
	
	//단건 조회(한건 조회)
	public Employees getEmployee(int empid) {
		Employees emp =null;
		try {
			conn();
			String sql = "SELECT * FROM employees WHERE employee_id = ?";	//pstmt사용 방식 => ?를 사용
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, empid);
			//	  setInt(몇번째 물음표에 값을 넣을건가, )
			rs = pstmt.executeQuery();
			// 	  next() - 데이터가 있는지 없는지 확인후 데이터가 있으면 가져옴 ->null이 나오면 조회x / 객체가 나오면 조회o
			if(rs.next()) {
				emp = new Employees();
				emp.setEmployeeId(rs.getInt("employee_id"));
				emp.setLastName(rs.getString("last_name"));
				emp.setEmail(rs.getString("email"));
				emp.setJobId(rs.getString("job_id"));
				emp.setHireDate(rs.getDate("hire_date"));
				
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			disconn();
		}
		return emp;
	}
	
	//등록(insert)
	public int insertEmp(Employees emp) {
		int result = 0;
		try {
			conn();
			String sql = "insert into employees(employee_id, last_name, email, hire_date, job_id) values(?,?,?,?,?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, emp.getEmployeeId());
			pstmt.setString(2, emp.getLastName());;
			pstmt.setString(3, emp.getEmail());
			pstmt.setDate(4, emp.getHireDate());
			pstmt.setString(5, emp.getJobId());
			
			result = pstmt.executeUpdate();
			//result => 결과값이 진행된 횟수를 나타냄
			//입력이 안된경우 result =0; / 입력이 된 경우 입력된 횟수만큼 result 값이 올라감
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		return result;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
