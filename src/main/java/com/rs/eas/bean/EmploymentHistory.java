package com.rs.eas.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class EmploymentHistory {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "eid")
	private int employeeId;

	private String employer;
	private String address;
	private String phoneNumber;
	private String jobTitle;
	private String startDate;
	private String leavingDate;
	private String reasonForLeaving;
	private String refereeName;
	private String refereeJobTitle;
	private String refereePhoneEmail;
	private boolean canContact;
	private String contactDate;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployer() {
		return employer;
	}

	public void setEmployer(String employer) {
		this.employer = employer;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getLeavingDate() {
		return leavingDate;
	}

	public void setLeavingDate(String leavingDate) {
		this.leavingDate = leavingDate;
	}

	public String getReasonForLeaving() {
		return reasonForLeaving;
	}

	public void setReasonForLeaving(String reasonForLeaving) {
		this.reasonForLeaving = reasonForLeaving;
	}

	public String getRefereeName() {
		return refereeName;
	}

	public void setRefereeName(String refereeName) {
		this.refereeName = refereeName;
	}

	public String getRefereeJobTitle() {
		return refereeJobTitle;
	}

	public void setRefereeJobTitle(String refereeJobTitle) {
		this.refereeJobTitle = refereeJobTitle;
	}

	public String getRefereePhoneEmail() {
		return refereePhoneEmail;
	}

	public void setRefereePhoneEmail(String refereePhoneEmail) {
		this.refereePhoneEmail = refereePhoneEmail;
	}

	public boolean isCanContact() {
		return canContact;
	}

	public void setCanContact(boolean canContact) {
		this.canContact = canContact;
	}

	public String getContactDate() {
		return contactDate;
	}

	public void setContactDate(String contactDate) {
		this.contactDate = contactDate;
	}

}
