package com.eksad.latihanjdbc.model;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.eksad.latihanjdbc.EmployeeService;

public class Employee {

	private int id;
	private String name;
	private String address;
	private String dob;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}


	


	
}
