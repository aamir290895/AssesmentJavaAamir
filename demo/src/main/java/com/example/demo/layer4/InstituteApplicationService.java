package com.example.demo.layer4;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.layer2.model.*;

@Service
public interface InstituteApplicationService {

	List<Instituteapplication> findAllInstituteapplicationService();
	Instituteapplication findInstituteapplicationById(int id);
    void insertInstituteapplication(Instituteapplication ref);
    void updateInstituteapplication(Instituteapplication ref);
    void deleteInstituteapplication(int id);
    Instituteapplication findBy(int email,String password);
    Instituteapplication findById(int email);
}
