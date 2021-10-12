package com.example.LoginPage.service;

import com.example.LoginPage.model.User;

public interface UserService {

	User  login(String username, String password);

	User forgot(String username);

}
