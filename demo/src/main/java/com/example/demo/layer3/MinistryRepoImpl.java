package com.example.demo.layer3;

import java.util.List;

import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.layer2.model.Ministry;

@Repository(value="ministryrepo")
public class MinistryRepoImpl extends BaseRepository implements MinistryRepo{

	@Transactional
	public void insertMinistry(Ministry ref) {
		// TODO Auto-generated method stub
		super.persist(ref);
		
	}
    
	@Transactional
	public com.example.demo.layer2.model.Ministry selectMinistryByMinistryId(int MinistryId) {
		// TODO Auto-generated method stub
		return super.find(Ministry.class, MinistryId);
	}

	@Transactional
	public List<Ministry> selectAllMinistry() {
		// TODO Auto-generated method stub
		return super.findAll("Ministry");
	}

	@Transactional
	public void updateMinistry(Ministry ref) {
		// TODO Auto-generated method stub
		super.merge(ref);
	}

	@Transactional
	public void deleteMinistry(int MinistryId) {
		// TODO Auto-generated method stub
		super.remove(Ministry.class, MinistryId);
	}

	@Transactional
	public Ministry findMinistryByempw(String email, String password) {
		// TODO Auto-generated method stub
		Query q=entityManager.createQuery("select m from Ministry m where m.emailId=:em and m.password=:pw");
		q.setParameter("em",email);
		q.setParameter("pw", password);
		return (Ministry) q.getSingleResult();
	}

	@Transactional
	public Ministry fingMinistryByemail(String email) {
		// TODO Auto-generated method stub
		Query q=entityManager.createQuery("select m from Ministry m where m.emailId=:em");
		q.setParameter("em", email);
		return (Ministry) q.getSingleResult();
	}
     
}
