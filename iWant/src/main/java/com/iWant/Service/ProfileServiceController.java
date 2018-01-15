package com.iWant.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.iWant.repository.Profile;

 

@RestController
@RequestMapping(value="/api")
public class ProfileServiceController {
	@Autowired
	private ProfileService profileService;
	@RequestMapping(method=RequestMethod.GET,value="/addProfile")
	public String addProfile()
	{
		try {
			this.profileService.saveOrUpdate();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "rr";
	}
	@RequestMapping(method=RequestMethod.GET,value="/getProfile")
	public Profile findName()
	{
		return this.profileService.find("Alice");
		
	}
}
