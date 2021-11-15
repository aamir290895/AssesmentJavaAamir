package com.example.demo.layer4;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.layer2.model.Student;

@Service
public interface StudentService {

	List<Student> findAllStudentService();
	Student findStudentById(int id);
    void insertStudent(Student ref);
    void updateStudent(Student ref);
    void deleteStudent(int id);
    Student findStudentByempw(String email,String password);
    Student findStudentByEmail(String email);
}
