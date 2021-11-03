package com.example.demo;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.layer2.Department;
import com.example.layer3.DepartmentRepositoryImpl;
import com.example.layer3.EmployeeRepositoryImpl;

@SpringBootTest
class SpringOrm1ApplicationTests {
	
	@Autowired
	DepartmentRepositoryImpl deptRepo;
	
	@Autowired
	EmployeeRepositoryImpl empRepo;
	
	@Test
	void insertDeptTest() {
		Department dept = new Department();
		dept.setDepartmentName("QA");
		dept.setDepartmentNumber(9);
		dept.setDepartmentLocation("sdl");
		
		deptRepo.insertDepartment(dept);
	}
	
	
	@Test
	void updateDeptTest() {
		Department dept = new Department();
		dept.setDepartmentName("developer");
		dept.setDepartmentNumber(786);
		dept.setDepartmentLocation("Pune");
		
		deptRepo.updateDepartment(dept);
	}
	
	@Test
	void deleteDeptTest() {
		
		deptRepo.deleteDepartment(2);
	}
  
  
	@Test
   void selectAllDeptTest() {
	   List<Department> deptList;
	   deptList = deptRepo.selectDepartments();
	   for(Department dept : deptList) {
		   System.out.println("Dept no :" + dept.getDepartmentNumber());
		   System.out.println("Dept no :" + dept.getDepartmentName());
		   System.out.println("Dept no :" + dept.getDepartmentLocation());

	   }
	   
   }
   
   @Test
   void selectDeptTest() {
	   Department dept;
	   dept = deptRepo.selectDepartment(786);
	   System.out.println("Dept no :" + dept.getDepartmentNumber());
	   System.out.println("Dept no :" + dept.getDepartmentName());
	   System.out.println("Dept no :" + dept.getDepartmentLocation());

   }

}
