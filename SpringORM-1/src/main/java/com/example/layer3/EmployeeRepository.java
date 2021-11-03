package com.example.layer3;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.layer2.Employee;
@Repository
public interface EmployeeRepository {
void insertEmployee(Employee eobj); //C
	
	Employee selectEmployee(int eno); //R
	List<Employee> selectEmployes(); //RA
	
	void updateEmployee(Employee eObj); //U
	void deleteEmployee(int eno); //D
}
