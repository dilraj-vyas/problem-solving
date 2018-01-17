package com.designPattern.builder;

public class EmployeeBuilder {
	private String empName;
	private int empId;
	private long mobileNo;
	private String email;

	public EmployeeBuilder setEmpName(String empName) {
		this.empName = empName;
		return this;
	}

	public EmployeeBuilder setEmpId(int empId) {
		this.empId = empId;
		return this;
	}

	public EmployeeBuilder setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
		return this;
	}

	public EmployeeBuilder setEmail(String email) {
		this.email = email;
		return this;
	}

	public Employee getComputer() {
		return new Employee(empName, empId, mobileNo, email);
	}

}
