package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.service.StudentService;

@Controller
@RequestMapping("/My")
public class StudentController {
	
	 @Autowired
     private StudentService studentService;
	 
	 
	 @GetMapping("/students")
	 public String listStudents(Model model) {
		 
		 
		 model.addAttribute("students",studentService.getAllStudents());
		return "students";
		 
	 }
     
     
     
}
