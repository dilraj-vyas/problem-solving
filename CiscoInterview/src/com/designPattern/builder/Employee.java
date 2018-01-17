package com.designPattern.builder;

public class Employee {
	private String empName;
	private int empId;
	private long mobileNo;
	private String email;

	public Employee(String empName, int empId, long mobileNo, String email) {
		this.empName = empName;
		this.empId = empId;
		this.mobileNo = mobileNo;
		this.email = email;
	}

	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", empId=" + empId
				+ ", mobileNo=" + mobileNo + ", email=" + email + "]";
	}

}
