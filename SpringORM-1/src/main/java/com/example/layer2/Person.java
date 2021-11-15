package com.example.layer2;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name ="person")
public class Person {
	
	@Id
	@GeneratedValue
	private int personId; //1
	
	private String personName; //2
	
	@OneToOne
	private Passport passport;//hasA
	
	
	
	public Passport getPassport() {
		return passport;
	}


	public void setPassport(Passport passport) {
		this.passport = passport;
	}


	public Person() {
		// TODO Auto-generated constructor stub
		System.out.println("Person()...");
	}


	public int getPersonId() {
		return personId;
	}


	public void setPersonId(int personId) {
		this.personId = personId;
	}


	public String getPersonName() {
		return personName;
	}


	public void setPersonName(String personName) {
		this.personName = personName;
	}
	

}
