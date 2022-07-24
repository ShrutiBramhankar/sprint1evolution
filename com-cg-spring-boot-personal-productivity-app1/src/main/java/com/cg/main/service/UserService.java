package com.cg.main.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cg.main.model.AppUser;

import com.cg.main.repository.UserRepository;
@Service
public class UserService {

	@Autowired
	UserRepository ur;
	
	
	
	public AppUser saveRegistration(AppUser a) {
		
		return ur.save(a);
	}

	public AppUser getRegistrationDetails(String u, String p) {
	
		return ur.findByUserNameAndPassword(u,p);
	}

	
	
	

}
