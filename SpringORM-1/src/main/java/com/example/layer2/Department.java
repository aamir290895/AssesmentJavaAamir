package com.example.layer2;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="dept6")
public class Department {

	@Id
	@Column(name="deptno")
	private int departmentNumber;
	
	@Column(name="dname")
	private String departmentName;
	
	@Column(name="loc")
	private String departmentLocation;
	
	@OneToMany
	Set<Employee> set = new HashSet<Employee>();

	
	public int getDepartmentNumber() {
		return departmentNumber;
	}
	public void setDepartmentNumber(int departmentNumber) {
		this.departmentNumber = departmentNumber;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public String getDepartmentLocation() {
		return departmentLocation;
	}
	public void setDepartmentLocation(String departmentLocation) {
		this.departmentLocation = departmentLocation;
	}
	
	
	
}