package com.example.demo.layer5;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.layer2.model.Ministry;
import com.example.demo.layer2.model.Student;
import com.example.demo.layer4.MinistryService;
import com.example.demo.layer4.StudentService;

@CrossOrigin
@RestController

public class StudentController {

	@Autowired
	StudentService minser;
	
	@RequestMapping(path="/getStudent")
	public List<Student> getAllStudent()
	{
		return minser.findAllStudentService();
	}
	
	@RequestMapping(path="/getStudent/{id}")
	public Student getStudentById(@PathVariable("id") int id)
	{
		return minser.findStudentById(id);
	}
	
	@PostMapping
	@RequestMapping(path="/insertStudent")
	public void insertStudent(@RequestBody Student ref)
	{
		Student s=new Student();
		s.setAadharNumber(ref.getAadharNumber());
		s.setBankAccountNumber(ref.getBankAccountNumber());
		s.setBankBalance(ref.getBankBalance());
		s.setBankIfscCode(ref.getBankIfscCode());
		s.setBankName(ref.getBankName());
		s.setDistrict(ref.getDistrict());
		s.setDob(ref.getDob());
		s.setEmailId(ref.getEmailId());
		s.setGender(ref.getGender());
		s.setInstituteapplication(ref.getInstituteapplication());
		s.setMobileNumber(ref.getMobileNumber());
		s.setPassword(ref.getPassword());
		s.setState(ref.getState());
		s.setStudentapplications(ref.getStudentapplications());
		s.setStudentName(ref.getStudentName());
		minser.insertStudent(s);
	}
	
	@PostMapping
	@RequestMapping(path="/updateStudent")
	public void updateStudent(@RequestBody Student ref)
	{
		minser.updateStudent(ref);
	}
	
	@PostMapping
	@RequestMapping(path="/deleteStudent")
	public void deleteStudent(@RequestBody Student ref)
	{
		minser.deleteStudent(ref.getStudentId());
	}
	
	@RequestMapping(path="/findStudentByempw/{email}/{password}")
	public Student findStudentByempw(@PathVariable("email") String email,@PathVariable("password") String password)
	{
		return minser.findStudentByempw(email, password);
	}
	
	@RequestMapping(path="/findStudentByEmail/{email}")
	public Student findStudentByEmail(@PathVariable("email") String email)
	{
		return minser.findStudentByEmail(email);
	}
}
