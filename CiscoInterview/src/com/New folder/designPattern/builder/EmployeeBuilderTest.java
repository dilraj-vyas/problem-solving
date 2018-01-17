package com.designPattern.builder;

public class EmployeeBuilderTest {
	public static void main(String[] args) {
		Employee emp = new EmployeeBuilder().setEmpId(123).setEmpName("Ashish")
				.setMobileNo(123545655).getComputer();
		System.out.println(emp);
	}
}
