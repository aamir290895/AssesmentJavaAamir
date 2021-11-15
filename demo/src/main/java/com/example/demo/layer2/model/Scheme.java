package com.example.demo.layer2.model;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the SCHEME database table.
 * 
 */
@Entity
@NamedQuery(name="Scheme.findAll", query="SELECT s FROM Scheme s")
public class Scheme implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="SCHEME_ID")
	private int schemeId;

	private double amount;

	@Temporal(TemporalType.DATE)
	@Column(name="LAST_DATE_TO_APPLY")
	private Date lastDateToApply;

	@Column(name="SCHEME_NAME")
	private String schemeName;

	//bi-directional many-to-one association to Studentapplication
	@OneToMany(mappedBy="scheme", fetch=FetchType.EAGER)
	private List<Studentapplication> studentapplications;

	public Scheme() {
	}

	public int getSchemeId() {
		return this.schemeId;
	}

	public void setSchemeId(int schemeId) {
		this.schemeId = schemeId;
	}

	public double getAmount() {
		return this.amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public Date getLastDateToApply() {
		return this.lastDateToApply;
	}

	public void setLastDateToApply(Date lastDateToApply) {
		this.lastDateToApply = lastDateToApply;
	}

	public String getSchemeName() {
		return this.schemeName;
	}

	public void setSchemeName(String schemeName) {
		this.schemeName = schemeName;
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
		studentapplication.setScheme(this);

		return studentapplication;
	}

	public Studentapplication removeStudentapplication(Studentapplication studentapplication) {
		getStudentapplications().remove(studentapplication);
		studentapplication.setScheme(null);

		return studentapplication;
	}

}