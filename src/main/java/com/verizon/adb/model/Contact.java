package com.verizon.adb.model;

import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

@Entity
@Table(name="contacts")
public class Contact {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long contactId;
	
	
	@NotEmpty(message="first name cannot be empty")
	@Size(min=5,max=15,message="firstName must be of 5 to 15 chars")
	private String firstName;
	
	@NotEmpty(message="lastName cannot be empty")
	@Size(min=5,max=15,message="firstName must be of 5 to 15 chars")
	private String lastName;
	
	@DateTimeFormat(iso=ISO.DATE)
	@NotNull(message="Date of birth cannot be be left blank")
	@Column(name="dob")
	private Date dateOfBirth;
	
	
	public String getFirstName() {
		return firstName;
	}


	public long getContactId() {
		return contactId;
	}


	public void setContactId(long contactId) {
		this.contactId = contactId;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public Date getDateOfBirth() {
		return dateOfBirth;
	}


	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}


	public String getEmailId() {
		return emailId;
	}


	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}


	public String getMobileNumber() {
		return mobileNumber;
	}


	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}


	public Gender getGender() {
		return gender;
	}


	public void setGender(Gender gender) {
		this.gender = gender;
	}


	@NotEmpty(message="Email id can not be null")
	@Email(message="Invalid mail id")
	private String emailId;
	
	@NotEmpty(message="Email id can not be null")
	@Pattern(regexp="\\d{10}",message="mobile no can be only 10 digits")
	@Column(name="mno")
	private String mobileNumber;
	
	
	@Enumerated(EnumType.STRING)	
	private Gender gender;
	

}
