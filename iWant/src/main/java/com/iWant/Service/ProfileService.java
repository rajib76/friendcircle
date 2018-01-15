package com.iWant.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iWant.repository.Profile;
import com.iWant.repository.ProfileInterface;

@Service
public class ProfileService  {

	@Autowired
	private ProfileInterface profile;
	private Date dateOfBirth;
	
	public void saveOrUpdate() {
		System.out.println("rajib");
		SimpleDateFormat sdf = new SimpleDateFormat("dd-M-yyyy");
		String dateInString = "22-05-1976";
		try {
			dateOfBirth=sdf.parse(dateInString);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		profile.save(new Profile("Alice","Smith",dateOfBirth));
		
	}
	public Profile find(String firstName) {
		System.out.println("rajib");
		//String firstName = null;
		return profile.findByFirstName(firstName);
		
		
	}

	
	public String getMenu()
	{
		return "This is the Menu";
	}
	


}
