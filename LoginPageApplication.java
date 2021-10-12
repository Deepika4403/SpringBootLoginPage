package com.example.LoginPage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages="com.example.LoginPage")
@EnableJpaRepositories(basePackages=("com.example.LoginPage.repo"))
@ComponentScan({"com.example.LoginPage","com.example.LoginPage.config","com.example.LoginPage.controller","com.example.LoginPage.model","com.example.LoginPage.repo","com.example.LoginPage.UserService","com.example.LoginPage.serviceImpl"})
public class LoginPageApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoginPageApplication.class, args);
	}

}
