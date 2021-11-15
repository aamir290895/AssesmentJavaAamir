package com.example.demo.layer3;



import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.layer2.model.Studentapplication;


@Repository
public interface StudentApplicationRepo {
	void insertStudentApplication(Studentapplication ref);
	Studentapplication selectStudentapplicationByApplicationId(int applicationId);
	List<Studentapplication> selectAllStudentApplications();
	void updateStudentApplication(Studentapplication ref);
	void deleteStudentApplication(int applicationId);

}
