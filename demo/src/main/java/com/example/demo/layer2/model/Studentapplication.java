package com.example.demo.layer2.model;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the STUDENTAPPLICATION database table.
 * 
 */
@Entity
@NamedQuery(name="Studentapplication.findAll", query="SELECT s FROM Studentapplication s")
public class Studentapplication implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="APPLICATION_ID")
	private int applicationId;

	@Temporal(TemporalType.DATE)
	@Column(name="APPLIED_DATE")
	private Date appliedDate;

	private String community;

	private String course;

	private String disablility;

	@Column(name="FATHER_NAME")
	private String fatherName;

	private double income;

	@Temporal(TemporalType.DATE)
	@Column(name="INSTITUTE_ACCEPTED_DATE")
	private Date instituteAcceptedDate;

	@Temporal(TemporalType.DATE)
	@Column(name="MINISTRY_ACCEPTED_DATE")
	private Date ministryAcceptedDate;

	@Column(name="MOTHER_NAME")
	private String motherName;

	private String religion;

	@Temporal(TemporalType.DATE)
	@Column(name="STATE_ACCEPTE_DDATE")
	private Date stateAccepteDdate;

	private String status;

	@Column(name="TENTH_PERCENTAGE")
	private double tenthPercentage;

	@Column(name="TWELVTH_PERCENTAGE")
	private double twelvthPercentage;

	//bi-directional many-to-one association to Scheme
	@ManyToOne
	@JoinColumn(name="SCHEME_ID")
	private Scheme scheme;

	//bi-directional many-to-one association to Student
	@ManyToOne
	@JoinColumn(name="STUDENT_ID")
	private Student student;

	public Studentapplication() {
	}

	public int getApplicationId() {
		return this.applicationId;
	}

	public void setApplicationId(int applicationId) {
		this.applicationId = applicationId;
	}

	public Date getAppliedDate() {
		return this.appliedDate;
	}

	public void setAppliedDate(Date appliedDate) {
		this.appliedDate = appliedDate;
	}

	public String getCommunity() {
		return this.community;
	}

	public void setCommunity(String community) {
		this.community = community;
	}

	public String getCourse() {
		return this.course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getDisablility() {
		return this.disablility;
	}

	public void setDisablility(String disablility) {
		this.disablility = disablility;
	}

	public String getFatherName() {
		return this.fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public double getIncome() {
		return this.income;
	}

	public void setIncome(double income) {
		this.income = income;
	}

	public Date getInstituteAcceptedDate() {
		return this.instituteAcceptedDate;
	}

	public void setInstituteAcceptedDate(Date instituteAcceptedDate) {
		this.instituteAcceptedDate = instituteAcceptedDate;
	}

	public Date getMinistryAcceptedDate() {
		return this.ministryAcceptedDate;
	}

	public void setMinistryAcceptedDate(Date ministryAcceptedDate) {
		this.ministryAcceptedDate = ministryAcceptedDate;
	}

	public String getMotherName() {
		return this.motherName;
	}

	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}

	public String getReligion() {
		return this.religion;
	}

	public void setReligion(String religion) {
		this.religion = religion;
	}

	public Date getStateAccepteDdate() {
		return this.stateAccepteDdate;
	}

	public void setStateAccepteDdate(Date stateAccepteDdate) {
		this.stateAccepteDdate = stateAccepteDdate;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public double getTenthPercentage() {
		return this.tenthPercentage;
	}

	public void setTenthPercentage(double tenthPercentage) {
		this.tenthPercentage = tenthPercentage;
	}

	public double getTwelvthPercentage() {
		return this.twelvthPercentage;
	}

	public void setTwelvthPercentage(double twelvthPercentage) {
		this.twelvthPercentage = twelvthPercentage;
	}

	//@JsonIgnore
	public Scheme getScheme() {
		return this.scheme;
	}

	public void setScheme(Scheme scheme) {
		this.scheme = scheme;
	}

	//@JsonIgnore
	public Student getStudent() {
		return this.student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

}