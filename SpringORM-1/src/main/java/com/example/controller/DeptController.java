package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.layer2.Department;
import com.example.layer3.DepartmentRepository;

@RestController
@RequestMapping("/dept")
public class DeptController {
	@Autowired
	DepartmentRepository deptRepo;

	@GetMapping("/get/{dno}") // localhost:8080/dept/get/14
	public Department getDept(@PathVariable("dno") int x) {
		Department dept;
		dept = deptRepo.selectDepartment(x);
		return dept;
	}

	@GetMapping("/getAll") // localhost:8080/dept/getAll
	public List<Department> getDepts() {
		List<Department> deptList;
		deptList = deptRepo.selectDepartments();
		return deptList;
	}

	@PostMapping("/add") // localhost:8080/dept/add
	public void addDept(@RequestBody Department deptObj) {
		deptRepo.insertDepartment(deptObj);

	}

	@PutMapping("/update") // localhost:8080/dept/add
	public void updateDept(@RequestBody Department deptObj) {
		deptRepo.updateDepartment(deptObj);

	}

	@DeleteMapping("/delete/{dno}") // localhost:8080/dept/get/14
	public String delDept(@PathVariable("dno") int x) {

		deptRepo.deleteDepartment(x);
		return "deleted....";
	}

}
