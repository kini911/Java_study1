package com.yedam.departments;

public class Departments {
//	DEPARTMENT_ID   NOT NULL NUMBER(4)    
//	DEPARTMENT_NAME NOT NULL VARCHAR2(30)  
//	LOCATION_ID              NUMBER(4)   
	
	private int deptId;
	private String departmentName;
	private int locationId;
	
	public int getDeptId() {
		return deptId;
	}
	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public int getLocationId() {
		return locationId;
	}
	public void setLocationId(int locationId) {
		this.locationId = locationId;
	}
	
	@Override
	public String toString() {
		return "Departments [deptId=" + deptId + ", departmentName=" + departmentName + ", locationId=" + locationId
				+ "]";
	}
	
	
	
	
	
}
