package com.example.demo.layer2.model;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the STUDENT database table.
 * 
 */
@Entity
@NamedQuery(name="Student.findAll", query="SELECT s FROM Student s")
public class Student implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="STUDENT_ID")
	private int studentId;

	@Column(name="AADHAR_NUMBER")
	private String aadharNumber;

	@Column(name="BANK_ACCOUNT_NUMBER")
	private String bankAccountNumber;

	@Column(name="BANK_BALANCE")
	private double bankBalance;

	@Column(name="BANK_IFSC_CODE")
	private String bankIfscCode;

	@Column(name="BANK_NAME")
	private String bankName;

	private String district;

	@Temporal(TemporalType.DATE)
	private Date dob;

	@Column(name="EMAIL_ID")
	private String emailId;

	private String gender;

	@Column(name="MOBILE_NUMBER")
	private String mobileNumber;

	private String password;

	@Column(name="STATE")
	private String state;

	@Column(name="STUDENT_NAME")
	private String studentName;

	//bi-directional many-to-one association to Instituteapplication
	@ManyToOne
	@JoinColumn(name="INSTITUTE_CODE")
	private Instituteapplication instituteapplication;

	//bi-directional many-to-one association to Studentapplication
	@OneToMany(mappedBy="student", fetch=FetchType.EAGER)
	private List<Studentapplication> studentapplications;

	public Student() {
	}

	public int getStudentId() {
		return this.studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getAadharNumber() {
		return this.aadharNumber;
	}

	public void setAadharNumber(String aadharNumber) {
		this.aadharNumber = aadharNumber;
	}

	public String getBankAccountNumber() {
		return this.bankAccountNumber;
	}

	public void setBankAccountNumber(String bankAccountNumber) {
		this.bankAccountNumber = bankAccountNumber;
	}

	public double getBankBalance() {
		return this.bankBalance;
	}

	public void setBankBalance(double bankBalance) {
		this.bankBalance = bankBalance;
	}

	public String getBankIfscCode() {
		return this.bankIfscCode;
	}

	public void setBankIfscCode(String bankIfscCode) {
		this.bankIfscCode = bankIfscCode;
	}

	public String getBankName() {
		return this.bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getDistrict() {
		return this.district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public Date getDob() {
		return this.dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getEmailId() {
		return this.emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getGender() {
		return this.gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getMobileNumber() {
		return this.mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getStudentName() {
		return this.studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	//@JsonIgnore
	public Instituteapplication getInstituteapplication() {
		return this.instituteapplication;
	}

	public void setInstituteapplication(Instituteapplication instituteapplication) {
		this.instituteapplication = instituteapplication;
	}

	@JsonIgnore
	public List<Studentapplication> getStudentapplications() {
		return this.studentapplications;
	}

	public void setStudentapplications(List<Studentapplication> studentapplications) {
		this.studentapplications = studentapplications;
	}

	public Studentapplication addStudentapplication(Studentapplication studentapplication) {
		getStudentapplications().add(studentapplication);
		studentapplication.setStudent(this);

		return studentapplication;
	}

	public Studentapplication removeStudentapplication(Studentapplication studentapplication) {
		getStudentapplications().remove(studentapplication);
		studentapplication.setStudent(null);

		return studentapplication;
	}

}