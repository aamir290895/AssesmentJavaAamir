package com.example.demo.layer3;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.layer2.model.*;

@Repository
public interface StudentRepo {
	void insertStudent(Student ref);
	Student selectStudentByStudentId(int StudentId);
	List<Student> selectAllStudent();
	void updateStudent(Student ref);
	void deleteStudent(int Student);
    Student findByempw(String email,String password);
    Student findByEmail(String email);
}
