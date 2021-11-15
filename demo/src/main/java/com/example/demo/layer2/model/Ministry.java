package com.example.demo.layer2.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the MINISTRY database table.
 * 
 */
@Entity
@NamedQuery(name="Ministry.findAll", query="SELECT m FROM Ministry m")
public class Ministry implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="MINISTRY_ID")
	private int ministryId;

	@Column(name="EMAIL_ID")
	private String emailId;

	@Column(name="MOBILE_NUMBER")
	private String mobileNumber;

	@Column(name="OFFICER_NAME")
	private String officerName;

	private String password;

	public Ministry() {
	}

	public int getMinistryId() {
		return this.ministryId;
	}

	public void setMinistryId(int ministryId) {
		this.ministryId = ministryId;
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

	public Ministry(int ministryId, String emailId, String mobileNumber, String officerName, String password) {
		super();
		this.ministryId = ministryId;
		this.emailId = emailId;
		this.mobileNumber = mobileNumber;
		this.officerName = officerName;
		this.password = password;
	}
	

}