package com.example.demo.layer4;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.layer2.model.Studentapplication;
import com.example.demo.layer3.StudentApplicationRepo;

@Service
public interface StudentApplicationService {
	List<Studentapplication> findAllApplicationsService();
	Studentapplication findStudentAppliccationById(int id);
	void insertStudentapplication(Studentapplication ref);
	void updateStudentapplication(Studentapplication ref);
	void deleteStudentapplication(int id);
}
