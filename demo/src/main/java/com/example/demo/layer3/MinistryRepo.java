package com.example.demo.layer3;



import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.layer2.model.Ministry;



@Repository
public interface MinistryRepo {
	void insertMinistry(Ministry ref);
	Ministry selectMinistryByMinistryId(int MinistryId);
	List<Ministry> selectAllMinistry();
	void updateMinistry(Ministry ref);
	void deleteMinistry(int MinistryId);
	Ministry findMinistryByempw(String email,String password);
    Ministry fingMinistryByemail(String email);
}
