package com.nopanan.registrationservice.controller;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.*;
import java.util.Calendar;

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
			
		User user = accountService.regis(payload);
		user.setPrivilage(accountService.salaryCal(payload));
		user.setRefcode(accountService.refCodeCal(user));
		
		return user;
	}
	
}
