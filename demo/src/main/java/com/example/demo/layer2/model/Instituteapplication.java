package com.example.demo.layer2.model;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the INSTITUTEAPPLICATION database table.
 * 
 */
@Entity
@NamedQuery(name="Instituteapplication.findAll", query="SELECT i FROM Instituteapplication i")
public class Instituteapplication implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="INSTITUTE_CODE")
	private int instituteCode;

	@Temporal(TemporalType.DATE)
	@Column(name="APPLIED_DATE")
	private Date appliedDate;

	private String city;

	@Column(name="DISE_CODE")
	private int diseCode;

	private String district;

	@Column(name="INSTITUTE_NAME")
	private String instituteName;

	@Temporal(TemporalType.DATE)
	@Column(name="MINISTRY_ACCEPTED_DATE")
	private Date ministryAcceptedDate;

	private String password;

	@Column(name="PIN_CODE")
	private int pinCode;

	private String principal;

	@Temporal(TemporalType.DATE)
	@Column(name="STATE_ACCEPTED_DATE")
	private Date stateAcceptedDate;

	private String status;

	private String telephone;

	@Column(name="UNIVERSITY_NAME")
	private String universityName;

	//bi-directional many-to-one association to Statenodalofficer
	@ManyToOne
	@JoinColumn(name="STATE_NAME")
	private Statenodalofficer statenodalofficer;

	//bi-directional many-to-one association to Student
	@OneToMany(mappedBy="instituteapplication", fetch=FetchType.EAGER)
	private List<Student> students;

	public Instituteapplication() {
	}

	public int getInstituteCode() {
		return this.instituteCode;
	}

	public void setInstituteCode(int instituteCode) {
		this.instituteCode = instituteCode;
	}

	public Date getAppliedDate() {
		return this.appliedDate;
	}

	public void setAppliedDate(Date appliedDate) {
		this.appliedDate = appliedDate;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getDiseCode() {
		return this.diseCode;
	}

	public void setDiseCode(int diseCode) {
		this.diseCode = diseCode;
	}

	public String getDistrict() {
		return this.district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getInstituteName() {
		return this.instituteName;
	}

	public void setInstituteName(String instituteName) {
		this.instituteName = instituteName;
	}

	public Date getMinistryAcceptedDate() {
		return this.ministryAcceptedDate;
	}

	public void setMinistryAcceptedDate(Date ministryAcceptedDate) {
		this.ministryAcceptedDate = ministryAcceptedDate;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getPinCode() {
		return this.pinCode;
	}

	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}

	public String getPrincipal() {
		return this.principal;
	}

	public void setPrincipal(String principal) {
		this.principal = principal;
	}

	public Date getStateAcceptedDate() {
		return this.stateAcceptedDate;
	}

	public void setStateAcceptedDate(Date stateAcceptedDate) {
		this.stateAcceptedDate = stateAcceptedDate;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getTelephone() {
		return this.telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getUniversityName() {
		return this.universityName;
	}

	public void setUniversityName(String universityName) {
		this.universityName = universityName;
	}

	//@JsonIgnore
	public Statenodalofficer getStatenodalofficer() {
		return this.statenodalofficer;
	}

	public void setStatenodalofficer(Statenodalofficer statenodalofficer) {
		this.statenodalofficer = statenodalofficer;
	}

	@JsonIgnore
	public List<Student> getStudents() {
		return this.students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	public Student addStudent(Student student) {
		getStudents().add(student);
		student.setInstituteapplication(this);

		return student;
	}

	public Student removeStudent(Student student) {
		getStudents().remove(student);
		student.setInstituteapplication(null);

		return student;
	}

}