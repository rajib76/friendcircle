package com.iWant.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProfileInterface extends MongoRepository<Profile, String> {
	public Profile findByFirstName(String firstName);
	public List<Profile>findByLastName(String firstName);
	

}
