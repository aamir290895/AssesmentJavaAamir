package com.example.demo.layer4;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.layer2.model.Student;
import com.example.demo.layer3.StudentRepo;

@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	StudentRepo sturepo;
	@Override
	public List<Student> findAllStudentService() {
		// TODO Auto-generated method stub
		return sturepo.selectAllStudent();
	}

	@Override
	public Student findStudentById(int id) {
		// TODO Auto-generated method stub
		return sturepo.selectStudentByStudentId(id);
	}

	@Override
	public void insertStudent(Student ref) {
		// TODO Auto-generated method stub
		sturepo.insertStudent(ref);
	}

	@Override
	public void updateStudent(Student ref) {
		// TODO Auto-generated method stub
		sturepo.updateStudent(ref);
	}

	@Override
	public void deleteStudent(int id) {
		// TODO Auto-generated method stub
		sturepo.deleteStudent(id);
	}

	@Override
	public Student findStudentByempw(String email, String password) {
		// TODO Auto-generated method stub
		return sturepo.findByempw(email, password);
	}

	@Override
	public Student findStudentByEmail(String email) {
		// TODO Auto-generated method stub
		return sturepo.findByEmail(email);
	}

}
