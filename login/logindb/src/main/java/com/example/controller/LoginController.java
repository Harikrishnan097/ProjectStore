package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.beans.User;
import com.example.service.LoginServiceInter;

@RestController
public class LoginController {

	@Autowired
	LoginServiceInter service1;
	
	@RequestMapping("/login/{username}/{password}")
	public void validationlogin(@PathVariable String username,@PathVariable String  password)
	{
		  if(service1.Validate(username, password)==1) {
			  
		
			  System.out.println("log suxceess");
			  
			  
		  }
		  else
		  {
			  System.out.println("wrong cred");
		  }
		
	}
	/*
	@RequestMapping("/getall")
	public List<User> getProducts()
	{
		
		String username="isu";
		String password="aka";
		if(service1.Validate(username, password)==1) {
	  	return service1.showProducts();
		}
		return null;
		
	
	
}*/
	
	
	
	
}
