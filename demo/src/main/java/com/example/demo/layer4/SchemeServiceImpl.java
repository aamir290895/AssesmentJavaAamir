package com.example.demo.layer4;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.layer2.model.Scheme;
import com.example.demo.layer3.SchemeRepo;

@Service
public class SchemeServiceImpl implements SchemeService {

	@Autowired
	SchemeRepo schrepo;
	@Override
	public List<Scheme> findAllSchemeService() {
		// TODO Auto-generated method stub
		return schrepo.selectAllScheme();
	}

	@Override
	public Scheme findSchemeById(int id) {
		// TODO Auto-generated method stub
		return schrepo.selectSchemeBySchemeId(id);
	}

	@Override
	public void insertScheme(Scheme ref) {
		// TODO Auto-generated method stub
		schrepo.insertScheme(ref);
	}

	@Override
	public void updateScheme(Scheme ref) {
		// TODO Auto-generated method stub
		schrepo.updateScheme(ref);
	}

	@Override
	public void deleteScheme(int ref) {
		// TODO Auto-generated method stub
		schrepo.deleteScheme(ref);
	}

	@Override
	public Scheme getSchemeByName(String name) {
		// TODO Auto-generated method stub
		return schrepo.getSchemeByName(name);
	}

}
