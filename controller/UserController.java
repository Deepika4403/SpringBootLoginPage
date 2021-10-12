package com.example.LoginPage.controller;

import java.util.Objects;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.LoginPage.model.User;
import com.example.LoginPage.service.UserService;

//import com.example.sample.service.StoreService;

@RestController
@RequestMapping(value="user/management")
public class UserController {
	
	@Autowired private UserService service;
	
	@GetMapping("/login")
	public ModelAndView login() {
		ModelAndView mav=new ModelAndView("login");
		mav.addObject("user",new com.example.LoginPage.model.User());
		return mav;
	}
	
	@PostMapping("/login")
	public String login(@ModelAttribute("user") User user) {
		User ouathUser = null;
		try {
			ouathUser = service.login(user.getUsername(),user.getPassword());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.print(ouathUser);
		if(Objects.nonNull(ouathUser)) {
			return "Welcome to User Management";
		}else {
			return "Incorrect Username/password";
		}
	}
	@GetMapping("/forgot")
	public ModelAndView showForgotPasswordForm() {
		ModelAndView mav=new ModelAndView("forgot");
		mav.addObject("user",new com.example.LoginPage.model.User());
		return mav;
	   // return "forgot_password_form";
	}
	@PostMapping("/forgot")
	public String forgot(@ModelAttribute("user") User user) {
		User ouathUser = null;
		try {
			ouathUser = service.forgot(user.getUsername());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.print(ouathUser);
		if(Objects.nonNull(ouathUser)) {
			return "you can change password";
		}else {
			return "Incorrect Username";
		}
	}
	@GetMapping("/ChangePassword")
	public ModelAndView showChangePasswordForm() {
		ModelAndView mav=new ModelAndView("ChangePassword");
		mav.addObject("user",new com.example.LoginPage.model.User());
		return mav;
	}


	}




