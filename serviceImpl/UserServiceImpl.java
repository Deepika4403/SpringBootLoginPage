package com.example.LoginPage.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.LoginPage.model.User;
import com.example.LoginPage.repo.UserRepository;
import com.example.LoginPage.service.UserService;



@Service
public class UserServiceImpl implements UserService{
	
	@Autowired 
	private UserRepository repo;
	
	public User login(String username,String password) {
		User user=repo.findByUsernameAndPassword(username,password);
		return user;
	}
	


}
