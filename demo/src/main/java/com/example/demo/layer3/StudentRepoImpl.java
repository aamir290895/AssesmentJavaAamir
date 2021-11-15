package com.example.demo.layer3;

import java.util.List;

import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.layer2.model.Student;

@Repository
public class StudentRepoImpl extends BaseRepository implements StudentRepo {

	@Transactional
	public void insertStudent(Student ref) {
		// TODO Auto-generated method stub
		super.persist(ref);
	}

	@Transactional
	public Student selectStudentByStudentId(int StudentId) {
		// TODO Auto-generated method stub
		return super.find(Student.class,StudentId );
	}

	@Transactional	
	public List<Student> selectAllStudent() {
		// TODO Auto-generated method stub
		return super.findAll("Student");
	}

	@Transactional
	public void updateStudent(Student ref) {
		// TODO Auto-generated method stub
		super.merge(ref);
	}

	@Transactional
	public void deleteStudent(int StudentId) {
		// TODO Auto-generated method stub
		super.remove(Student.class,StudentId);
	}

	@Transactional
	public Student findByempw(String email, String password) {
		// TODO Auto-generated method stub
		Query q=entityManager.createQuery("select s from Student s where s.emailId=:em and s.password=:pw");
		q.setParameter("em", email);
		q.setParameter("pw", password);
		return (Student) q.getSingleResult();
	}

	@Transactional
	public Student findByEmail(String email) {
		// TODO Auto-generated method stub
		Query q=entityManager.createQuery("select s from Student s where s.emailId=:em");
		q.setParameter("em", email);
		
		return (Student) q.getSingleResult();

	}

}
