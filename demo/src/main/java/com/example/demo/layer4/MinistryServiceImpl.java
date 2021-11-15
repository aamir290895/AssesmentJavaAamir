package com.example.demo.layer4;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.layer2.model.Ministry;
import com.example.demo.layer3.MinistryRepo;

@Service
public class MinistryServiceImpl implements MinistryService{

	@Autowired
	MinistryRepo minrepo;
	@Override
	public List<Ministry> findAllMinistryService() {
		// TODO Auto-generated method stub
		return minrepo.selectAllMinistry();
	}

	@Override
	public Ministry findMinistryById(int id) {
		// TODO Auto-generated method stub
		return minrepo.selectMinistryByMinistryId(id);
	}

	@Override
	public void insertMinistry(Ministry min) {
		// TODO Auto-generated method stub
		minrepo.insertMinistry(min);
	}

	@Override
	public void updateMinistry(Ministry min) {
		// TODO Auto-generated method stub
		minrepo.updateMinistry(min);
	}

	@Override
	public void deleteMinistry(int min) {
		// TODO Auto-generated method stub
		minrepo.deleteMinistry(min);
	}

	@Override
	public Ministry findMinistryByempw(String email, String password) {
		// TODO Auto-generated method stub
		return minrepo.findMinistryByempw(email, password);
	}

	@Override
	public Ministry findMinistryEmail(String email) {
		// TODO Auto-generated method stub
		return minrepo.fingMinistryByemail(email);
	}

}
