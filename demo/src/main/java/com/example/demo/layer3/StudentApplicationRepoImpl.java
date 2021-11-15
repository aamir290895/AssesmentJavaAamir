package com.example.demo.layer3;


import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.layer2.model.*;

@Repository
public class StudentApplicationRepoImpl extends BaseRepository implements StudentApplicationRepo{

	@Transactional
	public void insertStudentApplication(Studentapplication ref) {
		// TODO Auto-generated method stub
		super.persist(ref);
		
	}

	@Transactional
	public Studentapplication selectStudentapplicationByApplicationId(int applicationId) {
		// TODO Auto-generated method stub
		return super.find(Studentapplication.class, applicationId);
	}

	@Transactional
	public List<Studentapplication> selectAllStudentApplications() {
		// TODO Auto-generated method stub
		return super.findAll("Studentapplication");
	}

	@Transactional
	public void updateStudentApplication(Studentapplication ref) {
		// TODO Auto-generated method stub
		super.merge(ref);
	}

	@Transactional
	public void deleteStudentApplication(int applicationId) {
		// TODO Auto-generated method stub
		super.remove(Studentapplication.class, applicationId);
	}

	
}
