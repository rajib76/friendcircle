package com.iWant.repository;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Document
public class Profile {
	
	@Id
	public String id;
	
	public String firstName;
	public String lastName;
	public Date dateOfBirth;
	
	public Profile(String firstName,String lastName,Date dateOfBirth)
	{
		this.firstName=firstName;
		this.lastName=lastName;
		this.dateOfBirth=dateOfBirth;
	}

}
