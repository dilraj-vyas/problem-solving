package com.interview.sorting;

import java.util.Date;

public class Employee {
	private String name;
	private Integer age;
	private Date dateOfJoining;
	private Integer id;

	
	
	public Employee(String name, Integer age, Date dateOfJoining, Integer id) {
		this.name = name;
		this.age = age;
		this.dateOfJoining = dateOfJoining;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Date getDateOfJoining() {
		return dateOfJoining;
	}

	public void setDateOfJoining(Date dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", dateOfJoining="
				+ dateOfJoining + ", id=" + id + "]";
	}


	
}
