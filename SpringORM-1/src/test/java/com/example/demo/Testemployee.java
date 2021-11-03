package com.example.demo;

import java.time.LocalDate;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.layer2.Department;
import com.example.layer2.Employee;
import com.example.layer3.EmployeeRepositoryImpl;

@SpringBootTest
public class Testemployee {
	@Autowired
	EmployeeRepositoryImpl empRepo;

	@Test
	void insertEmpTest() {
		
		LocalDate ld = LocalDate.of(2021,10,11);
		Employee emp = new Employee();
		emp.setEmpNo(6);
		emp.setEmpName("Aamir");
		emp.setJob("developer");
		emp.setMgr(7839);
		emp.setHireDate(ld);
		emp.setSalary(11000);
		emp.setComm(32);
		emp.setDeptNo(1);
		empRepo.insertEmployee(emp);
		
	}
	
	@Test
	void updateEmpTest() {
		Employee emp = new Employee();
		emp.setEmpName("Aamir Khan");
		emp.setJob("QA");
		emp.setEmpNo(5);
		emp.setMgr(7839);
		emp.setSalary(11000);
		emp.setComm(32);
		emp.setDeptNo(1);
		empRepo.updateEmployee(emp);
	}
	@Test
	void deleteEmployeeTest() {
		
		empRepo.deleteEmployee(7698);
	}
	
	@Test
	   void selectAllDeptTest() {
		   List<Employee> empList;
		   empList = empRepo.selectEmployes();
		  
		   
	   }
	   
	   @Test
	   void selectEmpTest() {
		   Employee emp;
		   emp = empRepo.selectEmployee(7839);
		 

	   }

  
	
}
