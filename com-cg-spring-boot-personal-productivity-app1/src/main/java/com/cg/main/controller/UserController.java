package com.cg.main.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.main.model.AppUser;
import com.cg.main.model.Task;
import com.cg.main.service.UserService;

@RestController
@RequestMapping("/reg")
public class UserController 
{ 
	@Autowired//atomatic create object 
	UserService us;
	
	//Save Registration details with task of user
	
	@PostMapping("/saveRegistration")
	public AppUser saveRegistration(@RequestBody AppUser a)
	{
		//a.getTask().setUserName(a.getUserName());
		//a.getTask().setPassword(a.getPassword());
		List<Task>l = new ArrayList<>();
		l.addAll(a.getTaskList());
		a.setTaskList(l);
		
		return us.saveRegistration(a);
	}

	//View Registration details by login
	
	@GetMapping("/getregistrationdetails/{username}/{password}")
	public AppUser getRegistrationDetails(@PathVariable("username") String u,@PathVariable("password") String p)
	{
		return us.getRegistrationDetails(u,p);
	}
	
	
	//save task only
	
	@PostMapping("/saveupdated")
	public AppUser saveUpdate(@RequestBody AppUser b)
	{
		
		return us.saveRegistration(b);
	}
}
	
	