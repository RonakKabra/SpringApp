package com.verizon.adb.service;

import com.verizon.adb.model.Contact;

import java.util.List;

public interface ContactService {

	
	Contact getContactById(long contactId);
	List<Contact> getAllContacts();
	
	Contact addContact(Contact contact);
	Contact updateContact(Contact contact);
	boolean deleteContact(long contactId);
	
	boolean existsByMobileNumber(String mobileNumber);
	 boolean existsByEmailId(String emailId);
	 
	 Contact findByMobileNumber(String mobileNumber);
	 Contact findByEmailId(String emailId);
	 
	 List<Contact> findAllByLastName(String lastName);
	
}
