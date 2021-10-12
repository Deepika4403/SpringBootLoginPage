package com.example.LoginPage.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.LoginPage.model.User;

@Repository("UserRepository")
public interface UserRepository extends JpaRepository<User, Long> {
	
	@Query("SELECT u FROM User u where u.username=:username AND u.password=:password")
	User findByUsernameAndPassword(String username,String password);

	

}
