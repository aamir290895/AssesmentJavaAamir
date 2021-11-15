package com.example.demo.layer4;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.layer2.model.Instituteapplication;
import com.example.demo.layer3.InstituteApplicationRepo;

@Service
public class InstituteApplicationServiceImpl implements InstituteApplicationService {

	@Autowired
	InstituteApplicationRepo insapplrepo;
	@Override
	public List<Instituteapplication> findAllInstituteapplicationService() {
		// TODO Auto-generated method stub
		return insapplrepo.selectAllInstituteapplication();
	}

	@Override
	public Instituteapplication findInstituteapplicationById(int id) {
		// TODO Auto-generated method stub
		return insapplrepo.selectInstituteapplicationByInstituteapplicationId(id);
	}

	@Override
	public void insertInstituteapplication(Instituteapplication ref) {
		// TODO Auto-generated method stub
		insapplrepo.insertInstituteapplication(ref);
	}

	@Override
	public void updateInstituteapplication(Instituteapplication ref) {
		// TODO Auto-generated method stub
		insapplrepo.updateInstituteapplication(ref);
	}

	@Override
	public void deleteInstituteapplication(int id) {
		// TODO Auto-generated method stub
		insapplrepo.deleteInstituteapplication(id);
	}

	@Override
	public Instituteapplication findBy(int email, String password) {
		// TODO Auto-generated method stub
		return insapplrepo.getByEmail(email, password);
	}

	@Override
	public Instituteapplication findById(int email) {
		// TODO Auto-generated method stub
		return insapplrepo.getByInsCode(email);
	}

}
