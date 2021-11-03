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

import com.example.layer2.Employee;
import com.example.layer3.EmployeeRepository;

@RestController
@RequestMapping("/emp")

public class EmployeeController {
	@Autowired
	EmployeeRepository empRepo; 
	   
	
	@GetMapping("/get/{eno}") //localhost:8080/dept/get/14
	    public Employee getEmp(@PathVariable("eno") int x) {
	    Employee emp ;
	    emp = empRepo.selectEmployee(x);
	    return emp;
	    }

	    @GetMapping("/getAll") //localhost:8080/dept/getAll
	    public List<Employee> getDepts(){
	    List<Employee> empList ;
	    empList = empRepo.selectEmployes();
	    return empList;
	    }

	    @PostMapping("/add") //localhost:8080/dept/add
	    public void addEmp (@RequestBody Employee empObj) {
	    empRepo.insertEmployee(empObj);

	    }
	    @PutMapping("/update") //localhost:8080/dept/add
	    public void updateEmployee(@RequestBody Employee empObj) {
	    empRepo.updateEmployee(empObj);

	    }
	   
	    @DeleteMapping("/delete/{eno}") //localhost:8080/dept/get/14
	    public String delEmp(@PathVariable("eno") int x) {
	   
	    empRepo.deleteEmployee(x);
	    return "deleted....";
	    }

}
