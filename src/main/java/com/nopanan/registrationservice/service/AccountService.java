package com.nopanan.registrationservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nopanan.registrationservice.model.db.UserTb;
import com.nopanan.registrationservice.model.json.User;
import com.nopanan.registrationservice.repository.UserRepo;

@Service
public class AccountService {
	
	@Autowired
	private UserRepo userRepo;

	public String salaryCal(User user) {
		if(user.getSalary() < 30000)
		{
			return "Silver";
		}
		else if (user.getSalary() >= 30000 && user.getSalary() <= 50000) {
			return "Gold";
		}
		else
		{
			return "Platinum";
		}
		
	}
	
	public User regis(User user) {
		
		userRepo.saveAndFlush(mappingUser(user));
		
		return user;
	}
	
	private UserTb mappingUser(User user) {
		UserTb tb = new UserTb();
		tb.setUsername(user.getUsername());
		tb.setPassword(user.getPassword());
		tb.setAddress(user.getAddress());
		tb.setPhone(user.getPhone());
		tb.setSalary(user.getSalary());

		return tb;
	}
	
	
	
}
