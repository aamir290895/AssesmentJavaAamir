package com.example.demo.layer4;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.layer2.model.Studentapplication;
import com.example.demo.layer3.StudentApplicationRepo;

@Service
public class StudentApplicationServiceImpl implements StudentApplicationService {
	
	@Autowired
	StudentApplicationRepo stuapplrepo;
	public StudentApplicationServiceImpl()
	{
		System.out.println("StudentApplicationServiceImpl()");
	}
	
	
	
	public List<Studentapplication> findAllApplicationsService()
	{
		return stuapplrepo.selectAllStudentApplications();
	}



	@Override
	public Studentapplication findStudentAppliccationById(int id) {
		// TODO Auto-generated method stub
		return stuapplrepo.selectStudentapplicationByApplicationId(id);
	}



	@Override
	public void insertStudentapplication(Studentapplication ref) {
		// TODO Auto-generated method stub
		stuapplrepo.insertStudentApplication(ref);
	}



	@Override
	public void updateStudentapplication(Studentapplication ref) {
		// TODO Auto-generated method stub
		stuapplrepo.updateStudentApplication(ref);
	}



	@Override
	public void deleteStudentapplication(int id) {
		// TODO Auto-generated method stub
		stuapplrepo.deleteStudentApplication(id);
	}
}
