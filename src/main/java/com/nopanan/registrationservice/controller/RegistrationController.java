package com.nopanan.registrationservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.configurationprocessor.json.JSONException;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nopanan.registrationservice.model.json.User;
import com.nopanan.registrationservice.repository.UserRepo;
import com.nopanan.registrationservice.service.AccountService;

@RestController
public class RegistrationController {
	
	@Autowired
	private AccountService accountService;

	@PostMapping("/registration")
	public User registration(@RequestBody User payload) throws JSONException{
		
//		JSONObject userInfo = new JSONObject(payload);
		
		User user = accountService.regis(payload);
		
		return user;
	}
	
}
