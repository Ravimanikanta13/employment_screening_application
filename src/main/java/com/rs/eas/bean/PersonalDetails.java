package com.rs.eas.bean;

import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.CollectionTable;
import javax.persistence.ElementCollection;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class PersonalDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int employeeId;
	private String title;
	private String firstName;
	private String middleName;
	private String familyName;
	private String dateOfBirth;
	private boolean hasPreviousName;

	@ElementCollection
	@CollectionTable(name = "PreviousNames", joinColumns = @JoinColumn(name = "employeeid"))
	private List<PreviousName> previousNames;
	private String townOfBirth;
	private String countryOfBirth;
	private String nationality;
	private String motherMaidenName;
	private boolean hasNationalInsuranceNumber;
	private String nationalInsuranceNumber;
	private boolean hasPassport;
	private String passportCountryOfIssue;
	private String passportNumber;
	private boolean hasDrivingLicense;
	private String drivingLicenseCountryOfIssue;
	private String drivingLicenseNumber;

	@OneToOne(cascade = CascadeType.ALL, targetEntity = Declaration.class)
	@JoinColumn(name = "applicant_Id", referencedColumnName = "applicantId")
	private Declaration declaration;

	// To hold address
	@OneToMany(cascade = CascadeType.ALL, targetEntity = Address.class)
	@JoinColumn(name = "addressId", referencedColumnName = "employeeId")
	private Set<Address> address;

	@OneToMany(cascade = CascadeType.ALL, targetEntity = EmploymentHistory.class)
	@JoinColumn(name = "eid", referencedColumnName = "employeeId")
	private Set<EmploymentHistory> employmentHistory;

	@OneToMany(cascade = CascadeType.ALL, targetEntity = EmploymentHistory.class)
	@JoinColumn(name = "qualificationId", referencedColumnName = "employeeId")
	private Set<Qualification> qualification;

	public Declaration getDeclaration() {
		return declaration;
	}

	public void setDeclaration(Declaration declaration) {
		this.declaration = declaration;
	}

	public Set<Address> getAddress() {
		return address;
	}

	public void setAddress(Set<Address> address) {
		this.address = address;
	}

	public Set<EmploymentHistory> getEmploymentHistory() {
		return employmentHistory;
	}

	public void setEmploymentHistory(Set<EmploymentHistory> employmentHistory) {
		this.employmentHistory = employmentHistory;
	}

	public Set<Qualification> getQualification() {
		return qualification;
	}

	public void setQualification(Set<Qualification> qualification) {
		this.qualification = qualification;
	}

	@Embeddable
	public static class PreviousName {

		private String firstName;
		private String middleName;
		private String familyName;
		private String dateOfChange;

		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String getMiddleName() {
			return middleName;
		}

		public void setMiddleName(String middleName) {
			this.middleName = middleName;
		}

		public String getFamilyName() {
			return familyName;
		}

		public void setFamilyName(String familyName) {
			this.familyName = familyName;
		}

		public String getDateOfChange() {
			return dateOfChange;
		}

		public void setDateOfChange(String dateOfChange) {
			this.dateOfChange = dateOfChange;
		}

	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getFamilyName() {
		return familyName;
	}

	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public boolean isHasPreviousName() {
		return hasPreviousName;
	}

	public void setHasPreviousName(boolean hasPreviousName) {
		this.hasPreviousName = hasPreviousName;
	}

	public List<PreviousName> getPreviousNames() {
		return previousNames;
	}

	public void setPreviousNames(List<PreviousName> previousNames) {
		this.previousNames = previousNames;
	}

	public String getTownOfBirth() {
		return townOfBirth;
	}

	public void setTownOfBirth(String townOfBirth) {
		this.townOfBirth = townOfBirth;
	}

	public String getCountryOfBirth() {
		return countryOfBirth;
	}

	public void setCountryOfBirth(String countryOfBirth) {
		this.countryOfBirth = countryOfBirth;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getMotherMaidenName() {
		return motherMaidenName;
	}

	public void setMotherMaidenName(String motherMaidenName) {
		this.motherMaidenName = motherMaidenName;
	}

	public boolean isHasNationalInsuranceNumber() {
		return hasNationalInsuranceNumber;
	}

	public void setHasNationalInsuranceNumber(boolean hasNationalInsuranceNumber) {
		this.hasNationalInsuranceNumber = hasNationalInsuranceNumber;
	}

	public String getNationalInsuranceNumber() {
		return nationalInsuranceNumber;
	}

	public void setNationalInsuranceNumber(String nationalInsuranceNumber) {
		this.nationalInsuranceNumber = nationalInsuranceNumber;
	}

	public boolean isHasPassport() {
		return hasPassport;
	}

	public void setHasPassport(boolean hasPassport) {
		this.hasPassport = hasPassport;
	}

	public String getPassportCountryOfIssue() {
		return passportCountryOfIssue;
	}

	public void setPassportCountryOfIssue(String passportCountryOfIssue) {
		this.passportCountryOfIssue = passportCountryOfIssue;
	}

	public String getPassportNumber() {
		return passportNumber;
	}

	public void setPassportNumber(String passportNumber) {
		this.passportNumber = passportNumber;
	}

	public boolean isHasDrivingLicense() {
		return hasDrivingLicense;
	}

	public void setHasDrivingLicense(boolean hasDrivingLicense) {
		this.hasDrivingLicense = hasDrivingLicense;
	}

	public String getDrivingLicenseCountryOfIssue() {
		return drivingLicenseCountryOfIssue;
	}

	public void setDrivingLicenseCountryOfIssue(String drivingLicenseCountryOfIssue) {
		this.drivingLicenseCountryOfIssue = drivingLicenseCountryOfIssue;
	}

	public String getDrivingLicenseNumber() {
		return drivingLicenseNumber;
	}

	public void setDrivingLicenseNumber(String drivingLicenseNumber) {
		this.drivingLicenseNumber = drivingLicenseNumber;
	}

}
