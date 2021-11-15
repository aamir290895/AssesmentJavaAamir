package com.example.demo.layer4;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.layer2.model.Ministry;
import com.example.demo.layer2.model.Statenodalofficer;

@Service
public interface MinistryService {
	List<Ministry> findAllMinistryService();
	Ministry findMinistryById(int id);
	void insertMinistry(Ministry min);
    void updateMinistry(Ministry min);
    void deleteMinistry(int min);
    Ministry findMinistryByempw(String email,String password);
    Ministry findMinistryEmail(String email);
}
