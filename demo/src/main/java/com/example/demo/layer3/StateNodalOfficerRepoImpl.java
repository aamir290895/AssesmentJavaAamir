package com.example.demo.layer3;



import java.util.List;

import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.layer2.model.Statenodalofficer;



@Repository(value="staterepo")
public class StateNodalOfficerRepoImpl extends BaseRepository implements StateNodalOfficerRepo {

	@Transactional
	public void insertStatenodalofficer(Statenodalofficer ref) {
		// TODO Auto-generated method stub
		super.persist(ref);
		
	}

	@Transactional
	public Statenodalofficer selectStatenodalofficerByState(String Statename) {
		// TODO Auto-generated method stub
		return super.find(Statenodalofficer.class, Statename);
	}

	@Transactional
	public List<Statenodalofficer> selectAllStatenodalofficer() {
		// TODO Auto-generated method stub
		return super.findAll("Statenodalofficer");
	}

	@Transactional
	public void updateStatenodalofficer(Statenodalofficer ref) {
		// TODO Auto-generated method stub
		super.merge(ref);
	}

	@Transactional
	public void deleteStatenodalofficer(String Statename) {
		// TODO Auto-generated method stub
		super.remove(Statenodalofficer.class, Statename);
		
	}

	@Transactional
	public Statenodalofficer findStateByempw(String email, String password) {
		// TODO Auto-generated method stub
		Query q=entityManager.createQuery("select s from Statenodalofficer s where s.emailId= :em and s.password= :pw");
		q.setParameter("em", email);
		q.setParameter("pw", password);
		return (Statenodalofficer) q.getSingleResult();
		
	}

	@Transactional
	public Statenodalofficer findStateByEmail(String email) {
		// TODO Auto-generated method stub
		Query q=entityManager.createQuery("select s from Statenodalofficer s where s.emailId= :em");
		q.setParameter("em", email);
		
		return (Statenodalofficer) q.getSingleResult();
		}

}
