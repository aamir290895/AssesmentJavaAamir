package com.example.demo.layer4;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.layer2.model.Statenodalofficer;
import com.example.demo.layer3.StateNodalOfficerRepo;

@Service
public class StatenodalofficerServiceImpl implements StatenodalofficerService{

	@Autowired
	StateNodalOfficerRepo staterepo;
	@Override
	public List<Statenodalofficer> findAllStatenodalofficerService() {
		// TODO Auto-generated method stub
		return staterepo.selectAllStatenodalofficer();
	}

	@Override
	public Statenodalofficer findStatenodalofficerByName(String name) {
		// TODO Auto-generated method stub
		return staterepo.selectStatenodalofficerByState(name);
	}

	@Override
	public void insertStatenodalofficer(Statenodalofficer ref) {
		// TODO Auto-generated method stub
		staterepo.insertStatenodalofficer(ref);
	}

	@Override
	public void updateStatenodalofficer(Statenodalofficer ref) {
		// TODO Auto-generated method stub
		staterepo.updateStatenodalofficer(ref);
	}

	@Override
	public void deleteStatenodalofficer(String ref) {
		// TODO Auto-generated method stub
		staterepo.deleteStatenodalofficer(ref);
	}

	@Override
	public Statenodalofficer getStateByempw(String email, String password) {
		// TODO Auto-generated method stub
		return staterepo.findStateByempw(email, password);
	}

	@Override
	public Statenodalofficer getStateByEmail(String email) {
		// TODO Auto-generated method stub
		return staterepo.findStateByEmail(email);
	}

	

}
