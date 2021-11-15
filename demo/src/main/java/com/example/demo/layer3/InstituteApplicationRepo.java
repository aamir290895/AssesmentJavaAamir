package com.example.demo.layer3;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.layer2.model.*;

@Repository
public interface InstituteApplicationRepo {
	void insertInstituteapplication(Instituteapplication ref);
	Instituteapplication selectInstituteapplicationByInstituteapplicationId(int InstituteapplicationId);
	List<Instituteapplication> selectAllInstituteapplication();
	void updateInstituteapplication(Instituteapplication ref);
	void deleteInstituteapplication(int InstituteapplicationId);
    Instituteapplication getByEmail(int email,String password);
    Instituteapplication getByInsCode(int email);
}
