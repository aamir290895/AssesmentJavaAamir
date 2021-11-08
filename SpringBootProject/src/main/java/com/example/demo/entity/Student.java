package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="Student")
public class Student {
	@Id
	@Column(name ="id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	
	@Column(name ="name")
	private String sName ;
	
	
	@Column(name ="email")
	private String sEmail;


	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Student(Long id, String sName, String sEmail) {
		super();
		this.id = id;
		this.sName = sName;
		this.sEmail = sEmail;
	}


	public String getsName() {
		return sName;
	}


	public void setsName(String sName) {
		this.sName = sName;
	}


	public String getsEmail() {
		return sEmail;
	}


	public void setsEmail(String sEmail) {
		this.sEmail = sEmail;
	}
	
	

}
