package com.interview.sorting;

import java.util.Comparator;

public class EmployeesStrategy implements Comparator<Employee> {

	public int compare(Employee emp1, Employee emp2) {

		if (emp1.getAge().equals(emp2.getAge())) {
			if (emp1.getName().equals(emp2.getAge())) {
				return emp1.getDateOfJoining().compareTo(
						emp2.getDateOfJoining());
			} else
				return emp1.getName().compareTo(emp2.getName());
		} else
			return emp1.getAge().compareTo(emp2.getAge());

	}

}
