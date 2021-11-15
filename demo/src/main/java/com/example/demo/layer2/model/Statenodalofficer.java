package com.example.demo.layer2.model;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.List;


/**
 * The persistent class for the STATENODALOFFICER database table.
 * 
 */
@Entity
@NamedQuery(name="Statenodalofficer.findAll", query="SELECT s FROM Statenodalofficer s")
public class Statenodalofficer implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	
	@Column(name="STATE_NAME")
	private String stateName;

	@Column(name="EMAIL_ID")
	private String emailId;

	@Column(name="MOBILE_NUMBER")
	private String mobileNumber;

	@Column(name="OFFICER_NAME")
	private String officerName;

	private String password;

	//bi-directional many-to-one association to Instituteapplication
	@OneToMany(mappedBy="statenodalofficer", fetch=FetchType.EAGER)
	private List<Instituteapplication> instituteapplications;

	public Statenodalofficer() {
	}

	public String getStateName() {
		return this.stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	public String getEmailId() {
		return this.emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getMobileNumber() {
		return this.mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getOfficerName() {
		return this.officerName;
	}

	public void setOfficerName(String officerName) {
		this.officerName = officerName;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@JsonIgnore
	public List<Instituteapplication> getInstituteapplications() {
		return this.instituteapplications;
	}

	
	public void setInstituteapplications(List<Instituteapplication> instituteapplications) {
		this.instituteapplications = instituteapplications;
	}

	
	public Instituteapplication addInstituteapplication(Instituteapplication instituteapplication) {
		getInstituteapplications().add(instituteapplication);
		instituteapplication.setStatenodalofficer(this);

		return instituteapplication;
	}

	public Instituteapplication removeInstituteapplication(Instituteapplication instituteapplication) {
		getInstituteapplications().remove(instituteapplication);
		instituteapplication.setStatenodalofficer(null);

		return instituteapplication;
	}

}