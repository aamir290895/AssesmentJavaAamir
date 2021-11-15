package com.example.demo.layer3;

import java.util.List;

import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.layer2.model.Scheme;

@Repository
public class SchemeRepoImpl extends BaseRepository implements SchemeRepo{

	@Transactional

	public void insertScheme(Scheme ref) {
		// TODO Auto-generated method stub
		super.persist(ref);
	}

	@Transactional

	public Scheme selectSchemeBySchemeId(int SchemeId) {
		// TODO Auto-generated method stub
		return super.find(Scheme.class, SchemeId);
	}

	@Transactional

	public List<Scheme> selectAllScheme() {
		// TODO Auto-generated method stub
		return super.findAll("Scheme");
	}

	@Transactional

	public void updateScheme(Scheme ref) {
		// TODO Auto-generated method stub
		super.merge(ref);
	}

	@Transactional

	public void deleteScheme(int SchemeId) {
		// TODO Auto-generated method stub
		super.remove(Scheme.class, SchemeId);
	}

	@Transactional
	public Scheme getSchemeByName(String name) {
		// TODO Auto-generated method stub
		Query q=entityManager.createQuery("select s from Scheme s where s.schemeName=:schemename");
		q.setParameter("schemename", name);
		return (Scheme) q.getSingleResult();
	}

}
