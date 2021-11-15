package com.example.demo.layer3;

import java.util.List;

import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.layer2.model.Instituteapplication;

@Repository
public class InstituteApplicationRepoImpl extends BaseRepository implements InstituteApplicationRepo{

	@Transactional
	public void insertInstituteapplication(Instituteapplication ref) {
		// TODO Auto-generated method stub
		super.persist(ref);
	}

	@Transactional
	public Instituteapplication selectInstituteapplicationByInstituteapplicationId(int InstituteapplicationId) {
		// TODO Auto-generated method stub
		return super.find(Instituteapplication.class, InstituteapplicationId);
	}

	@Transactional
	public List<Instituteapplication> selectAllInstituteapplication() {
		// TODO Auto-generated method stub
		return super.findAll("Instituteapplication");
	}

	@Transactional
	public void updateInstituteapplication(Instituteapplication ref) {
		// TODO Auto-generated method stub
		super.merge(ref);
	}

	@Transactional
	public void deleteInstituteapplication(int InstituteapplicationId) {
		// TODO Auto-generated method stub
		super.remove(Instituteapplication.class, InstituteapplicationId);
	}

	@Transactional
	public Instituteapplication getByEmail(int email, String password) {
		// TODO Auto-generated method stub
		Query q=entityManager.createQuery("select i from Instituteapplication i where i.diseCode= :em and i.password=:pass");
		q.setParameter("em", email);
		q.setParameter("pass", password);
		return (Instituteapplication) q.getSingleResult();
	}

	@Override
	public Instituteapplication getByInsCode(int email) {
		// TODO Auto-generated method stub
		Query q=entityManager.createQuery("select i from Instituteapplication i where i.diseCode= :em");
		q.setParameter("em", email);
		
		return (Instituteapplication) q.getSingleResult();

	}

}
