package com.interview.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class TestEmployee {
	public static void main(String[] args) {

		List<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee("Ankit", 22, new Date("09/10/2017"), 11));
		employees.add(new Employee("Anil", 24, new Date("09/10/2017"), 12));
		employees.add(new Employee("Avinash", 19, new Date("09/10/2017"), 13));
		employees.add(new Employee("Sourabh", 19, new Date("09/10/2017"), 14));
		employees.add(new Employee("Sunil", 28, new Date("09/10/2017"), 15));
		employees.add(new Employee("Ankita", 20, new Date("09/10/2017"), 16));

		System.out.println(employees);

		Collections.sort(employees, new EmployeesStrategy());

		System.out.println(employees);

	}
}
