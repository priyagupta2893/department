package com.cdp.department.models;

public class GetDepartmentDetailsResponse {

	public GetDepartmentDetailsResponse(int deptNumber, String deptName) {
		super();
		this.deptNumber = deptNumber;
		this.deptName = deptName;
	}

	public int deptNumber;
	public String deptName;

	public int getDeptNumber() {
		return deptNumber;
	}

	public void setDeptNumber(int deptNumber) {
		this.deptNumber = deptNumber;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

}
